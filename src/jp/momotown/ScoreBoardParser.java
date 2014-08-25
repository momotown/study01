package jp.momotown;

import jp.momotown.data.scoreboard.ScoreBoardData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ScoreBoardParser {
	
	private WebElement webElement;

	public ScoreBoardParser(WebElement webElement) {
		this.webElement = webElement;
	}
	
	public ScoreBoardData parse() {
		ScoreBoardData scoreBoardData = new ScoreBoardData();
		this.webElement.findElements(By.cssSelector("tr"));
		
		return scoreBoardData;
	}

}
