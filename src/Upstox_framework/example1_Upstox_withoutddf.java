package Upstox_framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Upstox_withoutddf 
{
	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://login-v2.upstox.com/");
		//Enter user ID
		driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("6WBQ83");
		//Enter password
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Tri@12345");
		//click on signIN
		driver.findElement(By.cssSelector("div[class='_2Q-Qvmryo8OlgCHHPQqsDB undefined']")).click();
		//enter the pass code
		driver.findElement(By.cssSelector("input[name='yob']")).sendKeys("1992");
		//click on welcome page
		driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		WebElement actresult = driver.findElement(By.xpath("//span[text()='trimurti k.']"));
		              String act = actresult.getText();
		              String exp = "Trimurti K.";
		              boolean result = exp.equals(act);
		              if(result==true)
		              {
		            	System.out.println("user is valid"+" "+result);  
		              }
		              else
		              {
		            	  System.out.println("user is not valid"+" "+result);
		              }
	}

}
