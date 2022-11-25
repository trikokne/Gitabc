package loginModule_pom_withddf;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass_login 
{
	public static void main(String[]args) throws EncryptedDocumentException, IOException
	{
	  FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx");	
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	  String usn = sh.getRow(0).getCell(0).getStringCellValue();
	  String psw = sh.getRow(0).getCell(1).getStringCellValue();
	  String pin = sh.getRow(0).getCell(2).getStringCellValue();
	  String vuid = sh.getRow(0).getCell(3).getStringCellValue();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://login-v2.upstox.com/");
	 //creating and calling methods from 1st pom class
	 login1page obj1=new login1page(driver);
	 obj1.username(usn);
	 obj1.PWD(psw);
	 obj1.click(); 
	 //2nd POM class
	 login2page obj2=new login2page(driver);
	 obj2.passcode(pin);
	 //3rd POM class
	 login3page obj3=new login3page(driver);
	 obj3.welcomepage();
	 //4th POM class
	 login4page obj4=new login4page(driver);
	 obj4.verifyuid();
	}
}
