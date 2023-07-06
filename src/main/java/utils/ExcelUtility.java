package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static String[][] readExcel(String fname) throws IOException {
		// TODO Auto-generated method stub
		
	XSSFWorkbook workbook_obj = new XSSFWorkbook("./Testexcel/"+fname+".xlsx");
	XSSFSheet sheet_obj = workbook_obj.getSheetAt(0);
	int rowNum = sheet_obj.getLastRowNum();
	int  lastCellNum = sheet_obj.getRow(0).getLastCellNum();
     String[][] data = new String[rowNum][lastCellNum];	
	for (int i = 1; i <=rowNum ; i++) {
		XSSFRow row = sheet_obj.getRow(i);
		for (int j = 0; j <lastCellNum ; j++) {
			String stringCellValue = row.getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
			data[i-1][j] = stringCellValue;
			
			
		}
		
	}
	
	workbook_obj.close();
	return data;
			}
	
			
		}


