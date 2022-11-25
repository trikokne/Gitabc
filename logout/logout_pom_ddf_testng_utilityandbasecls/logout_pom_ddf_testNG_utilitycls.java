package logout_pom_ddf_testng_utilityandbasecls;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class logout_pom_ddf_testNG_utilitycls 
{
	public static String getTD(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\trimurti\\eclipse-workspace\\Upstox_Framework\\Testdata\\demo1.xlsx");
          Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1"); 
          String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
          return value;
	}
	public static void capturescreenshot(WebDriver driver,int Testcaseid) throws IOException
	{
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File dest=new File("C:\\Users\\trimurti\\eclipse-workspace\\Upstox_Framework\\screenshot\\TRI"+Testcaseid+".jpeg");
	  FileHandler.copy(src, dest);
	}
	public static String getproperties(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\trimurti\\eclipse-workspace\\Upstox_Framework\\logout.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
		
	}
	
	

}
