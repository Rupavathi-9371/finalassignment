package com.mindtree.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		
		
		  ExtentReports extent = new ExtentReports();
	        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark/Spark.html");
	        extent.attachReporter(spark);
	        
	      ExtentTest test1 =   extent.createTest("google search Test one","this is a test to validate google search functionality");
	     
	      
	     
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindedge206\\eclipse-workspace\\bhanu\\chromedriver.exe");
			 driver = new ChromeDriver();
			 
			 
			 test1.log(Status.INFO,"Starting test case"	);	
					 driver.get("https://tide.com/en-us");
					 test1.pass("Navigated to googlesearch");
					 
			
			 driver.close();
			 driver.quit();
			 test1.pass("Closed the browser");
			 
			 test1.info("Test completed");
			 
			 extent.flush();
			

	}

}
