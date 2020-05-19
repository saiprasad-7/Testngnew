package co.info.UIpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class selectflightpage 
{
WebDriver driver;
public selectflightpage(WebDriver driver) 
{
	this.driver=driver;
}
 
 
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[1]/input[1]")
@CacheLookup
WebElement BlueSkiesAirlines$360$270$5_03;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[1]/input[1]")
@CacheLookup
WebElement BlueSkiesAirlines$361$271$7_10;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[1]/input[1]")
@CacheLookup
WebElement PangeaAirlines$362$274$9_17;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[9]/td[1]/input[1]")
@CacheLookup
WebElement UnifiedAirlines$363$281$11_24;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[3]/td[1]/input[1]")
@CacheLookup
WebElement BlueSkiesAirlines$630$270$12_23;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[5]/td[1]/input[1]")
@CacheLookup
WebElement BlueSkiesAirlines$631$273$14_30;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[7]/td[1]/input[1]")
@CacheLookup
WebElement PangeaAirlines$632$282$16_37;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[2]/tbody[1]/tr[9]/td[1]/input[1]")
@CacheLookup
WebElement UnifiedAirlines$633$303$18_44;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/p[1]/input[1]")
@CacheLookup
WebElement reserveFlights;

public void selectflightpagepress(String departmentairline) 
{
	if (departmentairline.equalsIgnoreCase("Blue Skies Airlines 360")) 
	{
		BlueSkiesAirlines$360$270$5_03.click();
	}
	if (departmentairline.equalsIgnoreCase("Blue Skies Airlines 361")) 
	{
		BlueSkiesAirlines$361$271$7_10.click();
	}
	if (departmentairline.equalsIgnoreCase("Pangaea Airlines 362")) 
	{
		PangeaAirlines$362$274$9_17.click();
	}
	if (departmentairline.equalsIgnoreCase("Unified Airlines 363")) 
	{
		UnifiedAirlines$363$281$11_24.click();
	}
	
}
public void selectflightpagepessari(String flightarrival) 
{
	if (flightarrival.equalsIgnoreCase("Blue Skies Airlines 630")) 
	{
		 BlueSkiesAirlines$630$270$12_23.click();
	}
	if (flightarrival.equalsIgnoreCase("Blue Skies Airlines 631")) 
	{
		BlueSkiesAirlines$631$273$14_30.click();
	}
	if (flightarrival.equalsIgnoreCase("Pangea Airlines 632")) 
	{
		PangeaAirlines$632$282$16_37.click();
	}
	if (flightarrival.equalsIgnoreCase("Unified Airlines 633")) 
	{
		UnifiedAirlines$633$303$18_44.click();
	}

	reserveFlights.click();	
}

public void selectflightpagepessclick(String flightarrival)
{
	reserveFlights.click();
}
}

