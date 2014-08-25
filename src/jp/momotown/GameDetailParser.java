package jp.momotown;

import java.util.List;

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
		
		
		WebElement scoreboard = webDriver.findElement(By.cssSelector("div.scoreboardArea"));

		
		
		
		WebElement playerListIndex = webDriver.findElement(By.cssSelector("div#playerListIndex"));
		List<WebElement> playerLists = playerListIndex.findElements(By.cssSelector("table.data-view"));
		
		
		
		WebElement batterBoxLive = webDriver.findElement(By.cssSelector("div#batterBoxLive"));
		
//		WebElement battingOrderBlock = webDriver.findElement(By.xpath("//div[@id='playerListIndex']"));
//		System.out.println(battingOrderBlock.getText());
		List<WebElement> battingOrderList= webDriver.findElements(By.xpath("//div[@id='playerListIndex']//table[@class='data-view']"));
		for(WebElement battingOrder : battingOrderList) {
			System.out.println(battingOrder.getText());
		}
		
		tearDown();
	}

	private void tearDown() {
		webDriver.quit();
	}

}
