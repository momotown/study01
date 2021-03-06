package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class StadiumDataTable extends DataTable {

	private static final StadiumDataTable instance = new StadiumDataTable();

	public StadiumDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(0,			"ファウル");
			addRowFromValues(1,			"東京ドーム");
			addRowFromValues(2,			"神宮");
			addRowFromValues(3,			"横浜");
			addRowFromValues(4,			"ナゴヤドーム");
			addRowFromValues(5,			"甲子園");
			addRowFromValues(6,			"広島");
			addRowFromValues(7,			"インボイスドーム");
			addRowFromValues(8,			"千葉マリン");
			addRowFromValues(9,			"大阪ドーム");
			addRowFromValues(10,		"スカイマーク");
			addRowFromValues(11,		"ヤフードーム");
			addRowFromValues(12,		"明石");
			addRowFromValues(13,		"安芸");
			addRowFromValues(14,		"秋田");
			addRowFromValues(15,		"青森");
			addRowFromValues(16,		"旭川");
			addRowFromValues(17,		"熱田");
			addRowFromValues(18,		"会津若松");
			addRowFromValues(19,		"セ本拠地");
			addRowFromValues(20,		"北谷");
			addRowFromValues(21,		"福井");
			addRowFromValues(22,		"福山");
			addRowFromValues(23,		"福島");
			addRowFromValues(24,		"富士");
			addRowFromValues(25,		"藤井寺");
			addRowFromValues(26,		"岐阜");
			addRowFromValues(27,		"宜野湾");
			addRowFromValues(28,		"蒲郡");
			addRowFromValues(29,		"八戸");
			addRowFromValues(30,		"函館");
			addRowFromValues(31,		"浜松");
			addRowFromValues(32,		"姫路");
			addRowFromValues(33,		"半田");
			addRowFromValues(34,		"春野");
			addRowFromValues(35,		"防府");
			addRowFromValues(36,		"萩");
			addRowFromValues(37,		"弘前");
			addRowFromValues(38,		"平塚");
			addRowFromValues(39,		"豊北町");
			addRowFromValues(40,		"彦根");
			addRowFromValues(41,		"ひたちなか");
			addRowFromValues(42,		"今治");
			addRowFromValues(43,		"石川");
			addRowFromValues(44,		"出雲");
			addRowFromValues(45,		"磐田");
			addRowFromValues(46,		"糸満");
			addRowFromValues(47,		"伊勢原");
			addRowFromValues(48,		"いわき");
			addRowFromValues(49,		"上越");
			addRowFromValues(50,		"鹿児島");
			addRowFromValues(51,		"刈谷");
			addRowFromValues(52,		"金沢");
			addRowFromValues(53,		"桐生");
			addRowFromValues(54,		"高知市営");
			addRowFromValues(55,		"鎌ケ谷");
			addRowFromValues(56,		"郡山");
			addRowFromValues(57,		"熊本");
			addRowFromValues(58,		"倉吉");
			addRowFromValues(59,		"久留米");
			addRowFromValues(60,		"北九州");
			addRowFromValues(61,		"串間");
			addRowFromValues(62,		"呉");
			addRowFromValues(63,		"釧路");
			addRowFromValues(64,		"倉敷");
			addRowFromValues(65,		"柏崎");
			addRowFromValues(66,		"川崎");
			addRowFromValues(67,		"鴨川");
			addRowFromValues(68,		"甲府");
			addRowFromValues(69,		"小牧");
			addRowFromValues(70,		"勝田");
			addRowFromValues(71,		"橿原");
			addRowFromValues(72,		"前橋");
			addRowFromValues(73,		"松江");
			addRowFromValues(74,		"松山");
			addRowFromValues(75,		"宮崎");
			addRowFromValues(76,		"水戸");
			addRowFromValues(77,		"盛岡");
			addRowFromValues(78,		"都城");
			addRowFromValues(79,		"松本");
			addRowFromValues(80,		"宮古島");
			addRowFromValues(81,		"宮崎");
			addRowFromValues(82,		"長野");
			addRowFromValues(83,		"長岡");
			addRowFromValues(84,		"長崎");
			addRowFromValues(85,		"鳴門");
			addRowFromValues(86,		"新潟");
			addRowFromValues(87,		"名護");
			addRowFromValues(88,		"那覇");
			addRowFromValues(89,		"日南");
			addRowFromValues(90,		"新居浜");
			addRowFromValues(91,		"西京極");
			addRowFromValues(92,		"沼津");
			addRowFromValues(93,		"西宮");
			addRowFromValues(94,		"日生");
			addRowFromValues(95,		"岡山");
			addRowFromValues(96,		"大分");
			addRowFromValues(97,		"大宮");
			addRowFromValues(98,		"沖縄");
			addRowFromValues(99,		"大津");
			addRowFromValues(100,		"大牟田");
			addRowFromValues(101,		"大垣");
			addRowFromValues(102,		"帯広");
			addRowFromValues(103,		"小田原");
			addRowFromValues(104,		"岡崎");
			addRowFromValues(105,		"小郡");
			addRowFromValues(106,		"尾道");
			addRowFromValues(107,		"パ本拠地");
			addRowFromValues(108,		"札幌");
			addRowFromValues(109,		"札幌ドーム");
			addRowFromValues(110,		"フルキャスト");
			addRowFromValues(111,		"島原");
			addRowFromValues(112,		"島田");
			addRowFromValues(113,		"下関");
			addRowFromValues(114,		"静岡");
			addRowFromValues(115,		"宿毛");
			addRowFromValues(116,		"佐世保");
			addRowFromValues(117,		"相模原");
			addRowFromValues(118,		"袖ケ浦");
			addRowFromValues(119,		"佐伯");
			addRowFromValues(120,		"三条");
			addRowFromValues(121,		"佐賀");
			addRowFromValues(122,		"多治見");
			addRowFromValues(123,		"高松");
			addRowFromValues(124,		"高砂");
			addRowFromValues(125,		"徳山");
			addRowFromValues(126,		"富山");
			addRowFromValues(127,		"津");
			addRowFromValues(128,		"豊橋");
			addRowFromValues(129,		"鳥取");
			addRowFromValues(130,		"津山");
			addRowFromValues(131,		"徳島");
			addRowFromValues(132,		"敦賀");
			addRowFromValues(133,		"津久見");
			addRowFromValues(134,		"豊田");
			addRowFromValues(137,		"宇都宮");
			addRowFromValues(138,		"宇部");
			addRowFromValues(139,		"浦添");
			addRowFromValues(140,		"和歌山");
			addRowFromValues(141,		"山形");
			addRowFromValues(142,		"米子");
			addRowFromValues(143,		"焼津");
			addRowFromValues(144,		"湯浅");
			addRowFromValues(145,		"大和郡山");
			addRowFromValues(146,		"湯之元");
			addRowFromValues(147,		"四日市");
			addRowFromValues(148,		"読谷");
			addRowFromValues(149,		"八代");
			addRowFromValues(150,		"山口");
			addRowFromValues(151,		"横須賀");
			addRowFromValues(152,		"大和");
			addRowFromValues(153,		"北神戸");
			addRowFromValues(154,		"西武第ニ");
			addRowFromValues(155,		"ジャイアンツ");
			addRowFromValues(186,		"ロッテ");
			addRowFromValues(187,		"戸田");
			addRowFromValues(188,		"雁の巣");
			addRowFromValues(189,		"由宇");
			addRowFromValues(190,		"ナゴヤ");
			addRowFromValues(191,		"鳴尾浜");
			addRowFromValues(30000,	"秋田");
			addRowFromValues(30001,	"大田");
			addRowFromValues(156,		"ターナー");
			addRowFromValues(157,		"ドルフィンズ");
			addRowFromValues(159,		"シェイ");
			addRowFromValues(160,		"ベテランズ");
			addRowFromValues(161,		"リグレー");
			addRowFromValues(162,		"グレートアメリカボールパーク");
			addRowFromValues(163,		"ミニッツメイドパーク");
			addRowFromValues(164,		"ミラー");
			addRowFromValues(165,		"ＰＮＣパーク");
			addRowFromValues(166,		"ブッシュス");
			addRowFromValues(167,		"バンクワン");
			addRowFromValues(168,		"クアーズ");
			addRowFromValues(169,		"ドジャース");
			addRowFromValues(170,		"クアルコム");
			addRowFromValues(171,		"ＳＢＣ");
			addRowFromValues(172,		"カムデンヤーズ");
			addRowFromValues(173,		"フェンウェイ");
			addRowFromValues(174,		"ヤンキー");
			addRowFromValues(175,		"トロピカーナ");
			addRowFromValues(177,		"ＵＳセルラーフィールド");
			addRowFromValues(178,		"ジェイコブス");
			addRowFromValues(179,		"コメリカ");
			addRowFromValues(180,		"カウフマン");
			addRowFromValues(181,		"メトロ");
			addRowFromValues(182,		"エンゼルスタジアム");
			addRowFromValues(183,		"マカフィー");
			addRowFromValues(184,		"セーフコ");
			addRowFromValues(185,		"アメリクエスト");
			addRowFromValues(30002,	"ペトコ");
			addRowFromValues(30003,	"シチズンズバンク");
			addRowFromValues(30005,	"ＲＦＫ");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static StadiumDataTable getInstance() {
		return instance;
  }

}
