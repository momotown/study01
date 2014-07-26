package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class BattingStyleDataTable extends DataTable {

	private static final BattingStyleDataTable instance = new BattingStyleDataTable();

	public BattingStyleDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",		ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",	ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(1,	"スクエア＆スタンディング");
			addRowFromValues(2,	"スクエア＆クラウチング");
			addRowFromValues(3,	"オープン＆スタンディング");
			addRowFromValues(4,	"オープン＆クラウチング");
			addRowFromValues(5,	"クローズ＆スタンディング");
			addRowFromValues(6,	"クローズ＆クラウチング");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static BattingStyleDataTable getInstance() {
		return instance;
  }

}
