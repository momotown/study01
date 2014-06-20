package jp.momotown;

public class SanspoBaseballScraping {
	public static void main(String[] args) {
		String date = "20140328";
		
		SanspoBaseballCalendarParser parser = new SanspoBaseballCalendarParser();
		parser.parse(date);
	}
}
