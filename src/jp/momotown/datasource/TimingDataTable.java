package jp.momotown.datasource;

import java.util.ArrayList;
import java.util.List;

import com.google.visualization.datasource.base.TypeMismatchException;
import com.google.visualization.datasource.datatable.ColumnDescription;
import com.google.visualization.datasource.datatable.DataTable;
import com.google.visualization.datasource.datatable.value.ValueType;

public class TimingDataTable extends DataTable {

	private static final TimingDataTable instance = new TimingDataTable();

	public TimingDataTable() {
  	List<ColumnDescription> cd = new ArrayList<ColumnDescription>();
		cd.add(new ColumnDescription("id",			ValueType.NUMBER,	"ID"));
		cd.add(new ColumnDescription("name",		ValueType.TEXT,		"名称"));
		
		addColumns(cd);
		
		try {
			addRowFromValues(10002,		"一球毎");
			addRowFromValues(10003,		"一けん制死");
			addRowFromValues(10004,		"一走塁死");
			addRowFromValues(10005,		"一妨害死");
			addRowFromValues(10006,		"一けん制");
			addRowFromValues(10007,		"一走塁");
			addRowFromValues(10008,		"一妨害");
			addRowFromValues(10009,		"一投球遅延");
			addRowFromValues(10010,		"一ボーク");
			addRowFromValues(10011,		"一作戦補足");
			addRowFromValues(10012,		"一打者打席に立つ");
			addRowFromValues(10014,		"一終了イニング");
			addRowFromValues(10025,		"一選手交代");
			addRowFromValues(11002,		"一訂正一球毎");
			addRowFromValues(11003,		"一訂正一けん制死");
			addRowFromValues(11004,		"一訂正一走塁死");
			addRowFromValues(11005,		"一訂正一妨害死");
			addRowFromValues(11006,		"一訂正一けん制");
			addRowFromValues(11007,		"一訂正一走塁");
			addRowFromValues(11008,		"一訂正一妨害");
			addRowFromValues(11009,		"一訂正一投球遅延");
			addRowFromValues(11010,		"一訂正一ボーク");
			addRowFromValues(11011,		"一訂正一作戦補足");
			addRowFromValues(11012,		"一訂正一打者打席に立つ");
			addRowFromValues(11014,		"一訂正一終了イニング");
			addRowFromValues(11025,		"一訂正一選手交代");
		} catch (TypeMismatchException e) {
			e.printStackTrace();
		}
	}

	public static TimingDataTable getInstance() {
		return instance;
  }

}
