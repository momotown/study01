package jp.momotown.data.batterbox;

import jp.momotown.data.Base;

public class BaseMapData {

	public boolean[] runners = new boolean[Base.NUM];

	public BaseMapData() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void display() {
		
		for(int i = 0; i < Base.NUM; ++i) {
			Base base = Base.valuesOf(i);
			
			String value = "無し";
			if(runners[i]) {
				value = "有り";
			}
			
			System.out.println(String.format("%s : %s", base.getName(), value));
		}
	}
	
	public void setRunner(Base base) {
		runners[base.getId()] = true;
	}

}
