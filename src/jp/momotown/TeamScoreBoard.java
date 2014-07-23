package jp.momotown;

import java.util.List;
import java.util.ArrayList;

import jp.momotown.table.Team;

// スコアボードの上下半分を担当する
public class TeamScoreBoard {
	
	Team team;
	List<InningScore> inningScoreList;
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
