package jp.momotown.data.playerlist;

public class PlayerData {
	
	public String position;
	public String name;

	public PlayerData() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.position = "";
		this.name = "";
	}

	public PlayerData(String position, String name) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.position = position;
		this.name = name;
	}
	
	public void display() {
		System.out.println(String.format("%s : %s",
				this.position,
				this.name));
	}

}
