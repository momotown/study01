package jp.momotown.data;

public enum Inning {
	TOP(0),
	BOTTOM(1);
	
	static public final int NUM = Inning.values().length;

	private int id;
	
	Inning(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
}
