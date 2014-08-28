package jp.momotown.data.scoreboard;


public class ScoreBoardData {
	
	public TeamScoreBoardData[] teamScoreBoardDataList = new TeamScoreBoardData[2];

	public ScoreBoardData() {
		teamScoreBoardDataList = new TeamScoreBoardData[2];
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
	
	public void display() {
		for(int i = 0; i < teamScoreBoardDataList.length; ++i) {
			System.out.println(String.format("team %d", i+1));
			teamScoreBoardDataList[i].display();
		}
	}

}
