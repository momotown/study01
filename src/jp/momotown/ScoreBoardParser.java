package jp.momotown;

import java.util.List;

import jp.momotown.data.scoreboard.InningScoreData;
import jp.momotown.data.scoreboard.ScoreBoardData;
import jp.momotown.data.scoreboard.TeamScoreBoardData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ScoreBoardParser {
	
	private WebElement baseElement;

	public ScoreBoardParser(WebElement element) {
		baseElement = element;
	}
	
	public ScoreBoardData parse() {
		ScoreBoardData scoreBoardData = new ScoreBoardData();

		WebElement[] teamElements = new WebElement[2];
		teamElements[0] = baseElement.findElement(By.cssSelector("tr.first"));
		teamElements[1] = baseElement.findElement(By.cssSelector("tr.second"));
		
		for(int i = 0; i < teamElements.length; ++i) {
			TeamScoreBoardData teamScoreBoardData = new TeamScoreBoardData();
			List<WebElement> innings = teamElements[i].findElements(By.cssSelector("td.inning"));
			for(WebElement inning : innings) {
				InningScoreData inningScoreData = new InningScoreData();
				inningScoreData.score = Integer.parseInt(inning.getText());
				WebElement anchor = inning.findElement(By.tagName("a"));
				inningScoreData.link = anchor.getAttribute("href");
				teamScoreBoardData.inningScoreDataList.add(inningScoreData);
			}
			teamScoreBoardData.sum = Integer.parseInt(teamElements[i].findElement(By.cssSelector("td.sum")).getText());
			teamScoreBoardData.hits = Integer.parseInt(teamElements[i].findElement(By.cssSelector("td.hit")).getText());
			teamScoreBoardData.errors = Integer.parseInt(teamElements[i].findElement(By.cssSelector("td.error")).getText());
			scoreBoardData.setTeamScoreBoardData(i, teamScoreBoardData);
		}
		
		return scoreBoardData;
	}

}
