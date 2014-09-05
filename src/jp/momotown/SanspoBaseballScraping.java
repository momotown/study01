package jp.momotown;

import java.util.List;

import org.openqa.selenium.WebElement;

import jp.momotown.data.GameDetailData;
import jp.momotown.data.GameScheduleData;
import jp.momotown.data.TopBottom;
import jp.momotown.data.scoreboard.InningScoreData;
import jp.momotown.data.scoreboard.ScoreBoardData;

public class SanspoBaseballScraping {
	public static void main(String[] args) {
		String date = "20140824";

		GameScheduleParser gameScheduleParser = new GameScheduleParser();
		List<GameScheduleData> gameschedules = gameScheduleParser.parse(date);
		for (GameScheduleData gameschedule : gameschedules) {
			String link = gameschedule.getLink();
			System.out.println(link);
		}
		
		String link = gameschedules.get(0).getLink(); // とりあえず第一ゲームのみやってみよう
		GameDetailParser gameDetailParser = new GameDetailParser(link);
		GameDetailData gameDetailData = gameDetailParser.parse();
		
		// 1回表へのリンクが欲しい
		ScoreBoardData scoreBoardData = gameDetailData.getScoreBoardData();
		InningScoreData TopOfFirstInningScoreData = scoreBoardData.getTeamScoreBoardData(TopBottom.TOP).getInningScoreData(1);
		link = TopOfFirstInningScoreData.link;
		System.out.println(link);
		
		gameDetailParser = new GameDetailParser(link);
		gameDetailData = gameDetailParser.parse();
		
		WebElement nextBallButton = gameDetailData.getBatterBoxLiveData().getNextBallButton();
		if(null != nextBallButton) {
			nextBallButton.click();
		}
		
		do {
			
			nextBallButton = gameDetailData.getBatterBoxLiveData().getNextBallButton();
		} while(null != nextBallButton);

	}
}
