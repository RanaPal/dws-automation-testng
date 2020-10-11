package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDemoApplication.WebDemoBase;
 

public class LoginPage extends WebDemoBase{
//    WebDriver driver=null;
//    
    @FindBy(xpath="//input [@class='email']")
    WebElement Emailid;
//    
//
    @FindBy(xpath="//input [@class='password']")
    WebElement Password;
//	
    @FindBy(xpath="//input [@class='button-1 login-button']")
    WebElement login_Btn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	
 
	
	public void  UserLogin(String Email,String password) {
		System.out.println(" Email : "+Email+" Pass: "+Password);
		Emailid.sendKeys(Email);
		Password.sendKeys(password);
		login_Btn.click();
		
	}
	 
}
