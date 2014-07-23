package jp.momotown.table;


public final class StaticTeamTable extends TeamTable {

	private final Team[] teamArray = {
		new Team(1,		"巨人",			"G",	0),
		new Team(2,		"ヤクルト",		"S",	0),
		new Team(3,		"横浜",			"YB",	0),
		new Team(4,		"中日",			"D",	0),
		new Team(5,		"阪神",			"T",	0),
		new Team(6,		"広島",			"C",	0),
		new Team(7,		"西武",			"L",	0),
		new Team(8,		"日本ハム",		"F",	0),
		new Team(9,		"ロッテ",			"M",	0),
		new Team(11,	"オリックス",		"Bs",	0),
		new Team(12,	"ソフトバンク",		"H",	0),
		new Team(376,	"楽天",			"E",	0),
		new Team(15,	"全パ",			"PL",	1),
		new Team(16,	"全セ",			"CL",	1),
		new Team(41,	"ブレーブス",		"ATL",	0),
		new Team(42,	"マーリンズ",		"FLA",	0),
		new Team(43,	"ナショナルズ",		"WSH",	0),
		new Team(44,	"メッツ",			"NYM",	0),
		new Team(45,	"フィリーズ",		"PHI",	0),
		new Team(46,	"カブス",			"CHC",	0),
		new Team(47,	"レッズ",			"CIN",	0),
		new Team(48,	"アストロズ",		"HOU",	0),
		new Team(49,	"ブルワーズ",		"MIL",	0),
		new Team(50,	"パイレーツ",		"PIT",	0),
		new Team(51,	"カージナルス",		"STL",	0),
		new Team(52,	"ダイヤモンドバックス",	"ARI",	0),
		new Team(53,	"ロッキーズ",		"COL",	0),
		new Team(54,	"ドジャース",		"LA",	0),
		new Team(55,	"パドレス",		"SD",	0),
		new Team(56,	"ジャイアンツ",		"SF",	0),
		new Team(57,	"オリオールズ",		"BAL",	0),
		new Team(58,	"レッドソックス",		"BOS",	0),
		new Team(59,	"ヤンキース",		"NYY",	0),
		new Team(60,	"デビルレイズ",		"TB",	0),
		new Team(61,	"ブルージェイズ",	"TOR",	0),
		new Team(62,	"ホワイトソックス",	"CWS",	0),
		new Team(63,	"インディアンス",		"CLE",	0),
		new Team(64,	"タイガース",		"DET",	0),
		new Team(65,	"ロイヤルズ",		"KC",	0),
		new Team(66,	"ツインズ",		"MIN",	0),
		new Team(67,	"エンゼルス",		"LAA",	0),
		new Team(68,	"アスレチックス",		"OAK",	0),
		new Team(69,	"マリナーズ",		"SEA",	0),
		new Team(70,	"レンジャーズ",		"TEX",	0),
		new Team(71,	"ナショナル",		"NL",	1),
		new Team(72,	"アメリカン",		"AL",	1),
	};

	public StaticTeamTable() {
		for(Team team : teamArray) {
			this.teamList.add(team);
		}
	}
}
