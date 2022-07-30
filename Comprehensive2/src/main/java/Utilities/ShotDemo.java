package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ShotDemo {

	
		
		
	public static String CaptureScreenshot(WebDriver driver)
	{
		
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				String shot = System.getProperty("user.dir")+"./ScreenShots/Login.png";
			try {
				FileHandler.copy(src, new File(shot));
			}catch (IOException e) {
				
				System.out.println("Unable to take Screenshot"+e.getMessage());
			
				
			}
			
		
		return shot ;
	}



	

	}
	
		