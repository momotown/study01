package jp.momotown;

import java.util.Calendar;
import java.util.Locale;

public class GameSchedule {
	
	private Calendar calendar;
	private Team homeTeam;
	private Team visitingTeam;
	private String field;
	private Score score;
	private String detailLink;

	public GameSchedule() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	public void setHomeTeam(Team team) {
		this.homeTeam = team;
	}
	
	public void setVisitingTeam(Team team) {
		this.visitingTeam = team;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public void setScore(Score score) {
		this.score = score;
	}
	
	public void setDetailLink(String link) {
		this.detailLink = link;
	}
	
	public String getDetailLink() {
		return this.detailLink;
	}

	public void display() {
		displayCalendar();
		System.out.println(String.format("%s %d - %d %s",
				this.homeTeam.getShortName(),
				this.score.getBottom(),
				this.score.getTop(),
				this.visitingTeam.getShortName()));
		System.out.println(this.field);
		System.out.println(this.detailLink);
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
