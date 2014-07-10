package jp.momotown;

public class Pitch {
	
	private BattingOrder[] battingOrder = new BattingOrder[2];
	
	
	private Pitcher pitcher; 			// 投手
	private Catcher catcher;			// 捕手
	private Conditions conditions;		// 1回表、BSO、ランナー
	private PitchingBall pitchingBall;	// 球数、結果、球種、球速
	private Batter batter; 				// 打者
//	private PitchesMap pitchesMap; // 打席(右or左)、ボール座標
//	private History history; // pitchinBallを蓄積すればいらないかも
	
	
	// PlayerList ×2

	public Pitch() {
		// TODO 自動生成されたコンストラクター・スタブ
		InningStatus status = InningStatus.Bottom;
		switch(status) {
		case Top:
		}
	}

}
