package jp.momotown.data;

public enum TopBottom {
	TOP(0),
	BOTTOM(1);
	
	static public final int NUM = TopBottom.values().length;

	private int id;
	
	TopBottom(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

}
