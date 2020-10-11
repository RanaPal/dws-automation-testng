package com.dbs.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

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
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.qa.pages.HomePage;
//import com.qa.pages.LoginPage;

//import com.qa.pages.HomePage;
//import com.qa.pages.dwsHomePage;

import webDemoApplication.WebDemoBase;

public class dbwBasePageTest extends WebDemoBase {
	// **** Before Suit ,Test,Class, Method --STCM ----
	
	@BeforeSuite //1
	public static void BeforeSuit() {
		// ****** Precondition  *******
		System.out.println("**** BeforeSuit ****  ");
		WebDemoBase.init();
	}
 
	
 	@BeforeMethod //3
	public static void BeforeMethod() {
		System.out.println("**** BeforeMethod ***  ");
//		WebDemoBase.init();
	
	}
	

	
	@AfterMethod
	public static void logout() {
		System.out.println(" **** AfterMethod *** ");
	}
	

	@AfterSuite
	public static void AfterSuit() {
		// ***** Postcondition *****
		System.out.println("After Suit");
		 CloseApplication();
	}
	
//	 
//	@Test(description="Open DWS_HomePage",priority=1 ) 
//	public static void Open_DWS_HomePage() {
//	 OpenUrl(URL);
//	}
//	
// 	@Test(description="Navigate to Login Page",priority=2)
//	public static void setToLoginPage() {
// 		HomePage homepage = new HomePage(driver);
//		homepage.NavigateToLoginPage();
//		}
//		
// 	
// 	@Test(description="Access Login Page",priority=3)
//	public static void LoginPage() {
// 		LoginPage loginpage = new  LoginPage(driver);
// 		loginpage.UserLogin(EmailId, PassWord); 
//		}
//
//
// 	@Test(description="This is Process",priority=4)
//	public  static void Process() throws InterruptedException {
//			
//		NavigateToApparelAndShoes();
//		NavigateBlueJeans();
//		OrderBlueJeans();
//		NavigatetShoppingCart();
//		ShoppingCartProcedure();
//		ShoppingCartCheckout();
//		getBillingAddress();
//		getShippingAddress();
//		getShippingMethod();
//		getPaymentMethod();
//		getPaymentInfo();
//		getConfermation();
//		VerificationOfSuccess();
//	}
	
}

	
