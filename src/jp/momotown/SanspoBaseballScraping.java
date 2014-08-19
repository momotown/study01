package jp.momotown;

import java.util.List;

import jp.momotown.data.GameScheduleData;

public class SanspoBaseballScraping {
	public static void main(String[] args) {
		String date = "20140817";

		GameScheduleParser gameScheduleParser = new GameScheduleParser();
		List<GameScheduleData> gameschedules = gameScheduleParser.parse(date);
		for (GameScheduleData gameschedule : gameschedules) {
			String link = gameschedule.getLink();
			System.out.println(link);
//			GameDetailParser gameDetailParser = new GameDetailParser(link);
//			gameDetailParser.parse();
		}
	}
}
