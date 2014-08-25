package jp.momotown.data.scoreboard;

public class InningScoreData {

	public int score;
	public String link;

	public InningScoreData() {
		this.score = 0;
		this.link = "";
	}

	public InningScoreData(int score, String link) {
		this.score = score;
		this.link = link;
	}
}
