package jp.momotown.data.scoreboard;

import java.util.ArrayList;
import java.util.List;

public class TeamScoreBoardData {
	
	public List<InningScoreData> inningScoreDataList = new ArrayList<InningScoreData>();
	public int sum;
	public int hits;
	public int errors;

	public TeamScoreBoardData() {
		this.sum = 0;
		this.hits = 0;
		this.errors = 0;
	}

	public void addInningScore(int score, String link) {
		InningScoreData ininngScore = new InningScoreData(score, link);
		this.inningScoreDataList.add(ininngScore);
	}
	
}
