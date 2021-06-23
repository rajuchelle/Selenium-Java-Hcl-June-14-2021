package pageobjects;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Commons {
	public static String screenshotPath;
	
	static WebDriver driver;	
	
	static TakesScreenshot screenshot1;
	
	public Commons(WebDriver driver)
	{
		this.driver = driver;		
	}	
	
	public static void takeScreenshot(String filePath) throws IOException{		
		
		System.out.println(filePath);			
		DateFormat dtFm = new SimpleDateFormat("yyy-mm-dd hh:mm:ss");
		
		String starDate = (dtFm.format(new Date())).replace(":", "").replace(" ","_").replace("-", "_");
		String name1 = starDate+".jpg";
		System.out.println(filePath+name1);		
		screenshot1 = (TakesScreenshot)driver;
		File file1 = screenshot1.getScreenshotAs(OutputType.FILE);
		
		File desFile = new File(filePath+name1);
		
		FileUtils.copyFile(file1, desFile);	
		
		screenshotPath = filePath+name1;
		
	}

}
