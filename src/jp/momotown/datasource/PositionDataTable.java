package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class PositionDataTable extends DataTable {

	private static final PositionDataTable instance = new PositionDataTable();

	public PositionDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,			"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(1,		"投手");
			addRowFromValues(2,		"捕手");
			addRowFromValues(3,		"一塁手");
			addRowFromValues(4,		"二塁手");
			addRowFromValues(5,		"三塁手");
			addRowFromValues(6,		"遊撃手");
			addRowFromValues(7,		"左翼手");
			addRowFromValues(8,		"中堅手");
			addRowFromValues(9,		"右翼手");
			addRowFromValues(10,	"指名打者");
			addRowFromValues(11,	"代打");
			addRowFromValues(12,	"代走");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}


  public static PositionDataTable getInstance() {
  	return instance;
  }

}
