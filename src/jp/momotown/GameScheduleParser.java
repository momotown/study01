package jp.momotown;

import java.util.Calendar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// カレンダー内の１試合を解析する
public class GameScheduleParser {
	
	private Calendar calendar;

	public GameScheduleParser(Calendar calendar) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.calendar = calendar;
	}
	
	public GameSchedule parse(WebElement game) {

		WebElement dt = game.findElement(By.tagName("dt"));
//		System.out.println(String.format("dt : %s", dt.getText()));
		String[]  textArray = dt.getText().split(" +", 0);
//		System.out.println(String.format("array : %s", textArray));
		if(textArray.length != 5) {
			return null;
		}
		
		GameSchedule gameSchedule = new GameSchedule();
		
		try {
			// ホーム
//			for(int i = 0; i < Constants.TEAM.length; ++i) {
//				if(Constants.TEAM[i].getShortName().contentEquals(textArray[0])) {
//					gameSchedule.setHomeTeam(Constants.TEAM[i]);
//					break;
//				}
//			}
			gameSchedule.setHomeTeam(Constants.TEAM_TBL.getTeamByNameS(textArray[0]));
			// スコア
			Score score = new Score(Integer.parseInt(textArray[3]), Integer.parseInt(textArray[1]));
			// ビジター
			gameSchedule.setScore(score);
//			for(int i = 0; i < Constants.TEAM.length; ++i) {
//				if(Constants.TEAM[i].getShortName().contentEquals(textArray[4])) {
//					gameSchedule.setVisitingTeam(Constants.TEAM[i]);
//					break;
//				}
//			}
			gameSchedule.setVisitingTeam(Constants.TEAM_TBL.getTeamByNameS(textArray[4]));
//			int homeTeam = Integer.parseInt(textArray);
//			System.out.println("year = " + year);
//			int month = Integer.parseInt(date.substring(4, 6));
//			System.out.println("month = " + month);
//			int dayOfMonth = Integer.parseInt(date.substring(6, 8));
//			System.out.println("dayOfMonth = " + dayOfMonth);
			
//			m_calendar.set(year, month-1, dayOfMonth, 0, 0, 0);
			
//			displayCalendar();
			// 球場
			WebElement dd = game.findElement(By.tagName("dd"));
			textArray = dd.getText().split(" +", 0);
			if(textArray.length == 2) {
				gameSchedule.setField(textArray[0]);
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
			String link = game.getAttribute("href");
			if(link.isEmpty()) {
				return null;
			}
			gameSchedule.setDetailLink(link);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		return gameSchedule;
	}

}
