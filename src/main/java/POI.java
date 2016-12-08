import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import enhance.SupplementaryHouseFund;
import enhance.SupplementaryInsurances;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class POI

{

    public static void main(String[] args)

    {

        String[] list = {"不限(xiaoganshebao)",
                "不限(ezhoushebao)",
                "城镇(chongqingshebao)",
                "不限(hezeshebao)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "农村三险(tianjinshebaonongcun)",
                "上海五险(shanghaiwuxian)",
                "不限(jinanshebao)",
                "城镇(beijingshebao)",
                "不限(weihaishebao)",
                "不限(wuhanshebao)",
                "农村(beijingshebaonongcun)",
                "不限(puyangshebao)",
                "不限(yantaishebao)",
                "不限(quanzhoushebao)"};
        new POI().createListBox(list);

        return;

    }

    public void createListBox(String[] dropdownlist)

    {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("下拉列表测试");
        XSSFSheet hidden = workbook.createSheet("hidden");

        CreationHelper factory = workbook.getCreationHelper();
        for (int i = 0; i < dropdownlist.length; i++) {
            String name = dropdownlist[i];
            XSSFRow row = hidden.createRow(i);
            XSSFCell cell = row.createCell(0);


            XSSFCellStyle style = cell.getCellStyle();
            XSSFFont font = style.getFont();
            XSSFColor colour = font.getXSSFColor();
            font.setColor(IndexedColors.RED.getIndex());
            style.setFont(font);
            cell.setCellStyle(style);

            Drawing drawing = sheet.createDrawingPatriarch();
            ClientAnchor anchor = factory.createClientAnchor();
            Comment comment = drawing.createCellComment(anchor);
            RichTextString str = factory.createRichTextString("Hello, World!");
            comment.setString(str);
            cell.setCellComment(comment);



            cell.setCellValue(name);
        }
        XSSFName name = workbook.createName();
        name.setNameName("hidden");
        name.setRefersToFormula("hidden!$A$1:$A$" + dropdownlist.length);
        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper.createFormulaListConstraint("hidden");
        CellRangeAddressList addressList = new CellRangeAddressList(0, 0, 0, 0);
        XSSFDataValidation validation = (XSSFDataValidation) dvHelper.createValidation(dvConstraint, addressList);
        validation.setSuppressDropDownArrow(true);
        validation.setShowErrorBox(true);
        sheet.addValidationData(validation);
//        workbook.setSheetHidden(1, true);
        hidden.autoSizeColumn((short)0); //调整第一列宽度
//        hidden.autoSizeColumn((short)1); //调整第二列宽度
//        hidden.autoSizeColumn((short)2); //调整第三列宽度
//        hidden.autoSizeColumn((short)3); //调整第四列宽度
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream("/Users/haizhi/Desktop/workbook.xls");
            workbook.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //结束
        System.out.println("Over");
    }







    public static void dropDownList42007(String[] dropdownlist, String filePath)
            throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("下拉列表测试");
        XSSFSheet hidden = workbook.createSheet("hidden");

        for (int i = 0; i < dropdownlist.length; i++) {
            String name = dropdownlist[i];
            XSSFRow row = hidden.createRow(i);
            XSSFCell cell = row.createCell(0);
            cell.setCellValue(name);
        }

        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
        Name namedCell = workbook.createName();
        namedCell.setNameName("hidden");
        namedCell.setRefersToFormula("hidden!$A$1:$A$" + dropdownlist.length);
        DVConstraint constraint = DVConstraint.createFormulaListConstraint("hidden");
        CellRangeAddressList addressList = new CellRangeAddressList(0, 0, 0, 0);
        XSSFDataValidation validation = (XSSFDataValidation) dvHelper.createValidation(constraint, addressList);
        workbook.setSheetHidden(1, true);
        sheet.addValidationData(validation);


//        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
//        XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper
//                .createExplicitListConstraint(dropdownlist);
//        CellRangeAddressList addressList = null;
//        XSSFDataValidation validation = null;
//        for (int i = 0; i < 100; i++) {
//            addressList = new CellRangeAddressList(i, i, 0, 0);
//            validation = (XSSFDataValidation) dvHelper.createValidation(
//                    dvConstraint, addressList);
//            sheet.addValidationData(validation);
//        }
        FileOutputStream stream = new FileOutputStream(filePath);
        workbook.write(stream);
        stream.close();
        addressList = null;
        validation = null;
    }



}