package jp.momotown;

import java.util.Calendar;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
		
		for(int i = 0; i < 6; i++) {
			
		}

/*
 * //table[@id='sj-SC_central03calendar']/tbody/tr[1]		// 列ヘッダだな
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[1]	// 1週目の日曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[2]	// 1週目の月曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[3]	// 1週目の火曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[2]/th[4]	// 1週目の水曜日の日
 * //table[@id='sj-SC_central03calendar']/tbody/tr[3]		// 1週目の内容
*/
		
		tearDown();
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
