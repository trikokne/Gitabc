package loginModule_pom_ddf_testng_BaseAndUtilitycls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login3page
{
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement WC;
	
	public login3page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void welcomepage()
	{
       WC.click();
	}

}
