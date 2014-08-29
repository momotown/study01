package jp.momotown;

import java.util.List;

import jp.momotown.data.TopBottom;
import jp.momotown.data.scoreboard.InningScoreData;
import jp.momotown.data.scoreboard.ScoreBoardData;
import jp.momotown.data.scoreboard.TeamScoreBoardData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScoreBoardParser {
	
	private WebElement baseElement;

	public ScoreBoardParser(WebElement element) {
		baseElement = element;
	}
	
	private void setUp() {
	}

	private void tearDown() {
	}

	public ScoreBoardData parse() {
		
		setUp();
		
		ScoreBoardData scoreBoard = new ScoreBoardData();

		// 表
		WebElement element = baseElement.findElement(By.cssSelector("tr.first"));
		TeamScoreBoardData teamScoreBoard = parseTeamScoreBoard(element);
		scoreBoard.setTeamScoreBoardData(TopBottom.TOP, teamScoreBoard);
		
		// 裏
		element = baseElement.findElement(By.cssSelector("tr.second"));
		teamScoreBoard = parseTeamScoreBoard(element);
		scoreBoard.setTeamScoreBoardData(TopBottom.BOTTOM, teamScoreBoard);

		tearDown();
		
		return scoreBoard;
	}
	
	public TeamScoreBoardData parseTeamScoreBoard(WebElement element) {
		
		TeamScoreBoardData teamScoreBoard = new TeamScoreBoardData();
		List<WebElement> innings = element.findElements(By.cssSelector("td.inning"));
		for(WebElement inning : innings) {
			int score = Integer.parseInt(inning.getText());
			WebElement anchor = inning.findElement(By.tagName("a"));
			String link = anchor.getAttribute("href");
			teamScoreBoard.addInningScore(score, link);
		}
		teamScoreBoard.sum = Integer.parseInt(element.findElement(By.cssSelector("td.sum")).getText());
		teamScoreBoard.hits = Integer.parseInt(element.findElement(By.cssSelector("td.hit")).getText());
		teamScoreBoard.errors = Integer.parseInt(element.findElement(By.cssSelector("td.error")).getText());
		
		return teamScoreBoard;
	}

}
