package jp.momotown;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SanspoBaseballCalendarParser {
	private Calendar m_calendar;
	private WebDriver m_webDriver;
	private String m_baseUrl;

	public SanspoBaseballCalendarParser() {
		m_calendar = Calendar.getInstance();
	}

	private void setUp() {
		m_webDriver = new FirefoxDriver();
		m_baseUrl = "http://www.sanspo.com/baseball/baseball.html";
	}
	
	public boolean parse(String date) {
		try {
			int year = Integer.parseInt(date.substring(0, 4));
//			System.out.println("year = " + year);
			int month = Integer.parseInt(date.substring(4, 6));
//			System.out.println("month = " + month);
			int dayOfMonth = Integer.parseInt(date.substring(6, 8));
//			System.out.println("dayOfMonth = " + dayOfMonth);
			
			m_calendar.set(year, month-1, dayOfMonth, 0, 0, 0);
			
			displayCalendar();
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		setUp();

		m_webDriver.get(m_baseUrl);
		m_webDriver.findElement(By.linkText("日程・結果")).click();
		m_webDriver.findElement(By.linkText((m_calendar.get(Calendar.MONTH) + 1) + "月")).click();
		
		/*
 * //table[@id='sj-SC_central03calendar']/tbody/tr[1]		// 列ヘッダだな
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[1]	// 1週目の日曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[2]	// 1週目の月曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[3]	// 1週目の火曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[4]	// 1週目の水曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[3]		// 1週目の内容
*/
		
		List<WebElement> weeksOfMonth = m_webDriver.findElements(By.xpath("//table[@id='sj-SC_central03calendar']/tbody//tr[@class='date']"));
		List<WebElement> gamesOfMonth = m_webDriver.findElements(By.xpath("//table[@id='sj-SC_central03calendar']/tbody//tr[@class='gamesSchedule']"));

		/*
		int i = 0;
		for(WebElement date : dates) {
			System.out.println(String.format("LIST[%d] : %s", i, date.getText()));
			++i;
		}
		*/
		
		int indexOfWeek = -1;
		int indexOfDay = -1;
		String targatDay = Integer.toString(m_calendar.get(Calendar.DAY_OF_MONTH));
		for(int i = 0; i < weeksOfMonth.size(); ++i) {
			WebElement week = weeksOfMonth.get(i);
			List<WebElement> days = week.findElements(By.xpath("th"));
			for(int j = 0; j < days.size(); ++j) {
				WebElement day = days.get(j);
//				System.out.println(String.format("weeks[%d][%d] : %s", i, j, day.getText()));
				if(targatDay.equals(day.getText())) {
					indexOfWeek = i;
					indexOfDay = j;
				}
			}
		}
		
		WebElement allGamesOfWeek = gamesOfMonth.get(indexOfWeek);
//		System.out.println(String.format("gamesOfMonth[%d] : %s", indexOfWeek, allGamesOfWeek.getText()));
		List<WebElement> gamesOfWeek = allGamesOfWeek.findElements(By.xpath("td"));
//		System.out.println(String.format("gamesOfWeek : %s", gamesOfWeek.getText());
		WebElement allGamesOfDay = gamesOfWeek.get(indexOfDay);
//		System.out.println(String.format("gamesOfDay[%d] : %s", indexOfDay, gamesOfDay.getText()));
		List<WebElement> gamesOfDay = allGamesOfDay.findElements(By.tagName("a"));
		
		SanspoBaseballGameParser gameParser = new SanspoBaseballGameParser();
		
		for(WebElement game : gamesOfDay) {
			
			GameSchedule gameSchedule = gameParser.parse(game);
			
			parseGame(game);
			String text = game.getText();
			String[]  array = text.split("[ \n]", 0);
			System.out.println(String.format("array : %s", array));
			System.out.println(String.format("game : %s", game.getText()));
			System.out.println(String.format("href : %s", game.getAttribute("href")));
		}
		
		tearDown();
		return true;
	}
	
	private boolean parseGame(WebElement game) {
		String href = game.getAttribute("href");
		WebElement dt = game.findElement(By.tagName("dt"));
		System.out.println(String.format("dt : %s", dt.getText()));
		String[]  array = dt.getText().split(" +", 0);
		if(array.length == 5) {
			
		}
		System.out.println(String.format("array : %s", array));
		List<WebElement> scores = dt.findElements(By.className("fin_sc"));
		for(WebElement score : scores) {
			System.out.println(String.format("score : %s", score.getText()));
		}
		WebElement dd = game.findElement(By.tagName("dd"));
		return true;
	}
	
	private void tearDown() {
		m_webDriver.quit();
	}
	
	private void displayCalendar() {
		int year = m_calendar.get(Calendar.YEAR);
	    int month = m_calendar.get(Calendar.MONTH) + 1;
	    int day = m_calendar.get(Calendar.DATE);
	    int hour = m_calendar.get(Calendar.HOUR_OF_DAY);
	    int minute = m_calendar.get(Calendar.MINUTE);
	    int second = m_calendar.get(Calendar.SECOND);
	    String weekDisplayName = m_calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.JAPAN);

	    System.out.println("設定されている日時は");
	    System.out.println(year + "年" + month + "月" + day + "日");
	    System.out.println("(" + weekDisplayName + ")");
	    System.out.println(hour + "時" + minute + "分" + second + "秒");
	}
}
