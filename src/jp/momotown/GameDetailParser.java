package jp.momotown;

import java.util.List;

import jp.momotown.data.GameDetailData;
import jp.momotown.data.batterbox.BatterBoxLiveData;
import jp.momotown.data.playerlist.PlayerListData;
import jp.momotown.data.scoreboard.ScoreBoardData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GameDetailParser {

	private WebDriver webDriver;
	private String baseUrl;
	
	public GameDetailParser(String url) {

		baseUrl = url;
		webDriver = new FirefoxDriver();
		webDriver.get(baseUrl);
	}
	
	private void setUp() {
		
	}

	public GameDetailData parse() {

		setUp();
		
		GameDetailData gameDetailData = new GameDetailData();
		
		// スコアボード
		WebElement element = webDriver.findElement(By.cssSelector("div.scoreboardArea"));
		ScoreBoardParser scoreBoardParser = new ScoreBoardParser(element);
		ScoreBoardData scoreBoardData = scoreBoardParser.parse();
		gameDetailData.setScoreBoardData(scoreBoardData);
		
		// プレイヤーリスト
		element = webDriver.findElement(By.cssSelector("div#playerListIndex"));
		PlayerListParser playerListParser = new PlayerListParser(element);
		PlayerListData playerListData = playerListParser.parse();
		gameDetailData.setPlayerListData(playerListData);
		
		// Live
		element = webDriver.findElement(By.cssSelector("div#batterBoxLive"));
		BatterBoxLiveParser batterBoxLiveParser = new BatterBoxLiveParser(element);
		BatterBoxLiveData batterBoxLiveData = batterBoxLiveParser.parse();
		gameDetailData.setBatterBoxLiveData(batterBoxLiveData);
		
//		WebElement battingOrderBlock = webDriver.findElement(By.xpath("//div[@id='playerListIndex']"));
//		System.out.println(battingOrderBlock.getText());
//		List<WebElement> battingOrderList= webDriver.findElements(By.xpath("//div[@id='playerListIndex']//table[@class='data-view']"));
//		for(WebElement battingOrder : battingOrderList) {
//			System.out.println(battingOrder.getText());
//		}
		
		tearDown();
		
		return gameDetailData;
	}

	private void tearDown() {
		webDriver.quit();
	}

}
