package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public final class TeamDataTable extends DataTable {

	private static final TeamDataTable instance = new TeamDataTable();

  private TeamDataTable() {
		List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("nameS",		ValueType.TEXT,			"名称"));
		cd.add(new ColumnDescription("nameES",	ValueType.TEXT,			"名称英"));
		cd.add(new ColumnDescription("mix",			ValueType.NUMBER,	"混合フラグ"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(1,		"巨人",									"G",		0);
			addRowFromValues(2,		"ヤクルト",							"S",		0);
			addRowFromValues(3,		"横浜",									"YB",		0);
			addRowFromValues(4,		"中日",									"D",		0);
			addRowFromValues(5,		"阪神",									"T",		0);
			addRowFromValues(6,		"広島",									"C",		0);
			addRowFromValues(7,		"西武",									"L",		0);
			addRowFromValues(8,		"日本ハム",							"F",		0);
			addRowFromValues(9,		"ロッテ",								"M",		0);
			addRowFromValues(11,	"オリックス",						"Bs",		0);
			addRowFromValues(12,	"ソフトバンク",					"H",		0);
			addRowFromValues(376,	"楽天",									"E",		0);
			addRowFromValues(15,	"全パ",									"PL",		1);
			addRowFromValues(16,	"全セ",									"CL",		1);
			addRowFromValues(41,	"ブレーブス",						"ATL",	0);
			addRowFromValues(42,	"マーリンズ",						"FLA",	0);
			addRowFromValues(43,	"ナショナルズ",					"WSH",	0);
			addRowFromValues(44,	"メッツ",								"NYM",	0);
			addRowFromValues(45,	"フィリーズ",						"PHI",	0);
			addRowFromValues(46,	"カブス",								"CHC",	0);
			addRowFromValues(47,	"レッズ",								"CIN",	0);
			addRowFromValues(48,	"アストロズ",						"HOU",	0);
			addRowFromValues(49,	"ブルワーズ",						"MIL",	0);
			addRowFromValues(50,	"パイレーツ",						"PIT",	0);
			addRowFromValues(51,	"カージナルス",					"STL",	0);
			addRowFromValues(52,	"ダイヤモンドバックス",	"ARI",	0);
			addRowFromValues(53,	"ロッキーズ",						"COL",	0);
			addRowFromValues(54,	"ドジャース",						"LA",		0);
			addRowFromValues(55,	"パドレス",							"SD",		0);
			addRowFromValues(56,	"ジャイアンツ",					"SF",		0);
			addRowFromValues(57,	"オリオールズ",					"BAL",	0);
			addRowFromValues(58,	"レッドソックス",				"BOS",	0);
			addRowFromValues(59,	"ヤンキース",						"NYY",	0);
			addRowFromValues(60,	"デビルレイズ",					"TB",		0);
			addRowFromValues(61,	"ブルージェイズ",				"TOR",	0);
			addRowFromValues(62,	"ホワイトソックス",			"CWS",	0);
			addRowFromValues(63,	"インディアンス",				"CLE",	0);
			addRowFromValues(64,	"タイガース",						"DET",	0);
			addRowFromValues(65,	"ロイヤルズ",						"KC",		0);
			addRowFromValues(66,	"ツインズ",							"MIN",	0);
			addRowFromValues(67,	"エンゼルス",						"LAA",	0);
			addRowFromValues(68,	"アスレチックス",				"OAK",	0);
			addRowFromValues(69,	"マリナーズ",						"SEA",	0);
			addRowFromValues(70,	"レンジャーズ",					"TEX",	0);
			addRowFromValues(71,	"ナショナル",						"NL",		1);
			addRowFromValues(72,	"アメリカン",						"AL",		1);
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

  public static TeamDataTable getInstance() {
  	return instance;
  }
}
