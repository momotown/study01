package jp.momotown.data.batterbox;

public class PitcherData {
	
	public String name;
	public int pitches;
	public int wins;
	public int losses;
	public int saves;

	public PitcherData(String name) {

		this.name = name;
	}
	
	public void setPitches(int pitches) {
		
		this.pitches = pitches;
	}
	
	public void setScore(int wins, int losses, int saves) {
		
		this.wins = wins;
		this.losses = losses;
		this.saves = saves;
	}
	
	public void display() {
		
		System.out.println(name);
		System.out.println(String.format("%d球", pitches));
		System.out.println(String.format("%d勝%d敗%dS",
				wins,
				losses,
				saves));
	}

}
