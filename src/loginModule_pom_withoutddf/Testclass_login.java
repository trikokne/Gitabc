package loginModule_pom_withoutddf;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass_login 
{
	public static void main(String[]args)
	{
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	  driver.get("https://login-v2.upstox.com/");
	 //creating and calling methods from 1st pom class
	 login1page obj1=new login1page(driver);
	 obj1.username();
	 obj1.PWD();
	 obj1.click(); 
	 //2nd POM class
	 login2page obj2=new login2page(driver);
	 obj2.passcode();
	 //3rd POM class
	 login3page obj3=new login3page(driver);
	 obj3.welcomepage();
	 //4th POM class
	 login4page obj4=new login4page(driver);
	 obj4.VerifyUID();
	}
}
