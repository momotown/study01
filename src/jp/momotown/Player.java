package jp.momotown;

public class Player {
	
	protected String firstName;
	protected String lastName;

	public Player(String fullName) {
		// TODO 自動生成されたコンストラクター・スタブ
		String[] name = fullName.split("[\\s|・]+");
		
		this.lastName = name[0];
		if(name.length == 2) {
			this.firstName = name[1];
		}
	}
}
