package com.vasu.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingTest {

	public static void main(String[] args) throws IOException
	{
File src=new File("C:\\Users\\vasu\\Desktop\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(src);
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		ws.getRow(1).createCell(2).setCellValue("VasuDeva");
		ws.getRow(2).createCell(2).setCellValue("Qedge");
		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		wb.close();
		
	}

}
