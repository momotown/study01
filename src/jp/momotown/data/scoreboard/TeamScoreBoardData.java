package jp.momotown.data.scoreboard;

import java.util.ArrayList;
import java.util.List;

public class TeamScoreBoardData {
	
	public List<InningScoreData> inningScoreDataList;
	public int sum;
	public int hits;
	public int errors;

	public TeamScoreBoardData() {
		
		inningScoreDataList = new ArrayList<InningScoreData>();
		sum = 0;
		hits = 0;
		errors = 0;
	}

	public void addInningScore(int score, String link) {
		
		InningScoreData ininngScore = new InningScoreData(score, link);
		this.inningScoreDataList.add(ininngScore);
	}
	
	public InningScoreData getInningScoreData(int inningNo) {
		
		try {
			return inningScoreDataList.get(inningNo - 1);
		} catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	
	public void display() {
		for(int i = 0; i < inningScoreDataList.size(); ++i) {
			System.out.println(String.format("inning %d", i));
			inningScoreDataList.get(i).display();
		}
	}

}
