 package Upstox_framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class example1_compatiblityTesting 
{
	WebDriver driver;
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) 
	{
		
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\trimurti\\Seleniu\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
			 driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\trimurti\\Selenium\\Webdriver\\firefox driver\\geckodriver-v0.32.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
		}
		else if(browsername.equals("edge"))
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\Edgedriver\\edgedriver_win64\\msedgedriver.exe");
	        driver=new EdgeDriver();	
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		//go to upstox URL
		driver.get("https://login-v2.upstox.com/");
	}
	}