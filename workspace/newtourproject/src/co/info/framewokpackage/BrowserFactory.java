package co.info.framewokpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 
{
public static WebDriver driver;
public BrowserFactory() {
	
}
public static WebDriver getwebdiver() {
	
	if (driver==null) 
	{
		/*ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		//options.setpageloadstrategy(pageloadstrategy.none);*/
		System.setProperty("webdive.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	
return driver;
}
public static WebDriver getdriver(String browsername) 
{
if (driver==null)
{
if (browsername.equalsIgnoreCase("firefox")) 
{
System.setProperty("webdive.firefox.driver","C:\\chromedriver\\geckodriver.exe");
driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}	
else if (browsername.equalsIgnoreCase("chrome")) 
{
System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}	
	
else if (browsername.equalsIgnoreCase("ie")) 
{
System.setProperty("webdive.IEDriverServer.driver","C:\\chromedriver\\IEDriverServer.exe");
driver=new InternetExplorerDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}	
}
	
return driver;
	
}
}
