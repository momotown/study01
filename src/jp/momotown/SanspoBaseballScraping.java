package jp.momotown;

import java.util.List;

public class SanspoBaseballScraping {
	public static void main(String[] args) {
		String date = "20140328";
		
		ScheduleParser parser = new ScheduleParser();
		List<GameSchedule> gameSchedules = parser.parse(date);
		for(GameSchedule gameSchedule : gameSchedules) {
			String url = gameSchedule.getDetailLink();
			System.out.println(url);
			GameDetailParser gameDetailParser = new GameDetailParser(url);
			gameDetailParser.parse();
		}
	}
}
