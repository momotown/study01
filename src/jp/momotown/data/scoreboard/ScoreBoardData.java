package jp.momotown.data.scoreboard;


public class ScoreBoardData {
	
	public TeamScoreBoardData[] teamScoreBoardDataList = new TeamScoreBoardData[2];

	public ScoreBoardData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public TeamScoreBoardData getTeamScoreBoardData(int index) {
		if(index >= teamScoreBoardDataList.length) {
			return null;
		}
		return teamScoreBoardDataList[index];
	}
	
	public void setTeamScoreBoardData(int index, TeamScoreBoardData data) {
		if(index >= teamScoreBoardDataList.length) {
			return;
		}
		teamScoreBoardDataList[index] = data;
	}
	
	//--------------------
	// 表チーム
	//--------------------
	public void addTopTeamScore(int score, String link) {
		teamScoreBoardDataList[0].addInningScore(score, link);
	}

	public void setTopTeamSum(int sum) {
		teamScoreBoardDataList[0].sum = sum;
	}
	
	public void setTopTeamHits(int hits) {
		teamScoreBoardDataList[0].hits = hits;
	}
	
	public void setTopTeamErrors(int errors) {
		teamScoreBoardDataList[0].errors = errors;
	}
	
	//--------------------
	// 裏チーム
	//--------------------
	public void addBottomTeamScore(int score, String link) {
		teamScoreBoardDataList[1].addInningScore(score, link);
	}

	public void setBottomTeamSum(int sum) {
		teamScoreBoardDataList[1].sum = sum;
	}
	
	public void setBottomTeamHits(int hits) {
		teamScoreBoardDataList[1].hits = hits;
	}
	
	public void setBottomTeamErrors(int errors) {
		teamScoreBoardDataList[1].errors = errors;
	}

	public void display() {
		for(int i = 0; i < teamScoreBoardDataList.length; ++i) {
			System.out.println(String.format("team %d", i));
			teamScoreBoardDataList[i].display();
		}
	}

}
