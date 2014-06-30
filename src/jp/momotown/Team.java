package jp.momotown;

public final class Team {
	
	private final String longName;
	private final String shortName;
	private final String field;
	private final League league;
	
	public Team() {
		
		this.longName = "";
		this.shortName = "";
		this.field = "";
		this.league = League.UNKNOWN;
	}

	public Team(String longName, String shortName, String field, League league) {

		this.longName = longName;
		this.shortName = shortName;
		this.field = field;
		this.league = league;
	}
	
	public String getLongName() {
		return longName;
	}
	
	public String getShortName() {
		return shortName;
	}
	
	public String getField() {
		return field;
	}
	
	public League getLeague() {
		return league;
	}
}
