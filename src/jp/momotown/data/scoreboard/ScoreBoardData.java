package jp.momotown.data.scoreboard;

import jp.momotown.data.TopBottom;


public class ScoreBoardData {
	
	public final TeamScoreBoardData[] teamScoreBoardDataList= new TeamScoreBoardData[TopBottom.NUM];

	public ScoreBoardData() {
	}
	
	public TeamScoreBoardData getTeamScoreBoardData(TopBottom tb) {
		return teamScoreBoardDataList[tb.getId()];
	}
	
	public void setTeamScoreBoardData(TopBottom tb, TeamScoreBoardData data) {
		teamScoreBoardDataList[tb.getId()] = data;
	}
	
	public void display() {
		for(int i = 0; i < teamScoreBoardDataList.length; ++i) {
			System.out.println(String.format("team %d", i+1));
			teamScoreBoardDataList[i].display();
		}
	}

}
