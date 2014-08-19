package jp.momotown;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import jp.momotown.data.GameScheduleData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GameScheduleParser {
	private Calendar calendar;
	private WebDriver webDriver;
	private String baseUrl;

	public GameScheduleParser() {
		this.calendar = Calendar.getInstance();
	}

	private void setUp() {
		this.webDriver = new FirefoxDriver();
		this.baseUrl = "http://www.sanspo.com/baseball/baseball.html";
	}
	
	public List<GameScheduleData> parse(String date) {
		try {
			int year = Integer.parseInt(date.substring(0, 4));
//			System.out.println("year = " + year);
			int month = Integer.parseInt(date.substring(4, 6));
//			System.out.println("month = " + month);
			int dayOfMonth = Integer.parseInt(date.substring(6, 8));
//			System.out.println("dayOfMonth = " + dayOfMonth);
			
			this.calendar.set(year, month-1, dayOfMonth, 0, 0, 0);
		
			setUp();
	
			this.webDriver.get(this.baseUrl);
			this.webDriver.findElement(By.linkText("日程・結果")).click();
			this.webDriver.findElement(By.linkText(month + "月")).click();
			
			List<WebElement> weeksOfMonth = this.webDriver.findElements(By.xpath("//table[@id='sj-SC_central08calendar']/tbody//tr[@class='date']"));
			List<WebElement> gamesOfMonth = this.webDriver.findElements(By.xpath("//table[@id='sj-SC_central08calendar']/tbody//tr[@class='gamesSchedule']"));
	
			// 日付から行(週)、列(日)を決定する
			int indexOfWeek = -1;
			int indexOfDay = -1;
			String targatDay = Integer.toString(this.calendar.get(Calendar.DAY_OF_MONTH));
			for(int i = 0; i < weeksOfMonth.size(); ++i) {
				WebElement week = weeksOfMonth.get(i);
				List<WebElement> days = week.findElements(By.xpath("th"));
				for(int j = 0; j < days.size(); ++j) {
					WebElement day = days.get(j);
					if(targatDay.equals(day.getText())) {
						indexOfWeek = i;
						indexOfDay = j;
						break;
					}
				}
			}
			
			// 指定日のゲームを取得する
			WebElement allGamesOfWeek = gamesOfMonth.get(indexOfWeek);
			List<WebElement> gamesOfWeek = allGamesOfWeek.findElements(By.xpath("td"));
			
			WebElement allGamesOfDay = gamesOfWeek.get(indexOfDay);
			List<WebElement> gamesOfDay = allGamesOfDay.findElements(By.tagName("a"));

			List<GameScheduleData> gameSchedules = new ArrayList<GameScheduleData>();
			for(WebElement game : gamesOfDay) {
				GameScheduleData gameSchedule = makeGameSchedule(game);
				
				gameSchedule.display();
				gameSchedules.add(gameSchedule);
			}
			
			tearDown();
			
			return gameSchedules;
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	private GameScheduleData makeGameSchedule(WebElement element) {
		GameScheduleData gameSchedule = new GameScheduleData();
		
		WebElement dt = element.findElement(By.tagName("dt"));
		String[]  textArray = dt.getText().split(" +", 0);
		if(textArray.length != 5) {
			return null;
		}
		
		try {
			// ビジター
			gameSchedule.setHomeTeam(textArray[0]);
			gameSchedule.setHomeTeamScore(Integer.parseInt(textArray[1]));

			// ホーム
			gameSchedule.setVisitingTeamScore(Integer.parseInt(textArray[3]));
			gameSchedule.setVisitingTeam(textArray[4]);

			// 球場
			WebElement dd = element.findElement(By.tagName("dd"));
			textArray = dd.getText().split(" +", 0);
			if(textArray.length == 2) {
				gameSchedule.setStadium(textArray[0]);
			}
			// 開始時刻
			Calendar calendar = (Calendar) this.calendar.clone();
			String startTime = textArray[1];
			textArray = startTime.split(":", 0);
			if(textArray.length == 2) {
				calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(textArray[0]));
				calendar.set(Calendar.MINUTE, Integer.parseInt(textArray[1]));
			}
			gameSchedule.setCalendar(calendar);
			// リンク
			String link = element.getAttribute("href");
			if(link.isEmpty()) {
				return null;
			}
			gameSchedule.setLink(link);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return null;
		}

		return gameSchedule;
	}
	
	private void tearDown() {
		this.webDriver.quit();
	}
}
