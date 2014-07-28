package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class ResultDataTable extends DataTable {

	private static final ResultDataTable instance = new ResultDataTable();

	public ResultDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(0,		"Nothing");
			addRowFromValues(1,		"ファウル");
			addRowFromValues(2,		"ﾋｯﾄｺﾞﾛ");
			addRowFromValues(3,		"ﾋｯﾄﾗｲﾅｰ");
			addRowFromValues(4,		"ﾋｯﾄﾌﾗｲ");
			addRowFromValues(5,		"死球");
			addRowFromValues(6,		"2塁打");
			addRowFromValues(8,		"3塁打");
			addRowFromValues(9,		"本塁打");
			addRowFromValues(10,	"ｴﾗｰ出塁");
			addRowFromValues(11,	"ゴロ");
			addRowFromValues(12,	"フライ");
			addRowFromValues(13,	"ライナー");
			addRowFromValues(14,	"犠打");
			addRowFromValues(15,	"犠飛");
			addRowFromValues(16,	"空振り");
			addRowFromValues(17,	"見逃し");
			addRowFromValues(18,	"ボール");
			addRowFromValues(19,	"四球");
			addRowFromValues(24,	"ボーク");
			addRowFromValues(25,	"OFFENSIVE INTERFERE");
			addRowFromValues(26,	"DEFENSIVE INTERFERE");
			addRowFromValues(28,	"振逃げ");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static ResultDataTable getInstance() {
		return instance;
  }

}
