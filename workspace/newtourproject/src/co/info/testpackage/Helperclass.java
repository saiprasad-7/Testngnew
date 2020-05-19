package co.info.testpackage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import co.info.framewokpackage.BrowserFactory;

public class Helperclass 
{
public static WebDriver driver;
BrowserFactory obj1;

public Helperclass()
{
	
}
@BeforeSuite
public void beforesuite()
{
}
@BeforeClass
public void beforeclass()
{
	System.out.println("pinted @beforeclass");
}
@BeforeMethod
public void beforemethod()
{
	System.out.println("pinted @beforemethod");
	Helperclass.driver=BrowserFactory.getdriver("chrome");
}
@AfterMethod
public void aftermethod()
{
	System.out.println("pinted @aftermethod");

}
@AfterClass
public void afterclass()
{
	System.out.println("print @afteclass");
}
@AfterSuite
public void aftersuite()
{
	System.out.println("print @aftesuite");
	//driver.quit();
}


}








