package webDemoApplication;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//For Chrome Browser
//WebDriverManager.chromedriver().setup();

//Likewise we can setup driver executables for other browsers 
//WebDriverManager.firefoxdriver().setup();
//WebDriverManager.edgedriver().setup();
//WebDriverManager.operadriver().setup();
//WebDriverManager.phantomjs().setup();
//WebDriverManager.iedriver().setup();







public class WebDemoBase {
	public  static WebDriver driver;
	public static String URL;
	public static String EmailId;
	public static String PassWord;
	public static String Browser;
	
	

	public static void getConfigData() {

       // try (InputStream input = new FileInputStream("path/to/config.properties")) {
		try (InputStream input = new FileInputStream("C:\\1_New_java20\\dws-automation-testng\\src\\test\\java\\resource\\config.properties")) {
		
            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
           URL=prop.getProperty("sys.url");
           EmailId=prop.getProperty("sys.email");
           PassWord= prop.getProperty("sys.password");
           Browser= prop.getProperty("sys.browser");

        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Critical Error : *** \n Terminating the application ");
            System.exit(0); 
        }

    }	
	
	public static void init() {
		// Get all environment Variables ***
		getConfigData();
		System.out.println("*** Executing   1.   init()    function ***");  
		//		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
		//For Chrome Browser
		if(Browser.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(Browser.equals("IE")){
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(Browser.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public static String OpenUrl(String Url) {
		System.out.println("*** Executing   2.   OpenUrl()    function ***"); 
		driver.get(Url);
		return driver.getTitle();
	}

	public static void NavigateLogin() {
		System.out.println("*** Executing   3.   NavigateLogin()    function ***");
		WebElement login = driver.findElement(By.xpath("//a[@class='ico-login']"));
		login.click(); 
	}

	//	public static void UserLogin(String Email,String Password) { 	 
	//		System.out.println("*** Executing   4.   UserLogin()     function ***");
	//	 WebElement email = driver.findElement(By.xpath("//input [@class='email']"));
	//	 email.sendKeys(Email);
	//	 WebElement password = driver.findElement(By.xpath("//input [@class='password']"));
	//	 password.sendKeys(Password);
	//	 WebElement loginBtn = driver.findElement(By.xpath("//input [@class='button-1 login-button']"));
	//	 loginBtn.click();
	//	}

	public static void NavigateToApparelAndShoes(){
		System.out.println("*** Executing   5.   NavigateToApparelAndShoes()    function ***");
	 WebElement aprl = driver.findElement(By.xpath("//a[@href='/apparel-shoes']"));
	 aprl.click();     
	}
	
	public static void NavigateBlueJeans() throws InterruptedException{  
		System.out.println("*** Executing   6.   NavigateBlueJeans()    function ***");
		WebElement bluejean = driver.findElement(By.xpath("//a [contains(text(),'Blue Jeans')]/parent::h2[@class='product-title']")); 
		Thread.sleep(3000);
		bluejean.click();
		
	}
	
	public static void OrderBlueJeans(){  
		System.out.println("*** Executing   7.   OrderBlueJeans()    function ***");
		 WebElement ItemQty=driver.findElement(By.xpath("//input [@class='qty-input']"));
		 ItemQty.clear();
		 ItemQty.sendKeys("25");	 
		 WebElement AddtoCart =  driver.findElement(By.xpath("//input  [@class='button-1 add-to-cart-button']"));
		 AddtoCart.click();		 
		}
	
	public static void NavigatetShoppingCart() {
		System.out.println("*** Executing   8.   NavigatetShoppingCart()    function ***"); 	
		WebElement ShoppingCart = driver.findElement(By.xpath("//span [@class='cart-label' and contains(text(),'Shopping cart')]"));
		ShoppingCart.click(); 
		//GetElements();
	}
	public static void ShoppingCartProcedure() {
		System.out.println("*** Executing   9.   ShoppingCartProcedure()    function ***");
		WebElement TermsofService=driver.findElement(By.xpath("//input [@name='termsofservice']"));
		TermsofService.click();
	}
	public static void ShoppingCartCheckout() {
		System.out.println("*** Executing   10.   ShoppingCartCheckout()    function ***");	
		WebElement Checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
		Checkout.click();
	}
	
	
//==== Checkout Proces
	public static void getBillingAddress() {
		System.out.println("*** Executing   11.   getBillingAddress()    function ***");
		WebElement billAdContinue=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
		billAdContinue.click();
		
	}
	public static void getShippingAddress() {
		System.out.println("*** Executing   12.   getShippingAddress()    function ***");
		WebElement ShippingAdContinue=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		ShippingAdContinue.click();
		
	}
	public static void getShippingMethod() throws InterruptedException {
		System.out.println("*** Executing   13.   getShippingMethod()    function ***");
		WebElement ShippingContinue=driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']"));	
		ShippingContinue.click();
	}
	public static void getPaymentMethod() throws InterruptedException {
		System.out.println("*** Executing   14.   getPaymentMethod()    function ***");
		WebElement CashOnDelivery=driver.findElement(By.xpath("//label [contains(text(),'Ground')]"));
		CashOnDelivery.click();
		WebElement PaymentContinue=driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
		PaymentContinue.click();
	}
	public static void getPaymentInfo() {
		System.out.println("*** Executing   15.   getPaymentInfo()    function ***");
		WebElement PaymentInfoContinue=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));	
		PaymentInfoContinue.click();
	}
	
	public static void getConfermation() {
		System.out.println("*** Executing   16.   getConfermation()    function ***");
		WebElement PaymentConfContinue=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));	
		PaymentConfContinue.click();
	}
	
	public static void VerificationOfSuccess() {
		System.out.println("*** Executing   17.   VerificationOfSuccess()    function ***");	
		WebElement VerificationContinue=driver.findElement(By.xpath("//input [@class='button-2 order-completed-continue-button']"));	
		VerificationContinue.click();
	}
	
	// Post Condition
	public static void LogOut() {
		System.out.println("*** Executing   18.   LogOut()    function ***");
		WebElement Logout=driver.findElement(By.xpath("//a [@class='ico-logout']"));	
		Logout.click();
	}
	
	public static void CloseApplication() {
		System.out.println("*** Executing   19.    CloseApplication()    function ***");
		driver.close();
		driver.quit();
	}
	
	public static int GetElements() {
		int NoOfElements=0;
		
		List<WebElement> el = driver.findElements(By.xpath("//*"));
         NoOfElements=0;
        for ( WebElement e : el ) {
         System.out.println( e.getTagName()+"    "+e.getText());

         NoOfElements++;

        }
      System.out.println(NoOfElements);
		
		return NoOfElements;
	}
	
	
}

 

