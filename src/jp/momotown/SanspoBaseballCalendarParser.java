package jp.momotown;

import java.util.ArrayList;
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
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return false;
		}
		
		setUp();

		m_webDriver.get(m_baseUrl);
		m_webDriver.findElement(By.linkText("日程・結果")).click();
		m_webDriver.findElement(By.linkText((m_calendar.get(Calendar.MONTH) + 1) + "月")).click();
		
		List<WebElement> weeksOfMonth = m_webDriver.findElements(By.xpath("//table[@id='sj-SC_central03calendar']/tbody//tr[@class='date']"));
		List<WebElement> gamesOfMonth = m_webDriver.findElements(By.xpath("//table[@id='sj-SC_central03calendar']/tbody//tr[@class='gamesSchedule']"));

		// 日付から行、列を決定する
		int indexOfWeek = -1;
		int indexOfDay = -1;
		String targatDay = Integer.toString(m_calendar.get(Calendar.DAY_OF_MONTH));
		for(int i = 0; i < weeksOfMonth.size(); ++i) {
			WebElement week = weeksOfMonth.get(i);
			List<WebElement> days = week.findElements(By.xpath("th"));
			for(int j = 0; j < days.size(); ++j) {
				WebElement day = days.get(j);
				if(targatDay.equals(day.getText())) {
					indexOfWeek = i;
					indexOfDay = j;
				}
			}
		}
		
		WebElement allGamesOfWeek = gamesOfMonth.get(indexOfWeek);
		List<WebElement> gamesOfWeek = allGamesOfWeek.findElements(By.xpath("td"));
		WebElement allGamesOfDay = gamesOfWeek.get(indexOfDay);
		List<WebElement> gamesOfDay = allGamesOfDay.findElements(By.tagName("a"));
		
		SanspoBaseballGameParser gameParser = new SanspoBaseballGameParser();
		
		List<GameSchedule> gameSchedules = new ArrayList<GameSchedule>();
		for(WebElement game : gamesOfDay) {
			GameSchedule gameSchedule = gameParser.parse(m_calendar, game);
			gameSchedule.display();
			gameSchedules.add(gameSchedule);
		}
		
		tearDown();
		
		return true;
	}
	
	private void tearDown() {
		m_webDriver.quit();
	}
}
