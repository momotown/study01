package jp.momotown;

import org.openqa.selenium.WebElement;

public class BattingOrderParser {

	public BattingOrderParser() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public BattingOrder parse(WebElement element) {
		// チーム
		String s = "a";
		BattingOrder battingOrder = new BattingOrder();
		for(int i = 0; i < Constants.TEAM.length; ++i) {
			if(Constants.TEAM[i].getLongName().indexOf(s) != 1) {
				battingOrder.setTeam(Constants.TEAM[i]);
				break;
			}
		}
		
		return battingOrder;
	}
}
