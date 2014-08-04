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
			addRowFromValues(0,		"ファウル");
			1	東京ドーム
			2	神宮
			3	横浜
			4	ナゴヤドーム
			5	甲子園
			6	広島
			7	インボイスドーム
			8	千葉マリン
			9	大阪ドーム
			10	スカイマーク
			11	ヤフードーム
			12	明石
			13	安芸
			14	秋田
			15	青森
			16	旭川
			17	熱田
			18	会津若松
			19	セ本拠地
			20	北谷
			21	福井
			22	福山
			23	福島
			24	富士
			25	藤井寺
			26	岐阜
			27	宜野湾
			28	蒲郡
			29	八戸
			30	函館
			31	浜松
			32	姫路
			33	半田
			34	春野
			35	防府
			36	萩
			37	弘前
			38	平塚
			39	豊北町
			40	彦根
			41	ひたちなか
			42	今治
			43	石川
			44	出雲
			45	磐田
			46	糸満
			47	伊勢原
			48	いわき
			49	上越
			50	鹿児島
			51	刈谷
			52	金沢
			53	桐生
			54	高知市営
			55	鎌ケ谷
			56	郡山
			57	熊本
			58	倉吉
			59	久留米
			60	北九州
			61	串間
			62	呉
			63	釧路
			64	倉敷
			65	柏崎
			66	川崎
			67	鴨川
			68	甲府
			69	小牧
			70	勝田
			71	橿原
			72	前橋
			73	松江
			74	松山
			75	宮崎
			76	水戸
			77	盛岡
			78	都城
			79	松本
			80	宮古島
			81	宮崎
			82	長野
			83	長岡
			84	長崎
			85	鳴門
			86	新潟
			87	名護
			88	那覇
			89	日南
			90	新居浜
			91	西京極
			92	沼津
			93	西宮
			94	日生
			95	岡山
			96	大分
			97	大宮
			98	沖縄
			99	大津
			100	大牟田
			101	大垣
			102	帯広
			103	小田原
			104	岡崎
			105	小郡
			106	尾道
			107	パ本拠地
			108	札幌
			109	札幌ドーム
			110	フルキャスト
			111	島原
			112	島田
			113	下関
			114	静岡
			115	宿毛
			116	佐世保
			117	相模原
			118	袖ケ浦
			119	佐伯
			120	三条
			121	佐賀
			122	多治見
			123	高松
			124	高砂
			125	徳山
			126	富山
			127	津
			128	豊橋
			129	鳥取
			130	津山
			131	徳島
			132	敦賀
			133	津久見
			134	豊田
			137	宇都宮
			138	宇部
			139	浦添
			140	和歌山
			141	山形
			142	米子
			143	焼津
			144	湯浅
			145	大和郡山
			146	湯之元
			147	四日市
			148	読谷
			149	八代
			150	山口
			151	横須賀
			152	大和
			153	北神戸
			154	西武第ニ
			155	ジャイアンツ
			186	ロッテ
			187	戸田
			188	雁の巣
			189	由宇
			190	ナゴヤ
			191	鳴尾浜
			30000	秋田
			30001	大田
			156	ターナー
			157	ドルフィンズ
			159	シェイ
			160	ベテランズ
			161	リグレー
			162	グレートアメリカボールパーク
			163	ミニッツメイドパーク
			164	ミラー
			165	ＰＮＣパーク
			166	ブッシュス
			167	バンクワン
			168	クアーズ
			169	ドジャース
			170	クアルコム
			171	ＳＢＣ
			172	カムデンヤーズ
			173	フェンウェイ
			174	ヤンキー
			175	トロピカーナ
			177	ＵＳセルラーフィールド
			178	ジェイコブス
			179	コメリカ
			180	カウフマン
			181	メトロ
			182	エンゼルスタジアム
			183	マカフィー
			184	セーフコ
			185	アメリクエスト
			30002	ペトコ
			30003	シチズンズバンク
			30005	ＲＦＫ
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static StadiumDataTable getInstance() {
		return instance;
  }

}
