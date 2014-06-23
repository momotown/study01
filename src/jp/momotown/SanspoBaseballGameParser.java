package jp.momotown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SanspoBaseballGameParser {

	public SanspoBaseballGameParser() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public GameSchedule parse(WebElement game) {
		String gameDetailLink = game.getAttribute("href");
		if(gameDetailLink.isEmpty()) {
			return null;
		}
		WebElement dt = game.findElement(By.tagName("dt"));
//		System.out.println(String.format("dt : %s", dt.getText()));
		String[]  textArray = dt.getText().split(" +", 0);
//		System.out.println(String.format("array : %s", textArray));
		if(textArray.length != 5) {
			return null;
		}
		
		GameSchedule gameSchedule = new GameSchedule();
		
		try {
			for(int i = 0; i < Constants.TEAM.length; ++i) {
				if(Constants.TEAM[i].getShortName().contentEquals(textArray[0])) {
					gameSchedule
				}
			}
			int homeTeam = Integer.parseInt(textArray);
//			System.out.println("year = " + year);
			int month = Integer.parseInt(date.substring(4, 6));
//			System.out.println("month = " + month);
			int dayOfMonth = Integer.parseInt(date.substring(6, 8));
//			System.out.println("dayOfMonth = " + dayOfMonth);
			
			m_calendar.set(year, month-1, dayOfMonth, 0, 0, 0);
			
			displayCalendar();
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		GameSchedule gameSchedule = new GameSchedule();
		List<WebElement> scores = dt.findElements(By.className("fin_sc"));
		for(WebElement score : scores) {
			System.out.println(String.format("score : %s", score.getText()));
		}
		WebElement dd = game.findElement(By.tagName("dd"));
		return gameSchedule;
	}

}
