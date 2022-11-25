package logout_pom_ddf_testng_utilityandbasecls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login2page
{
	@FindBy(css="input[id='yob']")private WebElement Pin;

	public login2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passcode(String pin)
	{
		Pin.sendKeys(pin);
	}
}
