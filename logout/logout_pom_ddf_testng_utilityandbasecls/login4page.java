package logout_pom_ddf_testng_utilityandbasecls;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login4page 
{
	@FindBy(xpath="//span[text()='trimurti k.']")private WebElement ID;
	@FindBy(xpath="//div[@id='undefined_dropdown']")private WebElement idmenu;
	@FindBy(css="div#logout")private WebElement logout;
	
	public login4page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
/*	public void VerifyUID(String vuid)
    {
		String actid = ID.getText();
		String expid=vuid;
		boolean result = actid.equals(expid);
		if(result)
		{
			System.out.println("User is valid"+" : "+result);
		}
		else
		{
			System.out.println("user is not valid"+" : "+result);
		}
    }*/
	
	public String verifyuid()
	{
	  String usrname = ID.getText();
	  return usrname;
	}
	public void logout() throws InterruptedException
	{
		idmenu.click();
		System.out.println(idmenu.getText());	
		Thread.sleep(3000);
		logout.click();
	}
	
}
