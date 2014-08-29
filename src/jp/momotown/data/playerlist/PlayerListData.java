package jp.momotown.data.playerlist;

import jp.momotown.data.TopBottom;

public class PlayerListData {
	
	public TeamPlayerListData[] teamPlayerList;

	public PlayerListData() {
		teamPlayerList = new TeamPlayerListData[TopBottom.NUM];
	}
	
	public void setTeamPlayerList(TopBottom tb, TeamPlayerListData data) {

		teamPlayerList[tb.getId()] = data;
	}
	
	public void display() {
		for(int i = 0; i < teamPlayerList.length; ++i) {
			System.out.println(String.format("team %d", i+1));
			teamPlayerList[i].display();
		}
	}

}
