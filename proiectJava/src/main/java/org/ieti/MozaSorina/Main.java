package org.ieti.MozaSorina;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "./build/resources/main/retete.xlsx";
        XSSFWorkbook workbook = FileUtils.readFile(path);

        ExcelService excelService = new ExcelService(workbook);
        String[] headers = excelService.getHeaders();
        String[][] content = excelService.getContent();

        TableBuilder tableBuilder = new TableBuilder();
        tableBuilder.buildTable(content, headers);
    }

}