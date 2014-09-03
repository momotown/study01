package jp.momotown.data.batterbox;

public class PitchingBallData {
	
	public int pitches;
	public String result;
	public String kind;
	public int speed;

	public PitchingBallData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setPitches(int pitches) {
		
		this.pitches = pitches;
	}
	
	public void setResult(String result) {
		
		this.result = result;
	}
	
	public void setKind(String kind) {
		
		this.kind = kind;
	}
	
	public void setSpeed(int speed) {
		
		this.speed = speed;
	}

	public void display() {
		
		System.out.println(String.format("%d球目", pitches));
		System.out.println(result);
		System.out.println(kind);
		System.out.println(String.format("%dkm/h", speed));
	}

}
