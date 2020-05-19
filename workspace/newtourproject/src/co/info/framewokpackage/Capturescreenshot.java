package co.info.framewokpackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.sun.jna.platform.FileUtils;

public class Capturescreenshot 
{
public Capturescreenshot()
{
}
public static void getschreenshort(WebDriver driver,String filepath) throws IOException
{
	System.out.println("Take schreenshort");
	TakesScreenshot tScreenshot=(TakesScreenshot)driver;
	System.err.println("Before schrennshot");
	File source1=tScreenshot.getScreenshotAs(OutputType.FILE);
	System.err.println("Afterschreenshot as");
	FileHandler.copy(source1,new File(".//screenshots.png"));
	System.out.println("Taken schreenshrot");
	
	
	
	

}

}
