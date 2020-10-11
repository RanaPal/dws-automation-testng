package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webDemoApplication.WebDemoBase;
 

public class HomePage extends WebDemoBase{
    private WebDriver driver;
 
    @FindBy(xpath="//a[@class='ico-login']")
    WebElement Login_Btn;
    

    @FindBy(xpath="//a[@class='ico-register']")
    WebElement register_Btn;
	
    @FindBy(xpath="//a[@class='ico-register']")
    WebElement shoppingCart_Btn;
	 
    @FindBy(xpath="//*[@id='small-searchterms']")
    WebElement textboxSearch_Text;
    
    @FindBy(xpath="//*[@class='button-1 search-box-button']")
    WebElement textboxSearch_Btn;
    
// Initializing the page object ******
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this );
	}
	
	public void verifyPageTitle() {
		System.out.println("Title "+driver.getTitle());
//		return driver.getTitle();
		
	}
	public void setSearchtext(String SearchText) {
		textboxSearch_Text.sendKeys(SearchText);
				
	}
	public SearchPage clickSearch_Btn() {
		textboxSearch_Btn.click();
		return new SearchPage();
				
	}
	
	public void NavigateToLoginPage() {
		Login_Btn.click();
// 		 return new LoginPage();
	}
	public void NavigateToRegisterPage() {
		register_Btn.click();
//		 return new LoginPage();
	}
	public void NavigateToShoppingcartPage() {
		shoppingCart_Btn.click();
//		 return new LoginPage();
	}
	
}
