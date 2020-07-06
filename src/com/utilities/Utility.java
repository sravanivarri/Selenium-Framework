package com.utilities;

import java.io.File;
//import org.apache.commons.io;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static String captureScrenshot(WebDriver driver, String screenshotName) {

		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			String dest= "C:\\Users\\vijay\\eclipse-workspace\\SeleniumFramework\\Screenshots\\" + screenshotName + ".png";

			// Copy the screenshot to desired location using copyFile method
			FileUtils.copyFile(src, new File(dest));
			// System.out.println("Screenshot taken!");
			return dest;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// System.out.println("Exception while taking the screenshot: "+e.getMessage());
			return e.getMessage();
		}
       
	
	}


}
