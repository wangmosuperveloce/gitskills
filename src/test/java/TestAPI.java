import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.jooq.util.derby.sys.Sys;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by wangmo on 2016/11/8.
 */

public class TestAPI {

    @Test
    public void trySomething() {
        try {
            throw new IllegalStateException("nishishenmeyichang");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            System.out.println(e.getMessage());
        }
    }

    private int abc () {
        int x = 0;
        try {
            x = 1;
            if (x == 1) throw new RuntimeException();
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    @Test
    public void testResource() {
        URL url = Thread.currentThread().getContextClassLoader().getResource(".");
        String classes = url.getFile();
        print(classes);
        File targetClassesFolder = new File(classes);
        String parentPath = targetClassesFolder.getParentFile().getParent();
        print(parentPath);
    }

    @Test
    public void testCrmPOI() {
        XSSFWorkbook workbook = new XSSFWorkbook();
        String fileName = "CRM_TEST.xlsx";
        XSSFSheet customerSheet = workbook.createSheet("客户列表");

        XSSFCellStyle customerTitleStyle = getImportTitleCellStyle(workbook, IndexedColors.LIGHT_TURQUOISE);
        XSSFCellStyle customerColumnStyle = getImportColumnCellStyle(workbook);
        XSSFCellStyle commentDateStyle = getImportDateCellStyle(workbook);

        new ExportExcelColumnItem("客户名称（必填）", "客户名称：必填，最多100个字符", XSSFCell.CELL_TYPE_STRING, 20 * 256, customerTitleStyle, customerColumnStyle);

        fillImportTitle(null,null,1,null,1);

        fillRow(null,0,0,null,0,null);
    }

    @Test
    public void testPOI() {
        try {


            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();

            HSSFRow row = sheet.createRow((short)0);
            HSSFCell cell = row.createCell((short)0);

            sheet.setColumnWidth(0,(short)(381 * 40 ));
            row.setHeight((short) (156.75 * 20 ));

            cell.setCellType(HSSFCell.ENCODING_UTF_16);// 中文处理

            HSSFCellStyle cellStyle = workbook.createCellStyle();
            cellStyle.setAlignment(HSSFCellStyle.VERTICAL_TOP); // 指定单元格居中对齐
            cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_TOP);// 指定单元格垂直居中对齐
            cellStyle.setWrapText(true);// 指定单元格自动换行

            cell.setCellStyle(cellStyle);

            HSSFFont font = workbook.createFont();
            font.setFontHeightInPoints((short) 24); // 字体高度
            font.setFontName("宋体"); // 字体
            font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 宽度

            HSSFFont font1 = workbook.createFont();
            font1.setFontHeightInPoints((short) 8); // 字体高度
            font1.setFontName("宋体"); // 字体
            font1.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD); // 宽度

            HSSFRichTextString ts= new HSSFRichTextString("      入库标签\r\n  物料名称：火灾报警探头探测器（含底座、过渡板；电气柜内安装）\r\n发运计划号：20130731-01-01\r\n\r\n     图号：CCDZ120A-220-001\r\n\r\nSAP物料号：CNR0000009938\r\n\r\n 项目名称：上海地铁6号线增购车\r\n\r\n     数量：100");

            ts.applyFont(0,10,font);
            ts.applyFont(10,ts.length(),font1);

            cell.setCellValue(ts);

            FileOutputStream fOut = new FileOutputStream("/Users/haizhi/Desktop/workbook-"+new Date()+".xls");
            workbook.write(fOut);
            fOut.flush();
            fOut.close();
            System.out.println("文件生成...");
        }catch (Exception ignored) {}
    }


    private static void print(Object o) {
        System.out.println(o);
    }


    public Row fillRow(Sheet sheet, int rowNum, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex, List<String> values) {
        Row sheetRow = sheet.createRow(rowNum);

        fillRow(sheetRow, rowHeight, columnItems, startIndex, values);
        return sheetRow;
    }

    public Row fillEmptyRow(Sheet sheet, int rowNum, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex) {
        Row sheetRow = sheet.createRow(rowNum);

        fillEmptyRow(sheetRow, rowHeight, columnItems, startIndex);
        return sheetRow;
    }

    public void fillEmptyRow(Row sheetRow, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex) {
        sheetRow.setHeightInPoints(rowHeight);
        for (int i = 0; i < columnItems.size(); i++) {
            ExportExcelColumnItem item = columnItems.get(i);
            Cell rowCell = sheetRow.createCell(startIndex + i);
            rowCell.setCellType(item.getColumnCellType());
            rowCell.setCellStyle(item.getColumnCellStyle());
            rowCell.setCellValue("");
        }
    }

    public void fillRow(Row sheetRow, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex, List<String> values) {
        sheetRow.setHeightInPoints(rowHeight);
        for (int i = 0; i < columnItems.size(); i++) {
            ExportExcelColumnItem item = columnItems.get(i);
            Cell rowCell = sheetRow.createCell(startIndex + i);
            rowCell.setCellType(item.getColumnCellType());
            rowCell.setCellStyle(item.getColumnCellStyle());
            rowCell.setCellValue(values.get(i));
        }
    }

    public Row fillTitle(Sheet sheet, int rowNum, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex) {
        Row sheetRow = sheet.createRow(rowNum);
        fillTitle(sheet, sheetRow, rowHeight, columnItems, startIndex);
        return sheetRow;
    }

    public void fillTitle(Sheet sheet, Row sheetRow, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex) {
        sheetRow.setHeightInPoints(rowHeight);
        for (int i = 0; i < columnItems.size(); i++) {
            ExportExcelColumnItem item = columnItems.get(i);
            Cell rowCell = sheetRow.createCell(startIndex + i);
            rowCell.setCellStyle(item.getTitleCellStyle());
            rowCell.setCellValue(item.getTitle());
            sheet.setColumnWidth(startIndex + i, item.getCellLength());
        }
    }

    public XSSFRow fillImportTitle(XSSFSheet sheet, int rowNum, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex) {
        XSSFRow sheetRow = sheet.createRow(rowNum);
        return fillImportTitle(sheet, sheetRow, rowHeight, columnItems, startIndex);
    }

    public XSSFRow fillImportTitle(XSSFSheet sheet, XSSFRow sheetRow, int rowHeight, List<ExportExcelColumnItem> columnItems, int startIndex) {
        Drawing drawing = sheet.createDrawingPatriarch();
        sheetRow.setHeightInPoints(rowHeight);

        for (int i = 0; i < columnItems.size(); i++) {
            ExportExcelColumnItem item = columnItems.get(i);
            sheet.setDefaultColumnStyle(startIndex + i, item.getColumnCellStyle());
            XSSFCell rowCell = sheetRow.createCell(startIndex + i);
            rowCell.setCellStyle(item.getTitleCellStyle());
            rowCell.setCellValue(item.getTitle());
            if (null != item.getComment()) {
                XSSFComment comment = (XSSFComment) drawing.createCellComment(new XSSFClientAnchor(0, 0, 0, 0, (short) 3, 3, (short) 5, 6));
                // 输入批注信息
                comment.setString(new XSSFRichTextString(item.getComment()));
                // 添加作者,选中B5单元格,看状态栏
                comment.setAuthor("weibangong");
                rowCell.setCellComment(comment);
            }
            if (null != item.getOptionsList()) {
                try {
                    dropDownList42007(sheet, i, item.getOptionsList());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            sheet.setColumnWidth(startIndex + i, item.getCellLength());
        }

        return sheetRow;
    }


    public static void dropDownList42007(XSSFSheet sheet, int column, List<String> options) throws Exception {
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        String[] date = new String[options.size()];
        options.toArray(date);
        XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper.createExplicitListConstraint(date);
        CellRangeAddressList addressList = new CellRangeAddressList(1, 1000000, column, column);
        XSSFDataValidation validation = (XSSFDataValidation) dvHelper.createValidation(dvConstraint, addressList);
        // 07默认setSuppressDropDownArrow(true);
        // validation.setSuppressDropDownArrow(true);
        validation.setShowErrorBox(true);
        sheet.addValidationData(validation);
    }

    public CellStyle getExportTitleCellStyle(SXSSFWorkbook workbook) {
        CellStyle style = getExportColumnCellStyle(workbook);
        style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
        style.setFillPattern(CellStyle.SOLID_FOREGROUND);

        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) 14);
        font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        style.setFont(font);
        return style;
    }

    public CellStyle getExportColumnCellStyle(SXSSFWorkbook workbook) {
        CellStyle style = workbook.createCellStyle();
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderBottom(XSSFCellStyle.BORDER_THIN);

        style.setVerticalAlignment(XSSFCellStyle.ALIGN_CENTER);

        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) 12);
        font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
        style.setFont(font);
        return style;
    }

    public CellStyle getExportMultiLineColumnCellStyle(SXSSFWorkbook workbook) {
        CellStyle style = getExportColumnCellStyle(workbook);

        style.setWrapText(true);
        return style;
    }

    public XSSFCellStyle getImportTitleCellStyle(XSSFWorkbook workbook, IndexedColors indexedColors) {
        XSSFCellStyle style = workbook.createCellStyle();

        XSSFFont font = workbook.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short) 12);

        style.setFont(font);

        style.setFillPattern(CellStyle.SOLID_FOREGROUND);
        style.setFillForegroundColor(indexedColors.getIndex());
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);

        style.setBorderLeft(XSSFCellStyle.BORDER_THIN);
        style.setBorderRight(XSSFCellStyle.BORDER_THIN);
        style.setBorderTop(XSSFCellStyle.BORDER_THIN);
        style.setBorderBottom(XSSFCellStyle.BORDER_THIN);

        return style;
    }

    public XSSFCellStyle getImportColumnCellStyle(XSSFWorkbook workbook) {
        XSSFCellStyle style = workbook.createCellStyle();

        XSSFFont font = workbook.createFont();
        font.setFontName("宋体");
        font.setFontHeightInPoints((short) 11);

        style.setFont(font);
        return style;
    }

    public XSSFCellStyle getImportDateCellStyle(XSSFWorkbook workbook) {
        XSSFCellStyle style = workbook.createCellStyle();
        XSSFDataFormat format = workbook.createDataFormat();
        style.setDataFormat(format.getFormat("@"));
        return style;
    }
}
