package co.info.UIpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginpage 
{
WebDriver driver;
public loginpage(WebDriver driver)
{
	this.driver=driver;
}
@FindBy(how=How.NAME,using="userName")
@CacheLookup
WebElement usename;
@FindBy(how=How.NAME,using="password")
@CacheLookup
WebElement password;
@FindBy(how=How.NAME,using="login")
@CacheLookup
WebElement login;


public void loginpagepress(String usename1,String password2) 
{
	
	usename.sendKeys(usename1);
	//Thread.sleep("1000");
	password.sendKeys(password2);
	//Thread.sleep("2000");
	login.click();
	//Thread.sleep("1000");
	
	/*catch (InterruptedException e) 
	{
		e.printStackTrace();
	}*/


}}
