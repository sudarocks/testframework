package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import testdata.TestDataProvider;
import utils.ExcelUtility;



public class BaseHooks extends TestDataProvider {

	public ChromeDriver driver;
	
 @Parameters({"url","username","password"})
	@BeforeMethod	
	public  void precondition(String url, String uname, String pw)
	{
    	 
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.id("username")).sendKeys(uname);
	driver.findElement(By.id("password")).sendKeys(pw);
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
}
	
	@AfterMethod
	public void postcondition()
	{
		driver.close();
	}
	
	
	
	

}


