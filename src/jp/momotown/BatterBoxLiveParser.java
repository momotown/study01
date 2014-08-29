package jp.momotown;

import org.openqa.selenium.WebElement;

import jp.momotown.data.batterbox.BatterBoxLiveData;
import jp.momotown.data.batterbox.BatterData;
import jp.momotown.data.batterbox.CatcherData;
import jp.momotown.data.batterbox.ConditionData;
import jp.momotown.data.batterbox.PitcherData;
import jp.momotown.data.batterbox.PitchesMapData;
import jp.momotown.data.batterbox.PitchingBallData;

public class BatterBoxLiveParser {
	
	private WebElement baseElement;

	public BatterBoxLiveParser(WebElement element) {

		baseElement = element;
	}

	private void setUp() {
	}

	private void tearDown() {
	}
	
	public BatterBoxLiveData parse() {
		
		setUp();
		
		BatterBoxLiveData batterBoxLive = new BatterBoxLiveData();
		
		tearDown();
		
		return batterBoxLive;
	}
	
	private PitcherData parsePitcher(WebElement inElement) {
		
	}
	
	private CatcherData parseCatcher(WebElement inElement) {
		
	}
	
	private ConditionData parseCondition(WebElement inElement) {
		
	}
	
	private PitchingBallData parsePitchingBall(WebElement inElement) {
		
	}
	
	private BatterData parseBatter(WebElement inElement) {
		
	}
	
	private PitchesMapData parsePitchesMap(WebElement inElement) {
		
	}

}
