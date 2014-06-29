package jp.momotown;

public enum InningStatus {
	Top("表"),
	Bottom("裏");;
	
	private String name;
	
	InningStatus(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
