package com.mindtree.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	public WebDriver driver;
	  
    	By Register =(By.xpath("//span[@class='login-register']/a"));
    	By Signupnow =(By.xpath("//*[@id='site-content']/div/div/div/div/div[1]/div/div/div/div[2]/div/p[6]/a"));
    	By Firstname =(By.xpath("//input[@id='name']"));
    	By Emailadress =(By.xpath("//*[@id='email\']"));
    	By password =(By.xpath("//*[@id='password']"));
    	By createaccount =(By.xpath("//input[@type='submit']"));
    	

	
	public WebElement getRegister() {
		return driver.findElement(Register);
    }

	public WebElement getSignupnow() {
		return driver.findElement(Signupnow);
	}

	
	public WebElement getFirstname() {
		return driver.findElement(Firstname);
	}
	
	public WebElement getEmailaddress() {
		return driver.findElement(Emailadress);
	
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
		
	}
	
	public WebElement getCreateaccount() {
		return driver.findElement(createaccount);
		
	}


	
    

}