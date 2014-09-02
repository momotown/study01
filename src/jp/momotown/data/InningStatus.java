package jp.momotown.data;

public enum InningStatus {
	TOP(0, "表"),
	BOTTOM(1, "裏");
	
	static public final int NUM = InningStatus.values().length;

	private int id;
	private String name;
	
	InningStatus(int id, String name) {

		this.id = id;
		this.name = name;
	}
	
	public int getId() {

		return id;
	}
	
	public String getName() {

		return name;
	}
	
	public static InningStatus getEnum(String name) {
		
		InningStatus[] values = InningStatus.values();
		for(InningStatus value : values) {
			if(name.equals(value.getName())) {
				return value;
			}
		}
		
		return null;
	}

}
