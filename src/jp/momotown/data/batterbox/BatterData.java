package jp.momotown.data.batterbox;

public class BatterData {

	public String name;
	public int atBats;
	public int hits;
	public float average;
	public int homeRuns;
	public int runsBattedIn;

	public BatterData(String name) {

		this.name = name;
	}

	public void setStatsToday(int atBats, int hits) {
		
		this.atBats = atBats;
		this.hits = hits;
	}

	public void setStatsSeason(float average, int homeRuns, int runsBattedIn) {
		
		this.average = average;
		this.homeRuns = homeRuns;
		this.runsBattedIn = runsBattedIn;
	}

	public void display() {
		
		System.out.println(name);
		System.out.println(String.format("%d打数%d安打", atBats, hits));
		System.out.println(String.format("%.03f 本%d 打%d", average, homeRuns, runsBattedIn));
	}
}
