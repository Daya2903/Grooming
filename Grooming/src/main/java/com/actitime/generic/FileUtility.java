package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
public String readExcelData(String sheet,int row,int cell) throws Exception {
	FileInputStream fis = new FileInputStream("./src/test/resources/testscript.xlsx");
	Workbook workbook = WorkbookFactory.create(fis);
	String value = workbook.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
public String readPropertyData(String key) throws IOException {
	FileInputStream fis = new FileInputStream("./src/test/resources/DDT.properties");
	Properties pobj = new Properties();
	pobj.load(fis);
	String value = pobj.getProperty(key);
	return value;
}
}
