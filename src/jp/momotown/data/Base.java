package jp.momotown.data;

public enum Base {
	FIRST(0, "一塁"),
	SECOND(1, "二塁"),
	THIRD(2, "三塁"),
	HOME(3, "本塁");
	
	static public final int NUM = Base.values().length;

	private int id;
	private String name;
	
	Base(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public static Base valuesOf(int id) {
		
		for(Base value : values()) {
			if(value.getId() == id) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("no such enum object for the id: " + id);
	}

}
