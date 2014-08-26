package jp.momotown;

import java.util.List;

import jp.momotown.data.GameScheduleData;

public class SanspoBaseballScraping {
	public static void main(String[] args) {
		String date = "20140824";

		GameScheduleParser gameScheduleParser = new GameScheduleParser();
		List<GameScheduleData> gameschedules = gameScheduleParser.parse(date);
		for (GameScheduleData gameschedule : gameschedules) {
			String link = gameschedule.getLink();
			System.out.println(link);
//			GameDetailParser gameDetailParser = new GameDetailParser(link);
//			gameDetailParser.parse();
		}
		
		String link = gameschedules.get(0).getLink();
		GameDetailParser gameDetailParser = new GameDetailParser(link);
		gameDetailParser.parse();
	}
}
