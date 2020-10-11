package com.dbs.test;

/*
 * NB: WebDriverManager
 *  is an API that allows users to automate the handling of driver executables 
 * like chromedriver.exe, geckodriver.exe etc required by Selenium WebDriver API.
 * to achive that add the following  to the pom.xlm 
 * <dependency>
	<groupId>io.github.bonigarcia</groupId>
	<artifactId>webdrivermanager</artifactId>
	<version>3.7.1</version>
</dependency
 */
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

//import com.qa.pages.HomePage;
//import com.qa.pages.dwsHomePage;

import webDemoApplication.WebDemoBase;

public class dbwOrderCreationTest extends WebDemoBase {
	// **** Before Suit ,Test,Class, Method --STCM ----
	
 
 
 	@Test(description="Create Order Process",priority=4)
	public  static void Process() throws InterruptedException {
			
		NavigateToApparelAndShoes();
		NavigateBlueJeans();
		OrderBlueJeans();
		NavigatetShoppingCart();
		ShoppingCartProcedure();
		ShoppingCartCheckout();
		getBillingAddress();
		getShippingAddress();
		getShippingMethod();
		getPaymentMethod();
		getPaymentInfo();
		getConfermation();
		VerificationOfSuccess();
	}
	
}

	
