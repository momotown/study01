package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class PitchingCourseDataTable extends DataTable {

	private static final PitchingCourseDataTable instance = new PitchingCourseDataTable();

	public PitchingCourseDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("no",			ValueType.NUMBER,	"No."));
		cd.add(new ColumnDescription("row",			ValueType.NUMBER,	"Row"));
		cd.add(new ColumnDescription("column",	ValueType.NUMBER,	"Column"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(21,	1,	1);
			addRowFromValues(19,	1,	2);
			addRowFromValues(17,	1,	3);
			addRowFromValues(15,	1,	4);
			addRowFromValues(10,	1,	5);
			addRowFromValues(22,	2,	1);
			addRowFromValues(7,		2,	2);
			addRowFromValues(4,		2,	3);
			addRowFromValues(1,		2,	4);
			addRowFromValues(11,	2,	5);
			addRowFromValues(23,	3,	1);
			addRowFromValues(8,		3,	2);
			addRowFromValues(5,		3,	3);
			addRowFromValues(2,		3,	4);
			addRowFromValues(12,	3,	5);
			addRowFromValues(24,	4,	1);
			addRowFromValues(9,		4,	2);
			addRowFromValues(6,		4,	3);
			addRowFromValues(3,		4,	4);
			addRowFromValues(13,	4,	5);
			addRowFromValues(25,	5,	1);
			addRowFromValues(20,	5,	2);
			addRowFromValues(18,	5,	3);
			addRowFromValues(16,	5,	4);
			addRowFromValues(14,	5,	5);
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static PitchingCourseDataTable getInstance() {
		return instance;
  }

}
