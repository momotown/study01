package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class ErrorDataTable extends DataTable {

	private static final ErrorDataTable instance = new ErrorDataTable();

	public ErrorDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(0,		"ファウル");
			addRowFromValues(1,		"WP");
			addRowFromValues(2,		"PB");
			addRowFromValues(3,		"TUNNEL");
			addRowFromValues(4,		"THROUGH");
			addRowFromValues(5,		"FC");
			addRowFromValues(9,		"捕球ﾐｽ");
			addRowFromValues(10,	"送球ﾐｽ");
			addRowFromValues(12,	"落球");
			addRowFromValues(13,	"悪送球");
			addRowFromValues(14,	"ファンブル");
			addRowFromValues(15,	"走塁妨害");
			addRowFromValues(16,	"ミスプレー");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static ErrorDataTable getInstance() {
		return instance;
  }

}
