package jp.momotown;

import java.util.ArrayList;

public class BattingOrder {
	
	private Team team;
	private ArrayList<Player> playerList;

	public BattingOrder(Team team) {
		this.team = team;
		this.playerList = new ArrayList<Player>();
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
