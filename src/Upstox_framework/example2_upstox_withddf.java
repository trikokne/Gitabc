package Upstox_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_upstox_withddf 
{
  public static void main(String[] args) throws EncryptedDocumentException, IOException
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://login-v2.upstox.com/");
	  FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\OneDrive\\Desktop\\selenium excel sheets\\demo1.xlsx");
	  Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2"); 
	  //Enter user ID
	  String UN = sh.getRow(0).getCell(0).getStringCellValue();
	  driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(UN);
	  //Enter the Password
	  String pw = sh.getRow(0).getCell(1).getStringCellValue();
	  driver.findElement(By.cssSelector("input[id='password']")).sendKeys(pw);
	  //click on signIn
	  driver.findElement(By.cssSelector("div[class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")).click();
	  //enter the pass code
	  String code = sh.getRow(0).getCell(2).getStringCellValue();
	  driver.findElement(By.cssSelector("input[name='yob']")).sendKeys(code);
	  //click on welcome page
	  driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	  //verify UID
	  WebElement actresult = driver.findElement(By.xpath("//span[text()='trimurti k.']"));
	                 String act = actresult.getText();
	                 String exp = "Trimurti K.";
	                 boolean result = exp.equals(act);
	                 if(result)
	                 {
	                	 System.out.println("user is valid"+" = "+result);
	                 }
	                 else
	                 {
	                	 System.out.println("user is not valid"+" = "+result);
	                 }
  }

}
