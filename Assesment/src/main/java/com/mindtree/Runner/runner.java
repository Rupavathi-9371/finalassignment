package com.mindtree.Runner;





import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.mindtree.Utilities.ExcelRead;
import com.mindtree.Utility.basClass;
import com.mindtree.pageobject.Homepage;




@Test
public class runner  {
	
	
	 ExtentSparkReporter spark;
	 ExtentReports extent;
	 ExtentTest test1;
	public static Logger logger =LogManager.getLogger(runner.class);
	public  void searchFunctionality() throws InterruptedException
	{
		
		 ExcelRead read = new ExcelRead();
	basClass baseobject = new basClass();
	 spark = new ExtentSparkReporter(new File("./ExtentReport/Read.html"));
	   extent = new ExtentReports();
	   
	   extent.attachReporter(spark);
	        spark.config().setDocumentTitle("Data");
	        test1 =  extent.createTest("Google search Test one", "This is a test to valodate google search functionality");
			 
			  logger.info("intializing  driver");
     WebDriver driver =baseobject.initializeDriver();
	   driver.get("https://tide.com/en-us");
	   test1.log(Status.INFO, "starting test case");
	   baseobject.navigateToUrl(driver,read.getStringData(0, 0, 0));
	   logger.info("Navigated to tide search");
	  //HomeObject.enterTextIntoSearchBox(driver);
	  
	  //flushing
	  extent.flush();

  
	 Homepage hp =new Homepage();
	 hp.getRegister().click();
	 hp.getSignupnow().click();
	 hp.getFirstname().sendKeys("Rupa");
	 hp.getEmailaddress().sendKeys("Rupa@123");
	 hp.getPassword().sendKeys("9371");
	 hp.getCreateaccount().click();
	} 
	
	}
	

	
	
	

	
	
	

	


	

	
	
		


