package jp.momotown;

import java.util.List;
import java.util.ArrayList;

public class BattingOrder {
	
	private Team team;
	private List<Player> playerList;

	public BattingOrder() {
		this.playerList = new ArrayList<Player>();
	}
	
	public void setTeam(Team team) {
		this.team = team;
	}
	
	public Team getTeam() {
		return this.team;
	}

	public void addPlayer(Player player) {
		this.playerList.add(player);
	}
	
	public void setPlayer(int index, Player player) {
		this.playerList.set(index, player);
	}
}
