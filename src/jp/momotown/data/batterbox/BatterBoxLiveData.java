package jp.momotown.data.batterbox;

public class BatterBoxLiveData {
	
	public PitcherData pitcherData;
	public CatcherData catcherData;
	public ConditionData conditionData;
	public PitchingBallData pitchingBallData;
	public BatterData batterData;
	public PitchesMapData pitchesMapData;

	public BatterBoxLiveData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void setPitcherData(PitcherData data) {
		pitcherData = data;
	}
	
	public void setCatcherData(CatcherData data) {
		catcherData = data;
	}
	
	public void setConditionData(ConditionData data) {
		conditionData = data;
	}
	
	public void setPitchingBallData(PitchingBallData data) {

		pitchingBallData = data;
	}
	
	public void display() {
		
		pitcherData.display();
		catcherData.display();
		conditionData.display();
		pitchingBallData.display();
	}

}
