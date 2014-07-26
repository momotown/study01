package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class PitchingStyleDataTable extends DataTable {

	private static final PitchingStyleDataTable instance = new PitchingStyleDataTable();

	public PitchingStyleDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",		ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",	ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(1,	"オーバースロー");
			addRowFromValues(2,	"スリークォーター");
			addRowFromValues(3,	"サイドスロー");
			addRowFromValues(4,	"アンダースロー");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static PitchingStyleDataTable getInstance() {
		return instance;
  }

}
