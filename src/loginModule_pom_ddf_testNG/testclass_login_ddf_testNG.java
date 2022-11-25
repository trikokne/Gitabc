package loginModule_pom_ddf_testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testclass_login_ddf_testNG
{
	WebDriver driver;
	Sheet sh;
	login1page obj1;
	login2page obj2;
	login3page obj3;
	login4page obj4;
	@BeforeClass()
	public void browseropen() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx");
	    sh = WorkbookFactory.create(file).getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://login-v2.upstox.com/");
		obj1=new login1page(driver);
		obj2=new login2page(driver);
		obj3=new login3page(driver);
		obj4=new login4page(driver);
	}
	@BeforeMethod
	public void loginapp()
	{   
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		obj1.username(UN);
		String PW = sh.getRow(0).getCell(1).getStringCellValue();
		obj1.PWD(PW);
		obj1.click();
		
		String PC = sh.getRow(0).getCell(2).getStringCellValue();
		obj2.passcode(PC);
		
		obj3.welcomepage();
		
	}
	@Test
	public void verifyUID()
	{
		String expid = sh.getRow(0).getCell(3).getStringCellValue();
		String actid = obj4.verifyuid();
		Assert.assertEquals(actid, expid,"TC is passed");
	}
	@AfterMethod
	public void logout()
	{
		
	}
	@AfterClass()
	public void browserclose()
	{
		driver=null;
		sh=null;
		obj1=null;
		obj2=null;
		obj3=null;
		obj4=null;
	}
	

}
