package jp.momotown;

public class Score {
	
	private int top;
	private int bottom;

	public Score() {
		this.top = 0;
		this.bottom = 0;
	}

	public Score(int top, int bottom) {
		this.top = top;
		this.bottom = bottom;
	}
	
	public void set(int top, int bottom) {
		this.top = top;
		this.bottom = bottom;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getTop() {
		return this.top;
	}

	public int getBottom() {
		return this.bottom;
	}
}
