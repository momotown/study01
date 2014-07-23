package jp.momotown.table;

import java.util.ArrayList;
import java.util.List;

public class TeamTable {
	
	protected List<Team> teamList;

	public TeamTable() {
		this.teamList = new ArrayList<Team>();
	}

	public void add(Team team) {
		this.teamList.add(team);
	}
	
	public Team getTeamByID(int id) {
		for(Team team : teamList) {
			if(id == team.id) {
				return team;
			}
		}
		
		return null;
	}
}
