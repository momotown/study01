package jp.momotown;

public class Pitch {
	
//	こういうクラスを作るか？
//		private Team team;
//		private List<Player> playerList;
	
	private BattingOrder[] battingOrder = new BattingOrder[InningStatus.Num.ordinal()];
	
	private String Pitcher; // 投手、球数、今期成績
	private String Catcher; // 捕手
//	Private Conditions conditions;　// 1回表、BSO、ランナー
//	Private　PitchingBall pitchingBall; // 球数、結果、球種、球速
	private String Batter; // 打者、本日、今季成績
//	private PitchesMap pitchesMap; // 打席(右or左)、ボール座標
//	private History history; // pitchinBallを蓄積すればいらないかも
	
	
	// PlayerList ×2

	public Pitch() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

}
