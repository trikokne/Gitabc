package loginModule_pom_withoutddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login4page 
{
	@FindBy(xpath="//span[text()='trimurti k.']")private WebElement ID;
	
	public login4page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void VerifyUID()
    {
		String actid = ID.getText();
		String expid="Trimurti K.";
		boolean result = actid.equals(expid);
		if(result)
		{
			System.out.println("User is valid"+" : "+result);
		}
		else
		{
			System.out.println("user is not valid"+" : "+result);
		}
    }
	
}
