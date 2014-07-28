package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class PlanDataTable extends DataTable {

	private static final PlanDataTable instance = new PlanDataTable();

	public PlanDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(0,		"ファウル");
			addRowFromValues(1,		"敬遠");
			addRowFromValues(3,		"バント構え");
			addRowFromValues(10,	"バント失敗");
			addRowFromValues(11,	"スクイズ失敗");
			addRowFromValues(13,	"スクイズ構え");
			addRowFromValues(14,	"ヒットエンドラン");
			addRowFromValues(15,	"ランエンドヒット");
			addRowFromValues(16,	"バスターエンドラン");
			addRowFromValues(17,	"バスター");
			addRowFromValues(20,	"ダブルスティール");
			addRowFromValues(22,	"ギャンブルスティール");
			addRowFromValues(29,	"隠し球");
			addRowFromValues(32,	"バントファウル");
			addRowFromValues(33,	"バント空振り");
			addRowFromValues(34,	"スリーバント失敗");
			addRowFromValues(36,	"スクイズファウル");
			addRowFromValues(37,	"牽制アウト");
			addRowFromValues(102,	"ウエスト");
			addRowFromValues(103,	"セーフティバント");
			addRowFromValues(104,	"プッシュバント");
			addRowFromValues(105,	"ドラッグバント");
			addRowFromValues(106,	"スクイズ");
			addRowFromValues(107,	"セーフティスクイズ");
			addRowFromValues(112,	"バントエンドラン");
			addRowFromValues(119,	"ディレイドスティール");
			addRowFromValues(123,	"盗塁失敗");
			addRowFromValues(127,	"盗塁成功");
			addRowFromValues(158,	"バント");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static PlanDataTable getInstance() {
		return instance;
  }

}
