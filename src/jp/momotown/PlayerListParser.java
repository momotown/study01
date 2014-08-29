package jp.momotown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import jp.momotown.data.TopBottom;
import jp.momotown.data.playerlist.PlayerListData;
import jp.momotown.data.playerlist.TeamPlayerListData;

public class PlayerListParser {
	
	private WebElement baseElement;

	public PlayerListParser(WebElement element) {

		baseElement = element;
	}
	
	private void setUp() {
	}

	private void tearDown() {
	}
	
	public PlayerListData parse() {

		setUp();
		
		PlayerListData playerList = new PlayerListData();
		
		List<WebElement> elements = baseElement.findElements(By.cssSelector("table.data-view"));
		
		// 表チーム
		TeamPlayerListData teamPlayerList = parseTeamPlayerList(elements.get(0));
		playerList.setTeamPlayerList(TopBottom.TOP, teamPlayerList);

		// 裏チーム
		teamPlayerList = parseTeamPlayerList(elements.get(1));
		playerList.setTeamPlayerList(TopBottom.BOTTOM, teamPlayerList);

		tearDown();
		
		return playerList;
	}
	
	private TeamPlayerListData parseTeamPlayerList(WebElement inElement) {
		
		String teamName = inElement.findElement(By.cssSelector("caption")).getText();
		
		TeamPlayerListData teamPlayerList = new TeamPlayerListData(teamName);
		
		List<WebElement> elements= inElement.findElements(By.cssSelector("tr"));
		for(WebElement element : elements) {
//			int no = Integer.parseInt(element.findElement(By.cssSelector("td.no")).getText());
			String position = element.findElement(By.cssSelector("td.position")).getText();
			String name = element.findElement(By.cssSelector("td.name")).getText();
			teamPlayerList.addPlayer(position, name);
		}
		
		return teamPlayerList;
	}

}
