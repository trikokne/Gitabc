package loginModule_pom_ddf_testng_BaseAndUtilitycls;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_pom_ddf_TestNG_Basecls
{
	WebDriver driver;
	public void initializebrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\trimurti\\Selenium\\Webdriver\\chromedriver V107\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//driver.get("https://login-v2.upstox.com/");
		driver.get(login_pom_ddf_TestNG_Utilitycls.getproperties("URL"));
	}

}
