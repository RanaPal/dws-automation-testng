package com.dbs.test;

import org.testng.annotations.Test;

//import com.qa.pages.HomePage;

//import com.qa.pages.HomePage;
//import com.qa.pages.dwsHomePage;

import webDemoApplication.WebDemoBase;

public class dbwHomePageTest extends WebDemoBase {
 
	 
	@Test(description="Open DWS_HomePage",priority=1 ) 
	public static void Open_DWS_HomePage() {
		String HpageTitle=OpenUrl(URL);
	  System.out.println("HOme Page Title : "+ HpageTitle); 
	}
	
 
 	
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

	
