package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class FormationDataTable extends DataTable {

	private static final FormationDataTable instance = new FormationDataTable();

	public FormationDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",		ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",	ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(1,	"前進守備");
			addRowFromValues(2,	"バントシフト");
			addRowFromValues(3,	"中間守備");
			addRowFromValues(4,	"ライン際");
			addRowFromValues(5,	"特別打者シフト");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static FormationDataTable getInstance() {
		return instance;
  }

}
