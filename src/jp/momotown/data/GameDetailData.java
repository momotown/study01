package jp.momotown.data;

import jp.momotown.data.batterbox.BatterBoxLiveData;
import jp.momotown.data.playerlist.PlayerListData;
import jp.momotown.data.scoreboard.ScoreBoardData;

public class GameDetailData {
	
	public ScoreBoardData scoreBoardData;
	public PlayerListData playerListData;
	public BatterBoxLiveData batterBoxLiveData;

	public GameDetailData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void setScoreBoardData(ScoreBoardData data) {
		
		scoreBoardData = data;
	}

	public ScoreBoardData getScoreBoardData() {
		
		return scoreBoardData;
	}
	
	public void setPlayerListData(PlayerListData data) {
		
		playerListData = data;
	}
	
	public PlayerListData getPlayerListData() {
		
		return playerListData;
	}
	
	public void setBatterBoxLiveData(BatterBoxLiveData data) {
		
		batterBoxLiveData = data;
	}
	
	public BatterBoxLiveData getBatterBoxLiveData() {
		
		return batterBoxLiveData;
	}
	
	public void display() {
		
		scoreBoardData.display();
		playerListData.display();
		batterBoxLiveData.display();
	}

}
