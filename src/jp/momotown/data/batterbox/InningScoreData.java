package jp.momotown.data.batterbox;

import jp.momotown.data.InningStatus;

public class InningScoreData {

	public int inningNo;
	public InningStatus inningStatus;
	public int balls;
	public int strikes;
	public int outs;

	public InningScoreData() {

		inningStatus = InningStatus.TOP;
	}

	public InningScoreData(int inningNo, InningStatus inningStatus) {

		this.inningNo = inningNo;
		this.inningStatus = inningStatus;
	}

	public void setCount(int balls, int strikes, int outs) {
		
		this.balls = balls;
		this.strikes = strikes;
		this.outs = outs;
	}

	public void display() {
		
		System.out.println(String.format("%d回%s", inningNo, inningStatus.getName()));
		System.out.println(String.format("B : %d", balls));
		System.out.println(String.format("S : %d", strikes));
		System.out.println(String.format("O : %d", outs));
	}

}
