package jp.momotown;

import java.util.ArrayList;

// スコアボードの上下半分を担当する
public class TeamScoreBoard {
	
	Team team;
	ArrayList<InningScore> inningScoreList;
	int runs;
	int hits;
	int errors;

	public TeamScoreBoard(Team team) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.team = team;
		this.runs = 0;
		this.hits = 0;
		this.errors = 0;
	}

}
