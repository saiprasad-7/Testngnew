package co.info.UIpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Flightfindpage 
{
WebDriver driver;
public Flightfindpage(WebDriver driver) 
{
this.driver=driver;	
}

@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]/input[1]")	
@CacheLookup
WebElement roundtrip;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/b[1]/font[1]/input[2]")	
@CacheLookup
WebElement oneway;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[3]/td[2]/b[1]/select[1]")
@CacheLookup
WebElement passCount;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[4]/td[2]/select[1]")
@CacheLookup
WebElement fromPort;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/select[2]")
@CacheLookup
WebElement fromDay;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[5]/td[2]/select[1]")
@CacheLookup
WebElement fromMonth;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[6]/td[2]/select[1]")
@CacheLookup
WebElement toPort;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/select[2]")
@CacheLookup
WebElement toDay;

@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/select[1]")
@CacheLookup
WebElement toMonth;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[9]/td[2]/font[1]/input[1]")
@CacheLookup
WebElement servClass;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[10]/td[2]/select[1]")
@CacheLookup
WebElement airline;
@FindBy(how=How.XPATH,using="/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[14]/td[1]/input[1]")
@CacheLookup
WebElement findFlights;

public void flightfindpagepress(String pcount,String fports,String odate,String omonth,String ports,String odate1,String omonth2,String seveclass,String Arrin) 
{
	roundtrip.click();
	passCount.sendKeys("pcount");
	fromPort.sendKeys("fports");
	fromDay.sendKeys("odate");
	fromMonth.sendKeys("omonth");
	toPort.sendKeys("ports");
	toDay.sendKeys("odate1");
	toMonth.sendKeys("omonth2");
	servClass.sendKeys("seveclass");
	airline.sendKeys("Arrin");
	findFlights.click();;
	
}
}
