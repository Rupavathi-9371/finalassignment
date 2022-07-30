package stepDefinitions;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class StepDefinition {
	public WebDriver driver;
	public LoginPage lp;
	ExtentHtmlReporter spark;
	ExtentReports extent;
	ExtentTest test1;
	public static Logger logger =LogManager.getLogger(StepDefinition.class);
	
	@Before
	public  void read() {
		spark = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/reporter/Read.html"));
		extent=new ExtentReports();
		extent.attachReporter(spark);
		spark.config().setDocumentTitle("Data");
		
	}
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		 test1 =extent.createTest("Google search Test one\", \"This is a test to valodate google search functionality");
		 }
		 public void user_Launch_Chrome_browser() {	  
			   System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"C:\\chromedriver\\chromedriver.exe" );
		   driver=new ChromeDriver(); 
			   lp=new LoginPage(driver);
			   logger.info("initializing all the method");
	}
	
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}
	   
	
	@Then("page Title should be {string}")
	public void page_title_should_be(String title) {
		 if(driver.getPageSource().contains("Login was unsuccessful.")) {
			   driver.close();
			   Assert.assertTrue(false);
		   }else {
			   Assert.assertEquals(title, driver.getTitle());
	}
	   
	}
	@Then("Click on sign up now")
	public void click_on_sign_up_now() {
	   
	}
	@When("user enter {string} and {string} and {string}")
	public void user_enter_and_and(String Register, String Signupnow, String Email) {
		  lp.setRegister(Register);
		   lp.getSignupnow(Signupnow);
				  
	  
		  
	}
	@When("User click on create account")
	public void user_click_on_create_account() {
		lp.clickAccount();
	  
	}
	@When("close browser")
	public void close_browser() {
		 extent.flush();
		   driver.quit();
		   
	}


	

	   
   }
 
	   
   
	   
   
   
	  