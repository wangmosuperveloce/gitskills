import lombok.Data;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import java.util.List;

/**
 * Created by hanjunnan on 16/3/3.
 */
@Data
public class ExportExcelColumnItem {

    private String title;

    private String comment;

    private Integer columnCellType;

    private Integer cellLength;

    private CellStyle titleCellStyle;

    private CellStyle columnCellStyle;


    private List<String> optionsList;

    public ExportExcelColumnItem(String title, Integer columnCellType, Integer cellLength, CellStyle titleCellStyle, CellStyle columnCellStyle) {
        this.title = title;
        this.columnCellType = columnCellType;
        this.cellLength = cellLength;
        this.titleCellStyle = titleCellStyle;
        this.columnCellStyle = columnCellStyle;
    }

    public ExportExcelColumnItem(String title, String comment, Integer columnCellType, Integer cellLength, XSSFCellStyle titleCellStyle, XSSFCellStyle columnCellStyle) {
        this.title = title;
        this.comment = comment;
        this.columnCellType = columnCellType;
        this.cellLength = cellLength;
        this.titleCellStyle = titleCellStyle;
        this.columnCellStyle = columnCellStyle;
    }

    public ExportExcelColumnItem(String title, String comment, List<String> optionsList, Integer columnCellType, Integer cellLength, XSSFCellStyle titleCellStyle, XSSFCellStyle columnCellStyle) {
        this.title = title;
        this.comment = comment;
        this.optionsList = optionsList;
        this.columnCellType = columnCellType;
        this.cellLength = cellLength;
        this.titleCellStyle = titleCellStyle;
        this.columnCellStyle = columnCellStyle;
    }
}
