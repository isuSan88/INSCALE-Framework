package com.automation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ReadXL {
		@DataProvider(name="AddCustomer")
		public String[][] getData(String excelSheetName) throws EncryptedDocumentException, IOException 
		{
			File f= new File(System.getProperty("user.dir")+"./TestData/Data.xlsx");
			FileInputStream fis= new FileInputStream(f);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheetName=wb.getSheet(excelSheetName);
			
			int totalRows = sheetName.getLastRowNum();
			Row rowCells = sheetName.getRow(0);
			int totalCols= rowCells.getLastCellNum();
			
			DataFormatter format =new DataFormatter();
			
			String testData[][]= new String[totalRows][totalCols];
			
			for( int i=0; i<=totalRows;i++) {
				
				for (int j=0; j<totalCols;j++) {
					testData[i][j]= format.formatCellValue(sheetName.getRow(i).getCell(j));
					
				}
			}
			
			return testData;
			
		}

		public String getData() {
			// TODO Auto-generated method stub
			return null;
		}
		

}
