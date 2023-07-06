package testsuites;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseHooks;

public class TestNewOpp  extends BaseHooks{

	@BeforeTest
	public void SetValues() {
		// TODO Auto-generated method stub
		ExcelFileName="sud";
	}
	
@Test(dataProvider="sendData")    //(groups = {"Smoke"})
 public void CreateL(String cname, String fname, String lname)
 {
	    driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
}





}
