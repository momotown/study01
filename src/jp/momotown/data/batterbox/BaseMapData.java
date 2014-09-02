package jp.momotown.data.batterbox;

import jp.momotown.data.Base;

public class BaseMapData {

	public boolean[] runners = new boolean[Base.NUM];

	public BaseMapData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void display() {
		
		for(int i = 0; i < Base.NUM; ++i) {
			
			if(runners[i]) {
				System.out.println("○");
			} else {
				System.out.println("×");
			}
		}
	}

}
