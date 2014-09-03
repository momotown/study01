package jp.momotown.data.batterbox;

import jp.momotown.data.Base;
import jp.momotown.data.InningStatus;

public class ConditionData {
	
	public InningScoreData inningScoreData;
	public BaseMapData baseMapData;
	
	public ConditionData() {
	}
	
	public void setInningScoreData(InningScoreData data) {

		inningScoreData = data;
	}
	
	public void setBaseMapData(BaseMapData data) {

		baseMapData = data;
	}
	
	public void display() {
		
		inningScoreData.display();
		baseMapData.display();
	}

}
