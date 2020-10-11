package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 

public class SearchPage {
    WebDriver driver=null;
    
 
//    @FindBy(xpath="//*[@id='small-searchterms']")
//    WebElement textboxSearch_Text;
//    
//    @FindBy(xpath="//*[@class='button-1 search-box-button']")
//    WebElement textboxSearch_Btn;
//    
//// Initializing the page object ******
	public SearchPage() {
		PageFactory.initElements(driver, this );
	}
	
	public String verifyPageTitle() {
		return driver.getTitle();
		
	}
//	public void setSearchtext(String SearchText) {
//		textboxSearch_Text.sendKeys(SearchText);
//				
//	}
//	public void clickSearch_Btn() {
//		textboxSearch_Btn.click();
//				
//	}
	
//	public LoginPage  clickLogin_btn() {
//		 login_Btn.click();
//		 return new LoginPage();
//		
//	}
}
