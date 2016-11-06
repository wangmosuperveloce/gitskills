import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import enhance.SupplementaryHouseFund;
import enhance.SupplementaryInsurances;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddressList;

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

        String[] list = {"东软", "华信", "SAP", "海辉"};

        new POI().createListBox(list);

        return;

    }

    public void createListBox(String[] list)

    {
        //文件初始化
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("new sheet");
        //在第一行第一个单元格，插入下拉框
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell = row.createCell(0);
        //普通写入操作
        cell.setCellValue("请选择");//这是实验
        //生成下拉列表
        //只对（0，0）单元格有效
        CellRangeAddressList regions = new CellRangeAddressList(0, 9, 0, 0);
        //生成下拉框内容
        DVConstraint constraint = DVConstraint.createExplicitListConstraint(list);
        //绑定下拉框和作用区域
        HSSFDataValidation data_validation = new HSSFDataValidation(regions, constraint);
        //对sheet页生效
        sheet.addValidationData(data_validation);
        //写入文件
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream("workbook.xls");
            wb.write(fileOut);
            fileOut.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //结束
        System.out.println("Over");
    }







//    public static void dropDownList42007(String dataSource, String filePath)
//            throws Exception {
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        XSSFSheet sheet = workbook.createSheet("下拉列表测试");
//        String[] datas = dataSource.split("\\,");
//        XSSFDataValidationHelper dvHelper = new XSSFDataValidationHelper(sheet);
//        XSSFDataValidationConstraint dvConstraint = (XSSFDataValidationConstraint) dvHelper
//                .createExplicitListConstraint(datas);
//        CellRangeAddressList addressList = null;
//        XSSFDataValidation validation = null;
//        for (int i = 0; i < 100; i++) {
//            addressList = new CellRangeAddressList(i, i, 0, 0);
//            validation = (XSSFDataValidation) dvHelper.createValidation(
//                    dvConstraint, addressList);
//            // 07默认setSuppressDropDownArrow(true);
//            // validation.setSuppressDropDownArrow(true);
//            // validation.setShowErrorBox(true);
//            sheet.addValidationData(validation);
//        }
//        FileOutputStream stream = new FileOutputStream(filePath);
//        workbook.write(stream);
//        stream.close();
//        addressList = null;
//        validation = null;
//    }
}