package com.mindtree.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basClass {
	public WebDriver driver = null;
	
	public WebDriver initializeDriver() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindedge206\\eclipse-workspace\\bhanu\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		return driver;
	}
		
	public WebDriver navigateToUrl(WebDriver driver,String Url)
	{
		//driver = initializeDriver();
		driver.get(Url);
		return driver;
	}
}

	 

	
	
	

	



