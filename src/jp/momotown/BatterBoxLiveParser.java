package jp.momotown;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jp.momotown.data.InningStatus;
import jp.momotown.data.batterbox.BaseMapData;
import jp.momotown.data.batterbox.BatterBoxLiveData;
import jp.momotown.data.batterbox.BatterData;
import jp.momotown.data.batterbox.CatcherData;
import jp.momotown.data.batterbox.ConditionData;
import jp.momotown.data.batterbox.InningScoreData;
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
		
		WebElement subElement = baseElement.findElement(By.cssSelector("div.col01"));
		
		// 投手
		WebElement element = subElement.findElement(By.cssSelector("table#pitcherTbl.data-view"));
		PitcherData pitcharData = parsePitcher(element);
		pitcharData.display();
		
		// 捕手
		element = subElement.findElement(By.cssSelector("table#catcherTbl.data-view"));
		CatcherData catcherData = parseCatcher(element);
		catcherData.display();
		
		// 状態
		element = subElement.findElement(By.cssSelector("div.conditions"));
		ConditionData condiitonData = parseCondition(element);
		condiitonData.display();
		
		subElement = baseElement.findElement(By.cssSelector("div.col02"));
		
		tearDown();
		
		return batterBoxLive;
	}
	
	private PitcherData parsePitcher(WebElement baseElement) {
		
		List<WebElement> elements = baseElement.findElements(By.cssSelector("tr"));
		
		// 名前
		String text = elements.get(0).findElement(By.cssSelector("td")).getText();
		PitcherData pitcherData = new PitcherData(text);
		
		// 球数
		text = elements.get(1).findElement(By.cssSelector("td")).getText();
		Pattern pattern = Pattern.compile("[^0-9]+");
		String[] texts = pattern.split(text);
		try {
			int pitches = Integer.parseInt(texts[0]);
			pitcherData.setPitches(pitches);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		// 今季成績
		text = elements.get(2).findElement(By.cssSelector("td")).getText();
		texts = pattern.split(text);
		try {
			int wins = Integer.parseInt(texts[0]);
			int losses = Integer.parseInt(texts[1]);
			int saves = Integer.parseInt(texts[2]);
			pitcherData.seScore(wins, losses, saves);
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		return pitcherData;
	}
	
	private CatcherData parseCatcher(WebElement baseElement) {

		List<WebElement> elements = baseElement.findElements(By.cssSelector("tr"));
		
		// 名前
		String text = elements.get(0).findElement(By.cssSelector("td")).getText();
		CatcherData catcherData = new CatcherData(text);
		
		return catcherData;
	}
	
	private ConditionData parseCondition(WebElement baseElement) {

		ConditionData conditionData = new ConditionData();
		
		WebElement subElement = baseElement.findElement(By.cssSelector("div#inningScore"));
		InningScoreData inningScoreData = parseInningScore(subElement);
		conditionData.setInningScoreData(inningScoreData);
		
		subElement = baseElement.findElement(By.cssSelector("div#baseMap"));
		BaseMapData baseMapData = parseBaseMap(subElement);
		conditionData.setBaseMapData(baseMapData);

		return conditionData;
	}
	
	private InningScoreData parseInningScore(WebElement baseElement) {

		try {
			// イニング
			WebElement element = baseElement.findElement(By.cssSelector("p.currentInning"));
			String text = element.getText();
			Pattern pattern = Pattern.compile("回");
			String[] texts = pattern.split(text);

			int inningNo = Integer.parseInt(texts[0]);
			InningStatus inningStatus = InningStatus.getEnum(texts[1]);
			InningScoreData inningScoreData = new InningScoreData(inningNo, inningStatus);
			
			// カウント
			List<WebElement> elements = baseElement.findElements(By.cssSelector("tr"));
			text = elements.get(0).findElement(By.cssSelector("td")).getText();
			int balls = Integer.parseInt(text);
			text = elements.get(1).findElement(By.cssSelector("td")).getText();
			int strikes = Integer.parseInt(text);
			text = elements.get(2).findElement(By.cssSelector("td")).getText();
			int outs = Integer.parseInt(text);
			inningScoreData.setCount(balls, strikes, outs);
			
			return inningScoreData;
		} catch(NumberFormatException e) {

			System.out.println(e.getMessage());
			return null;
		}
	}

	private BaseMapData parseBaseMap(WebElement baseElement) {

		List<WebElement> elements = baseElement.findElements(By.cssSelector("p.runner"));
		return null;
		
	}
	
	private PitchingBallData parsePitchingBall(WebElement baseElement) {
		return null;
		
	}
	
	private BatterData parseBatter(WebElement baseElement) {
		return null;
		
	}
	
	private PitchesMapData parsePitchesMap(WebElement baseElement) {
		return null;
		
	}

}
