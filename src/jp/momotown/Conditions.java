package jp.momotown;

import java.util.EnumSet;

public class Conditions {
	
	public int inning;					// イニング
	public InningStatus inningStatus;	// 表/裏
	public int balls;					// ボールカウント
	public int strikes;					// ストライクカウント
	public int outs;					// アウトカウント
	public boolean[] runners;			// ランナー

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
