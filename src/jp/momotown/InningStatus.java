package jp.momotown;

public enum InningStatus {
	Top("表"),
	Bottom("裏"),
	Num("要素数");
	
	private String name;
	
	InningStatus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
