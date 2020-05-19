package co.info.UIpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Bookflightpage 
{
WebDriver driver;
public Bookflightpage(WebDriver driver) 
{
	this.driver=driver;
}
@FindBy(how=How.NAME,using="passFirst0")
@CacheLookup
WebElement Firstname;
@FindBy(how=How.NAME,using="passLast0")
@CacheLookup
WebElement lastname;
@FindBy(how=How.NAME,using="pass.0.meal")
@CacheLookup
WebElement mealorder;
@FindBy(how=How.NAME,using="creditCard")
@CacheLookup
WebElement cc;
@FindBy(how=How.NAME,using="creditnumber")
@CacheLookup
WebElement cn;
@FindBy(how=How.NAME,using="cc_exp_dt_mn")
@CacheLookup
WebElement ccdatemonth;
@FindBy(how=How.NAME,using="cc_exp_dt_yr")
@CacheLookup
WebElement ccyear;
@FindBy(how=How.NAME,using="cc_frst_name")
@CacheLookup
WebElement ccfn;

@FindBy(how=How.NAME,using="cc_mid_name")
@CacheLookup
WebElement ccmidname;
@FindBy(how=How.NAME,using="cc_last_name")
@CacheLookup
WebElement cclastname;
@FindBy(how=How.NAME,using="ticketLess")
@CacheLookup
WebElement ticketless;
@FindBy(how=How.NAME,using="billAddress1")
@CacheLookup
WebElement billadr;

@FindBy(how=How.NAME,using="billCity")
@CacheLookup
WebElement billcity1;
@FindBy(how=How.NAME,using="billState")
@CacheLookup
WebElement billstate1;
@FindBy(how=How.NAME,using="billZip")
@CacheLookup
WebElement billzip1;
@FindBy(how=How.NAME,using="billCountry")
@CacheLookup
WebElement billCountry1;

@FindBy(how=How.NAME,using="ticketLess")
@CacheLookup
WebElement ticketLess2;
@FindBy(how=How.NAME,using="buyFlights")
@CacheLookup
WebElement buyFlights;


public void purchase(String fname,String lname,String meal,String cc1,String ccname,String ccdmname,String yname,String ccfname,String ccmname,String cclname,String addname,String cityname,String statename,String zipname,String ccountryname)
{
	Firstname.sendKeys(fname);
	lastname.sendKeys(lname);
	mealorder.sendKeys(meal);
	cc.sendKeys(cc1);
	cn.sendKeys(ccname);
	ccdatemonth.sendKeys(ccdmname);
	ccyear.sendKeys(yname);
	ccfn.sendKeys(ccfname);
	ccmidname.sendKeys(ccmname);
	cclastname.sendKeys(cclname);
	ticketless.click();
	billadr.sendKeys(addname);
	billcity1.sendKeys(cityname);
	billstate1.sendKeys(statename);
	billzip1.sendKeys(zipname);
	billCountry1.sendKeys(ccountryname);
	ticketLess2.click();
	buyFlights.click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
}






