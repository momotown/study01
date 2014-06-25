package jp.momotown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SanspoBaseballGameDetailParser {

	private WebDriver webDriver;
	private String baseUrl;
	
	public SanspoBaseballGameDetailParser(String url) {
		// TODO 自動生成されたコンストラクター・スタブ
		baseUrl = url;
	}
	
	private void setUp() {
		webDriver = new FirefoxDriver();
	}

	public void parse() {
		setUp();
		
		webDriver.get(baseUrl);

		tearDown();
	}

	private void tearDown() {
		webDriver.quit();
	}

}
