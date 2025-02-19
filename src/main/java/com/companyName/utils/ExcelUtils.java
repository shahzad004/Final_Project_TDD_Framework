package com.companyName.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExcelUtils {


    public static List<List<String>> readExcelFile(String fileName) throws IOException {

        List<List<String>> excelData = new ArrayList<>();

        FileInputStream file = new FileInputStream((
                Objects.requireNonNull
                                (ExcelUtils.class
                                        .getClassLoader()
                                        .getResource(fileName))
                        .getFile()
        ));

        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);




        for (Row row : sheet) {
            List<String> rowData = new ArrayList<>();
            for (Cell cell : row) {
                rowData.add(cell.toString());
            }

            excelData.add(rowData);
        }

        workbook.close();


        return excelData;
    }
}
