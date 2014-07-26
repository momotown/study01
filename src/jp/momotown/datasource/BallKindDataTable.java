package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class BallKindDataTable extends DataTable {

	private static final BallKindDataTable instance = new BallKindDataTable();

	public BallKindDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(0,		"ファウル");
			addRowFromValues(1,		"ストレート");
			addRowFromValues(2,		"カーブ");
			addRowFromValues(3,		"シュート");
			addRowFromValues(4,		"スライダー");
			addRowFromValues(5,		"フォーク");
			addRowFromValues(6,		"シンカー");
			addRowFromValues(7,		"チェンジアップ");
			addRowFromValues(8,		"特殊球");
			addRowFromValues(9,		"カットボール");
			addRowFromValues(10,	"無指定");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static BallKindDataTable getInstance() {
		return instance;
  }

}
