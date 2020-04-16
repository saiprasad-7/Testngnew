package Testnglogin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lognfunsystem2
{
	@org.junit.Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver//chrome77.44//chrome79//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/index.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("uid")).clear();
		driver.findElement(By.name("uid")).sendKeys("mngr240706");
		/*driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("emAhUda");;
		driver.findElement(By.name("btnLogin")).click();*/
		driver.close();	
		driver.quit();

}
}