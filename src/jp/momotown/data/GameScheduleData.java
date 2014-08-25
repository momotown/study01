package jp.momotown.data;

import java.util.Calendar;
import java.util.Locale;

public class GameScheduleData {

	private Calendar calendar;				// 日付
	private String homeTeam;					// ホームチーム
	private String visitingTeam;			// ビジターチーム
	private String stadium;					// スタジアム
	private int homeTeamScore;				// ホームチームスコア
	private int visitingTeamScore;		// ビジターチームスコア
	private String link;							// ゲーム詳細リンク

	public GameScheduleData() {
		this.calendar = Calendar.getInstance();
		this.homeTeam ="";
		this.visitingTeam = "";
		this.stadium = "";
		this.homeTeamScore = 0;
		this.visitingTeamScore = 0;
		this.link = "";
	}
	
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public void setHomeTeam(String team) {
		this.homeTeam = team;
	}
	
	public void setVisitingTeam(String team) {
		this.visitingTeam = team;
	}
	
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	
	public void setHomeTeamScore(int score) {
		this.homeTeamScore = score;
	}
	
	public void setVisitingTeamScore(int score) {
		this.visitingTeamScore = score;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getLink() {
		return this.link;
	}

	public void display() {
		displayCalendar();
		System.out.println(String.format("%s %d - %d %s",
				this.homeTeam,
				this.homeTeamScore,
				this.visitingTeamScore,
				this.visitingTeam));
		System.out.println(this.stadium);
		System.out.println(this.link);
	}
	
	private void displayCalendar() {
		int year = this.calendar.get(Calendar.YEAR);
	    int month = this.calendar.get(Calendar.MONTH) + 1;
	    int day = this.calendar.get(Calendar.DATE);
	    int hour = this.calendar.get(Calendar.HOUR_OF_DAY);
	    int minute = this.calendar.get(Calendar.MINUTE);
	    int second = this.calendar.get(Calendar.SECOND);
	    String weekDisplayName = this.calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.JAPAN);

	    System.out.println(String.format("%d年%d月%d日(%s) %d:%02d.%02d",
	    		year,
	    		month,
	    		day,
	    		weekDisplayName.toString(),
	    		hour,
	    		minute,
	    		second));
	}

}
