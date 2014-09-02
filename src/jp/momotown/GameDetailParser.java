package jp.momotown;

import java.util.List;

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
		// TODO 自動生成されたコンストラクター・スタブ
		baseUrl = url;
	}
	
	private void setUp() {
		webDriver = new FirefoxDriver();
	}

	public void parse() {

		setUp();
		
		webDriver.get(baseUrl);
		
		// スコアボード
		WebElement element = webDriver.findElement(By.cssSelector("div.scoreboardArea"));
		ScoreBoardParser scoreBoardParser = new ScoreBoardParser(element);
		ScoreBoardData scoreBoardData = scoreBoardParser.parse();
		scoreBoardData.display();
		
		// プレイヤーリスト
		element = webDriver.findElement(By.cssSelector("div#playerListIndex"));
		PlayerListParser playerListParser = new PlayerListParser(element);
		PlayerListData playerListData = playerListParser.parse();
		playerListData.display();
		
		element = webDriver.findElement(By.cssSelector("div#batterBoxLive"));
		BatterBoxLiveParser batterBoxLiveParser = new BatterBoxLiveParser(element);
		batterBoxLiveParser.parse();
		
//		WebElement battingOrderBlock = webDriver.findElement(By.xpath("//div[@id='playerListIndex']"));
//		System.out.println(battingOrderBlock.getText());
//		List<WebElement> battingOrderList= webDriver.findElements(By.xpath("//div[@id='playerListIndex']//table[@class='data-view']"));
//		for(WebElement battingOrder : battingOrderList) {
//			System.out.println(battingOrder.getText());
//		}
		
		tearDown();
	}

	private void tearDown() {
		webDriver.quit();
	}

}
