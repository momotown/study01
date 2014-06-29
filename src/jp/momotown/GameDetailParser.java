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
		List<WebElement> battingOrderList = webDriver.findElements(By.xpath(""));

		tearDown();
	}

	private void tearDown() {
		webDriver.quit();
	}

}
