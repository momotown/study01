package jp.momotown;

import java.util.Calendar;

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
	
	public void setHomeTeam(Team team) {
		this.homeTeam = team;
	}
	
	public void setVisitingTeam(Team team) {
		this.visitingTeam = team;
	}
	
	public void setField(String field) {
		this.field = field;
	}
	
	public void setScore(int home, int visitting) {
		this.score.set(home, visitting);
	}
	
	public void setDetailLink(String link) {
		this.detailLink = link;
	}

	public void display() {
		System.out.println(String.format("%s %d - %d %s",
				this.homeTeam.getShortName(),
				this.score.getBottom(),
				this.score.getTop(),
				this.visitingTeam.getShortName()));
		System.out.println(this.field);
		System.out.println(this.detailLink);
	}
}
