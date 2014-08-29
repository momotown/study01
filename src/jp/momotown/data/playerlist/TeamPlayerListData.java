package jp.momotown.data.playerlist;

import java.util.ArrayList;
import java.util.List;

public class TeamPlayerListData {

	public String teamName;
	public List<PlayerData> playerDataList;

	public TeamPlayerListData(String teamName) {
		this.teamName = teamName;
		playerDataList = new ArrayList<PlayerData>();
	}

	public void addPlayer(String position, String name) {
		PlayerData playerData = new PlayerData(position, name);
		playerDataList.add(playerData);
	}
	
	public void display() {
		
		System.out.println(teamName);
		
		int no = 1;
		for(PlayerData playerData : playerDataList) {
			System.out.println(String.format("no. %d", no));
			playerData.display();
			++no;
		}
	}

}
