package co.info.testpackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import co.info.UIpackage.Bookflightpage;
import co.info.UIpackage.Flightconformationbook;
import co.info.UIpackage.Flightfindpage;
import co.info.UIpackage.loginpage;
import co.info.UIpackage.selectflightpage;
import co.info.framewokpackage.BrowserFactory;

public class Testcaseclass extends Helperclass
{
	public Testcaseclass() {
		
	}
	@Test
	public void returnticket()
	{
		System.out.println("pinted retunticket");
		driver.get("http://newtours.demoaut.com/");
		loginpage loginpage1=PageFactory.initElements(driver, loginpage.class);
		loginpage1.loginpagepress("mercury","mercury");
		
		Flightfindpage Flightfindpage1=PageFactory.initElements(driver,Flightfindpage.class);
		Flightfindpage1.flightfindpagepress("1", "London", "May", "17", "Paris", "May", "27","Business class", "Blue Skies Airlines");
		
		selectflightpage selectflightpagege1=PageFactory.initElements(driver, selectflightpage.class);
		selectflightpagege1.selectflightpagepress("Blue Skies Airlines 361");
		selectflightpagege1.selectflightpagepessari("Pangea Airlines 632");
		
		Bookflightpage Bookflightpage1=PageFactory.initElements(driver, Bookflightpage.class);
		Bookflightpage1.purchase("hayr", "peter", "Bland", "Visa", "12345678", "01", "2007", "si", "youn", "kim", "12th Avenue street", "New york", "CVN", "902155", "UGANDA");
		Flightconformationbook Flightconformationbook1=PageFactory.initElements(driver, Flightconformationbook.class);
		String Bookingdetail1=System.getProperty("user.dir")+"\\"+"screenshorts\\Flightconformationdetails - "+".png";
		//CaptureScreenshot.getscreenshot(BrowserFactory.getwebdiver(),Bookingdetail1);
		Flightconformationbook1.logout();
	}
		@Test
		public void returnticket1()
		{
			System.out.println("pinted retunticket");
			driver.get("http://newtours.demoaut.com/");
			loginpage loginpage1=PageFactory.initElements(driver, loginpage.class);
			loginpage1.loginpagepress("mercury","mercury");
			
			Flightfindpage Flightfindpage1=PageFactory.initElements(driver,Flightfindpage.class);
			Flightfindpage1.flightfindpagepress("11", "London1", "May", "27", "Paris", "May", "29","Business class", "Blue Skies Airlines");
		    assertEquals(true, true);
	}

}
