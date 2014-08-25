package jp.momotown.data.scoreboard;


public class ScoreBoardData {
	
	public TeamScoreBoardData teamScoreBoardData[] = new TeamScoreBoardData[2];

	public ScoreBoardData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	//--------------------
	// 表チーム
	//--------------------
	public void addTopTeamScore(int score, String link) {
		teamScoreBoardData[0].addInningScore(score, link);
	}

	public void setTopTeamSum(int sum) {
		teamScoreBoardData[0].sum = sum;
	}
	
	public void setTopTeamHits(int hits) {
		teamScoreBoardData[0].hits = hits;
	}
	
	public void setTopTeamErrors(int errors) {
		teamScoreBoardData[0].errors = errors;
	}
	
	//--------------------
	// 裏チーム
	//--------------------
	public void addBottomTeamScore(int score, String link) {
		teamScoreBoardData[1].addInningScore(score, link);
	}

	public void setBottomTeamSum(int sum) {
		teamScoreBoardData[1].sum = sum;
	}
	
	public void setBottomTeamHits(int hits) {
		teamScoreBoardData[1].hits = hits;
	}
	
	public void setBottomTeamErrors(int errors) {
		teamScoreBoardData[1].errors = errors;
	}

}
