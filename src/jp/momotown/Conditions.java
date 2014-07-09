package jp.momotown;

import java.util.EnumSet;

public class Conditions {
	
	public int inning;
	public InningStatus inningStatus;
	public int balls;
	public int strikes;
	public int outs;
	public boolean[] runners;

	public Conditions() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.inning = 1;
		this.inningStatus = InningStatus.Top;
		this.balls = 0;
		this.strikes = 0;
		this.outs = 0;
		int num = EnumSet.allOf(Base.class).size();
		this.runners = new boolean[num];
	}

}
