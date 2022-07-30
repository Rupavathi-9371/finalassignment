package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}@FindBy(id  = "Register")
	@CacheLookup
	WebElement txtRegister;
	
	
	@FindBy(id = "Signpupnow")
	@CacheLookup
	WebElement txtSigeupnow;
	
	@FindBy(xpath = "']")
	@CacheLookup
	WebElement FirstName;
	
	@FindBy(linkText = "Email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(linkText = "Password")
	@CacheLookup
	WebElement Password;
	
	
	@FindBy(linkText = "Createaccount")
	@CacheLookup
	WebElement Createaccount;
	
	@FindBy(linkText = "ClickBrowser")
	@CacheLookup
	WebElement ClickBrowser;
	
	
	
	public void setRegister(String uname)
	{
		txtRegister.clear();
		txtRegister.sendKeys(uname);
				
	}

	
	public void getSignupnow(String pwd)
	{
		txtSigeupnow.clear();
		txtSigeupnow.sendKeys(pwd);
	}
     public void clickFirstName() {
    	FirstName.click();
     }
		public void clickEmail() {
			Email.click();
		}
	

public void clicPassword() {
	Password.click();
	
	
	}
     public void clickAccount() {
	    Createaccount.click();
}
     public void clickBrowser() {
 	   ClickBrowser.click();
     }


	
		
	}

     

