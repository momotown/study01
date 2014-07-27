package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class SupplementDataTable extends DataTable {

	private static final SupplementDataTable instance = new SupplementDataTable();

	public SupplementDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("category",	ValueType.TEXT,		"分類"));
		cd.add(new ColumnDescription("id",				ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",			ValueType.TEXT,		"名称"));
		cd.add(new ColumnDescription("target",		ValueType.TEXT,		"対象者"));
		
		addColumns(cd);
		
		try {
			addRowFromValues("ピッチャー",	140,	"ワンバウンド",	"");
			addRowFromValues("ピッチャー",	139,	"すっぽ抜け",	"");
			addRowFromValues("ピッチャー",	613,	"高めのつり球",	"");
			addRowFromValues("ピッチャー",	135,	"判定不服",	"");
			addRowFromValues("ピッチャー",	142,	"投手がっくり",	"");
			addRowFromValues("ピッチャー",	141,	"投手ガッツポーズ",	"");
			addRowFromValues("ピッチャー",	614,	"敬遠ぎみ",	"");
			addRowFromValues("ピッチャー",	615,	"サイン違い",	"");
			addRowFromValues("ピッチャー",	1,		"危険球",	"");
			addRowFromValues("ピッチャー",	616,	"二段モーションボーク",	"");
			addRowFromValues("ピッチャー",	124,	"ノーヒットノーラン",	"");
			addRowFromValues("ピッチャー",	125,	"完全試合",	"");
			addRowFromValues("バッター",		2,		"併殺打",	"");
			addRowFromValues("バッター",		147,	"バット折れる",	"");
			addRowFromValues("バッター",		143,	"ハーフスイング",	"");
			addRowFromValues("バッター",		12,		"詰り",	"");
			addRowFromValues("バッター",		11,		"泳ぎ",	"");
			addRowFromValues("バッター",		8,		"当てただけ",	"");
			addRowFromValues("バッター",		9,		"引っかけ",	"");
			addRowFromValues("バッター",		10,		"右打",	"");
			addRowFromValues("バッター",		617,	"タイミング合わず",	"");
			addRowFromValues("バッター",		618,	"全く反応できず",	"");
			addRowFromValues("バッター",		619,	"打つ気なし",	"");
			addRowFromValues("バッター",		7,		"バットの先",	"");
			addRowFromValues("バッター",		146,	"打ち損じ",	"");
			addRowFromValues("バッター",		144,	"打者のけぞる",	"");
			addRowFromValues("バッター",		148,	"打者悔しがる",	"");
			addRowFromValues("バッター",		149,	"判定不服",	"");
			addRowFromValues("バッター",		620,	"死球頭部直撃",	"");
			addRowFromValues("バッター",		621,	"ランニングホームラン",	"");
			addRowFromValues("バッター",		165,	"インフィールドフライ",	"");
			addRowFromValues("バッター",		412,	"エンタイトルツーベース",	"");
			addRowFromValues("バッター",		622,	"サイクルヒット達成",	"");
			addRowFromValues("打球",				623,	"自打球",	"");
			addRowFromValues("打球",				13,		"ボテボテ",	"");
			addRowFromValues("打球",				624,	"ファールチップ",	"");
			addRowFromValues("打球",				182,	"フェンス直撃",	"");
			addRowFromValues("打球",				181,	"フェンスギリギリ",	"");
			addRowFromValues("打球",				625,	"投手直撃",	"");
			addRowFromValues("打球",				626,	"弾丸ライナー",	"");
			addRowFromValues("打球",				627,	"投手のグラブをはじく",	"");
			addRowFromValues("打球",				167,	"強襲",	"");
			addRowFromValues("打球",				5,		"ポテン",	"");
			addRowFromValues("打球",				168,	"バウンド高い",	"");
			addRowFromValues("打球",				166,	"イレギュラー",	"");
			addRowFromValues("打球",				174,	"野手の正面をつく",	"");
			addRowFromValues("打球",				179,	"天井直撃",	"");
			addRowFromValues("打球",				628,	"１塁ベース直撃",	"");
			addRowFromValues("打球",				629,	"２塁ベース直撃",	"");
			addRowFromValues("打球",				630,	"３塁ベース直撃",	"");
			addRowFromValues("打球",				631,	"高々と舞い上がる",	"");
			addRowFromValues("打球",				632,	"打球カメラマン席に入る",	"");
			addRowFromValues("打球",				633,	"打球ベンチに入る",	"");
			addRowFromValues("打球",				634,	"打球ライナーコーチに当たる",	"");
			addRowFromValues("打球",				635,	"打球マウンドに当たる",	"");
			addRowFromValues("本塁打",			636,	"スタンドギリギリ",	"");
			addRowFromValues("本塁打",			160,	"スタンド中段",	"");
			addRowFromValues("本塁打",			161,	"スタンド上段",	"");
			addRowFromValues("本塁打",			637,	"バックスクリーン",	"");
			addRowFromValues("本塁打",			638,	"バックスクリーン右",	"");
			addRowFromValues("本塁打",			639,	"バックスクリーン左",	"");
			addRowFromValues("本塁打",			159,	"ポール直撃",	"");
			addRowFromValues("本塁打",			158,	"ポール巻く",	"");
			addRowFromValues("本塁打",			157,	"看板直撃",	"");
			addRowFromValues("本塁打",			156,	"場外ホームラン",	"");
			addRowFromValues("走者",				589,	"タッチアップ",	"打者走者");
			addRowFromValues("走者",				390,	"タッチアップ",	"１塁走者",	"");
			addRowFromValues("走者",				391,	"タッチアップ",	"２塁走者",	"");
			addRowFromValues("走者",				3,		"タッチアップ",	"３塁走者",	"");
			addRowFromValues("走者",				406,	"ヘッドスライディング",	"打者走者",	"");
			addRowFromValues("走者",				407,	"ヘッドスライディング",	"１塁走者",	"");
			addRowFromValues("走者",				408,	"ヘッドスライディング",	"２塁走者",	"");
			addRowFromValues("走者",				409,	"ヘッドスライディング",	"３塁走者",	"");
			addRowFromValues("走者",				348,	"スライディング",	"打者走者",	"");
			addRowFromValues("走者",				349,	"スライディング",	"１塁走者",	"");
			addRowFromValues("走者",				350,	"スライディング",	"２塁走者",	"");
			addRowFromValues("走者",				351,	"スライディング",	"３塁走者",	"");
			addRowFromValues("走者",				590,	"挟まれる",	"打者走者",	"");
			addRowFromValues("走者",				591,	"挟まれる",	"１塁走者",	"");
			addRowFromValues("走者",				592,	"挟まれる",	"２塁走者",	"");
			addRowFromValues("走者",				593,	"挟まれる",	"３塁走者",	"");
			addRowFromValues("走者",				594,	"好走塁",	"打者走者",	"");
			addRowFromValues("走者",				595,	"好走塁",	"１塁走者",	"");
			addRowFromValues("走者",				596,	"好走塁",	"２塁走者",	"");
			addRowFromValues("走者",				597,	"好走塁",	"３塁走者",	"");
			addRowFromValues("走者",				598,	"走者戻れず",	"打者走者",	"");
			addRowFromValues("走者",				599,	"走者戻れず",	"１塁走者",	"");
			addRowFromValues("走者",				600,	"走者戻れず",	"２塁走者",	"");
			addRowFromValues("走者",				601,	"走者戻れず",	"３塁走者",	"");
			addRowFromValues("走者",				212,	"本塁タックル",	"打者走者",	"");
			addRowFromValues("走者",				213,	"本塁タックル",	"１塁走者",	"");
			addRowFromValues("走者",				214,	"本塁タックル",	"２塁走者",	"");
			addRowFromValues("走者",				215,	"本塁タックル",	"３塁走者",	"");
			addRowFromValues("走者",				602,	"ゲッツー崩し",	"打者走者",	"");
			addRowFromValues("走者",				211,	"ゲッツー崩し",	"１塁走者",	"");
			addRowFromValues("走者",				603,	"ゲッツー崩し",	"２塁走者",	"");
			addRowFromValues("走者",				604,	"ゲッツー崩し",	"３塁走者",	"");
			addRowFromValues("走者",				203,	"オーバーラン",	"打者走者",	"");
			addRowFromValues("走者",				204,	"オーバーラン",	"１塁走者",	"");
			addRowFromValues("走者",				205,	"オーバーラン",	"２塁走者",	"");
			addRowFromValues("走者",				206,	"オーバーラン",	"３塁走者",	"");
			addRowFromValues("走者",				207,	"暴走",	"打者走者",	"");
			addRowFromValues("走者",				208,	"暴走",	"１塁走者",	"");
			addRowFromValues("走者",				209,	"暴走",	"２塁走者",	"");
			addRowFromValues("走者",				210,	"暴走",	"３塁走者",	"");
			addRowFromValues("走者",				363,	"守備妨害",	"打者走者",	"");
			addRowFromValues("走者",				226,	"守備妨害",	"１塁走者",	"");
			addRowFromValues("走者",				227,	"守備妨害",	"２塁走者",	"");
			addRowFromValues("走者",				228,	"守備妨害",	"３塁走者",	"");
			addRowFromValues("走者",				605,	"走者転倒",	"打者走者",	"");
			addRowFromValues("走者",				606,	"走者転倒",	"１塁走者",	"");
			addRowFromValues("走者",				607,	"走者転倒",	"２塁走者",	"");
			addRowFromValues("走者",				608,	"走者転倒",	"３塁走者",	"");
			addRowFromValues("走者",				609,	"打球が走者直撃",	"打者走者");
			addRowFromValues("走者",				610,	"打球が走者直撃",	"１塁走者");
			addRowFromValues("走者",				611,	"打球が走者直撃",	"２塁走者");
			addRowFromValues("走者",				612,	"打球が走者直撃",	"３塁走者");
			addRowFromValues("その他",			16,		"併殺",	"");
			addRowFromValues("その他",			19,		"三重殺",	"");
			addRowFromValues("その他",			411,	"好プレイ",	"");
			addRowFromValues("その他",			410,	"珍プレイ",	"");
			addRowFromValues("その他",			417,	"間一髪",	"");
			addRowFromValues("その他",			418,	"ブーイング",	"");
			addRowFromValues("その他",			107,	"監督マウンドへ",	"");
			addRowFromValues("その他",			15,		"コーチマウンドへ",	"");
			addRowFromValues("その他",			108,	"捕手マウンドへ",	"");
			addRowFromValues("その他",			109,	"内野手マウンドへ",	"");
			addRowFromValues("その他",			17,		"抗議中",	"");
			addRowFromValues("その他",			18,		"中断中",	"");
			addRowFromValues("その他",			105,	"治療中",	"");
			addRowFromValues("その他",			14,		"乱闘",	"");
			addRowFromValues("その他",			103,	"観客乱入",	"");
			addRowFromValues("その他",			419,	"審判協議中",	"");
			addRowFromValues("その他",			420,	"観客フェンス乗り出し妨害",	"");
			addRowFromValues("その他",			421,	"花火が上がる",	"");
			addRowFromValues("その他",			362,	"牽制アウト",	"");
			addRowFromValues("交代",				640,	"ノックアウト",	"");
			addRowFromValues("交代",				346,	"退場",												"");
			addRowFromValues("交代",				347,	"監督退場",										"");
			addRowFromValues("交代",				641,	"負傷交代",										"");
			addRowFromValues("サヨナラ",		400,	"サヨナラ",										"");
			addRowFromValues("サヨナラ",		399,	"サヨナラホームラン",						"");
			addRowFromValues("サヨナラ",		398,	"サヨナラ満塁ホームラン",				"");
			addRowFromValues("サヨナラ",		397,	"代打サヨナラホームラン",				"");
			addRowFromValues("サヨナラ",		396,	"代打サヨナラ満塁ホームラン",		"");
			addRowFromValues("サヨナラ",		642,	"サヨナラランニングホームラン",	"");
			addRowFromValues("終了情報",		403,	"放棄試合",										"");
			addRowFromValues("終了情報",		401,	"降雪コールド",								"");
			addRowFromValues("終了情報",		405,	"降雨コールド",								"");
			addRowFromValues("終了情報",		402,	"サスペンデッドゲーム",					"");
			addRowFromValues("終了情報",		404,	"ノーゲーム",									"");
			addRowFromValues("野手",				238,	"ダイビングキャッチ",						"投手");
			addRowFromValues("野手",				239,	"ダイビングキャッチ",						"捕手");
			addRowFromValues("野手",				240,	"ダイビングキャッチ",						"１塁手");
			addRowFromValues("野手",				241,	"ダイビングキャッチ",						"２塁手");
			addRowFromValues("野手",				242,	"ダイビングキャッチ",						"３塁手");
			addRowFromValues("野手",				243,	"ダイビングキャッチ",						"遊撃手");
			addRowFromValues("野手",				244,	"ダイビングキャッチ",						"左翼手");
			addRowFromValues("野手",				245,	"ダイビングキャッチ",						"中堅手");
			addRowFromValues("野手",				246,	"ダイビングキャッチ",						"右翼手");
			addRowFromValues("野手",				422,	"ジャンピングキャッチ",					"投手");
			addRowFromValues("野手",				423,	"ジャンピングキャッチ",					"捕手");
			addRowFromValues("野手",				424,	"ジャンピングキャッチ",					"１塁手");
			addRowFromValues("野手",				425,	"ジャンピングキャッチ",					"２塁手");
			addRowFromValues("野手",				426,	"ジャンピングキャッチ",					"３塁手");
			addRowFromValues("野手",				427,	"ジャンピングキャッチ",					"遊撃手");
			addRowFromValues("野手",				428,	"ジャンピングキャッチ",					"左翼手");
			addRowFromValues("野手",				429,	"ジャンピングキャッチ",					"中堅手");
			addRowFromValues("野手",				430,	"ジャンピングキャッチ",					"右翼手");
			addRowFromValues("野手",				229,	"スライディングキャッチ",				"投手");
			addRowFromValues("野手",				230,	"スライディングキャッチ",				"捕手");
			addRowFromValues("野手",				231,	"スライディングキャッチ",				"１塁手");
			addRowFromValues("野手",				232,	"スライディングキャッチ",				"２塁手");
			addRowFromValues("野手",				233,	"スライディングキャッチ",				"３塁手");
			addRowFromValues("野手",				234,	"スライディングキャッチ",				"遊撃手");
			addRowFromValues("野手",				235,	"スライディングキャッチ",				"左翼手");
			addRowFromValues("野手",				236,	"スライディングキャッチ",				"中堅手");
			addRowFromValues("野手",				237,	"スライディングキャッチ",				"右翼手");
			addRowFromValues("野手",				431,	"好プレイ",	"投手");
			addRowFromValues("野手",				432,	"好プレイ",	"捕手");
			addRowFromValues("野手",				433,	"好プレイ",	"１塁手");
			addRowFromValues("野手",				434,	"好プレイ",	"２塁手");
			addRowFromValues("野手",				435,	"好プレイ",	"３塁手");
			addRowFromValues("野手",				436,	"好プレイ",	"遊撃手");
			addRowFromValues("野手",				437,	"好プレイ",	"左翼手");
			addRowFromValues("野手",				438,	"好プレイ",	"中堅手");
			addRowFromValues("野手",				439,	"好プレイ",	"右翼手");
			addRowFromValues("野手",				440,	"珍プレイ",	"投手");
			addRowFromValues("野手",				441,	"珍プレイ",	"捕手");
			addRowFromValues("野手",				442,	"珍プレイ",	"１塁手");
			addRowFromValues("野手",				443,	"珍プレイ",	"２塁手");
			addRowFromValues("野手",				444,	"珍プレイ",	"３塁手");
			addRowFromValues("野手",				445,	"珍プレイ",	"遊撃手");
			addRowFromValues("野手",				446,	"珍プレイ",	"左翼手");
			addRowFromValues("野手",				447,	"珍プレイ",	"中堅手");
			addRowFromValues("野手",				448,	"珍プレイ",	"右翼手");
			addRowFromValues("野手",				449,	"素手で捕球",	"投手");
			addRowFromValues("野手",				450,	"素手で捕球",	"捕手");
			addRowFromValues("野手",				451,	"素手で捕球",	"１塁手");
			addRowFromValues("野手",				452,	"素手で捕球",	"２塁手");
			addRowFromValues("野手",				453,	"素手で捕球",	"３塁手");
			addRowFromValues("野手",				454,	"素手で捕球",	"遊撃手");
			addRowFromValues("野手",				455,	"素手で捕球",	"左翼手");
			addRowFromValues("野手",				456,	"素手で捕球",	"中堅手");
			addRowFromValues("野手",				457,	"素手で捕球",	"右翼手");
			addRowFromValues("野手",				458,	"ライン際の打球を見送る",	"投手");
			addRowFromValues("野手",				459,	"ライン際の打球を見送る",	"捕手");
			addRowFromValues("野手",				460,	"ライン際の打球を見送る",	"１塁手");
			addRowFromValues("野手",				461,	"ライン際の打球を見送る",	"２塁手");
			addRowFromValues("野手",				462,	"ライン際の打球を見送る",	"３塁手");
			addRowFromValues("野手",				463,	"ライン際の打球を見送る",	"遊撃手");
			addRowFromValues("野手",				464,	"ライン際の打球を見送る",	"左翼手");
			addRowFromValues("野手",				465,	"ライン際の打球を見送る",	"中堅手");
			addRowFromValues("野手",				466,	"ライン際の打球を見送る",	"右翼手");
			addRowFromValues("野手",				467,	"打球処理もたつく",	"投手");
			addRowFromValues("野手",				468,	"打球処理もたつく",	"捕手");
			addRowFromValues("野手",				469,	"打球処理もたつく",	"１塁手");
			addRowFromValues("野手",				470,	"打球処理もたつく",	"２塁手");
			addRowFromValues("野手",				471,	"打球処理もたつく",	"３塁手");
			addRowFromValues("野手",				472,	"打球処理もたつく",	"遊撃手");
			addRowFromValues("野手",				473,	"打球処理もたつく",	"左翼手");
			addRowFromValues("野手",				474,	"打球処理もたつく",	"中堅手");
			addRowFromValues("野手",				475,	"打球処理もたつく",	"右翼手");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static SupplementDataTable getInstance() {
		return instance;
  }

}
