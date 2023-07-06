package testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import base.BaseHooks;
import utils.ExcelUtility;

public class TestDataProvider  {
	public String ExcelFileName;
	
	@DataProvider(name="sendData")
	public String[][] sendData() throws IOException {
		
		return  ExcelUtility.readExcel(ExcelFileName);

		
	}

}
