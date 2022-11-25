package loginModule_pom_withoutddf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login1page 
{
	@FindBy(css="input#userCode") private WebElement UN;
	@FindBy(css="input#password")private WebElement PW;
	@FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement signin;
	
	public login1page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void username()
	{
		UN.sendKeys("6WBQ83");
	}
	public void PWD()
	{
		PW.sendKeys("Tri@12345");
	}
	public void click()
	{
		signin.click();
	}
	
    
	

}
