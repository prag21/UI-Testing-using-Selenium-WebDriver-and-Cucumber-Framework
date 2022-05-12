package com.cucumber.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerStepDefinition {
	String  winHandleBefore;
	int time=2000;
	public WebDriver driver;
	@Given("customer is on login page")
	public void customer_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/login");
		driver.manage().window().maximize();
		System.out.println("customer is on login page");
	}

	@When("customer enters valid email and password")
	public void customer_enters_valid_email_and_password() {
		try {
			Thread.sleep(time);
		driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		driver.findElement(By.name("password")).sendKeys("demouser");
		Thread.sleep(time);
		System.out.println("Customer enters valid email and password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	@And("customer clicks on login button")
	public void customer_clicks_on_login_button() {
		try {
			Thread.sleep(time);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
		Thread.sleep(time);
		System.out.println("Customer clicks on login button");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@Then("customer will be navigated to home page")
	public void customer_will_be_navigated_to_home_page() {
	    try {
	    	Thread.sleep(time);
	    	  WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.partialLinkText("Home")));
	    	  Thread.sleep(time);
		        String p=firstres.getText();

		        if(p.length()>0)
		        {
				System.out.println("successful login");
		        }
	    }
	    catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("accept cookies")
	public void accept_cookies() {
		try {
			Actions actions = new Actions(driver);
			Thread.sleep(time);
			WebElement e=driver.findElement(By.xpath("//button[@id='cookie_stop']"));
			actions.moveToElement(e).perform();
			Thread.sleep(time);
			e.click();
			Thread.sleep(time);
			System.out.println("Clicks on Got It");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("customer clicks on My Bookings")
	public void customer_clicks_on_My_Bookings() {
		try {
			
			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='My Bookings']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			
			System.out.println("Clicked on My Bookings");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}

	@And("customer clicks on My Bookings with no scroll")
	public void customer_clicks_on_My_Bookings_with_no_scroll() {
		try {
			
			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='My Bookings']")).click();
			
			Thread.sleep(time);
			
			System.out.println("Clicked on My Bookings");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer clicks on Add Funds")
	public void customer_clicks_on_Add_Funds() {
		try
		{
			
			driver.findElement(By.xpath("//li[contains(@class,'user_wallet')]//a[contains(@class,'waves-effect')][normalize-space()='Add Funds']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(time);
			System.out.println("Clicked on Add Funds");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer clicks on My Profile")
	public void customer_clicks_on_My_Profile() {
		try {
			
			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='My Profile']")).click();
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(time);
			System.out.println("Clicked on My Profile");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	@And("customer clicks on Logout")
	public void customer_clicks_on_Logout() {
		try {
			Thread.sleep(time);
			driver.findElement(By.xpath("//ul[@class='sidebar-menu list-items']//a[contains(@class,'waves-effect')][normalize-space()='Logout']")).click();
			Thread.sleep(time);
			System.out.println("Clicked on Logout");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("click on Paypal")
	public void click_on_Paypal() {
		try {
			Thread.sleep(time);
			driver.findElement(By.id("gateway_paypal")).click();
			Thread.sleep(time);
			System.out.println("Clicked on Paypal");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("click on Pay Now")
	public void click_on_Pay_Now() {
		try {
			Thread.sleep(time);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			driver.findElement(By.xpath("//button[normalize-space()='Pay Now']")).click();
			Thread.sleep(time);
			System.out.println("Clicked on Pay Now");
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("click on PayPal")
	public void click_on_PayPal() {
	 try {
			
		 driver.findElement(By.className("card-body")).click();
	
		// Store the current window handle
		 winHandleBefore = driver.getWindowHandle();
			//Thread.sleep(time);
		 // Perform the click operation that opens new window

		 // Switch to new window opened
		 for(String winHandle : driver.getWindowHandles()){
		     driver.switchTo().window(winHandle);
		 }
        System.out.println(driver.getCurrentUrl());
		 // Perform the actions on new window

		 // Close the new window, if that window no more required
		 
		 // Switch back to original browser (first window)
		

		 System.out.println("Clicked on body");
	 }
	 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Then("customer will be navigated to paypal")
	public void customer_will_be_navigated_to_paypal() {
		try {
			Thread.sleep(time);
			 WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//*[text()='Pay with PayPal']")));
			 if(firstres.getText().length()>0)
			 {
				 System.out.println("In paypal page");
			 }
			Thread.sleep(time);
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Then("customer enters his Paypal sandbox account email")
	public void customer_enters_his_Paypal_sandbox_account_email() {
		try {
		Thread.sleep(time);
			driver.findElement(By.id("email")).sendKeys("sb-e2sfg6757034@business.example.com");
			System.out.println("Entered mail id");
			 Thread.sleep(time);
		}
		 catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer clicks on next")
	public void customer_clicks_on_next() {
		try {
			Thread.sleep(time);
		     driver.findElement(By.id("btnNext")).click();
			Thread.sleep(time);
			System.out.println("Clicked on Next");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer enters his Paypal sandbox account password")
	public void customer_enters_his_Paypal_sandbox_account_password() {
		try {
			Thread.sleep(time);
		
		     WebElement element=driver.findElement(By.xpath("//input[@id='password']"));
		     String value="Pragna2100$";
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("arguments[0].value='"+ value +"';", element);
			System.out.println("Entered Password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer clicks on Login")
	public void customer_clicks_on_Login() {
		try {
			Thread.sleep(time);
		     WebElement element=driver.findElement(By.xpath("//button[@id='btnLogin']"));
		     JavascriptExecutor js = (JavascriptExecutor)driver;

				js.executeScript("arguments[0].click()", element);
			Thread.sleep(time);
			System.out.println("Login");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer clicks on Pay Now")
	public void customer_clicks_on_Pay_Now() {
		try {
			
		     WebElement element=driver.findElement(By.xpath("//button[@id='payment-submit-btn']"));
		     Thread.sleep(time);
		     JavascriptExecutor js = (JavascriptExecutor)driver;

				js.executeScript("arguments[0].click()", element);
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(time);
			System.out.println("Paid");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer comes back")
	public void customer_comes_back() {
		try {
			Thread.sleep(time);
			 for(String winHandle : driver.getWindowHandles()){
			     driver.switchTo().window(winHandle);
			 }
			 Thread.sleep(4000);
			System.out.println(driver.getCurrentUrl());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("cutomer clicks on View Voucher for one record")
	public void cutomer_clicks_on_View_Voucher_for_one_record() {
		try {
			Actions actions=new Actions(driver);
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			 
		     WebElement element=driver.findElement(By.className("la-eye"));
		     Thread.sleep(time);
		     actions.moveToElement(element).perform();
		     Thread.sleep(time);
		     js.executeScript("arguments[0].click()", element);
		     Thread.sleep(time);
		     String winHandleBefore = driver.getWindowHandle();

		  // Perform the click operation that opens new window

		  // Switch to new window opened
		  for(String winHandle : driver.getWindowHandles()){
		      driver.switchTo().window(winHandle);
		  }
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  Thread.sleep(time);
		  // Perform the actions on new window

		  // Close the new window, if that window no more required
		  driver.close();

		  // Switch back to original browser (first window)
		  driver.switchTo().window(winHandleBefore);

			Thread.sleep(time);
			System.out.println("Clicked on View Voucher");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer will click on Address Input Box and update the address")
	public void customer_will_click_on_Address_Input_Box_and_update_the_address() {
		try {
			Thread.sleep(time);
			 JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement e=driver.findElement(By.name("address1"));
			
			e.clear();
			Thread.sleep(time);
			e.sendKeys("Komarla Brigade Residency,Bangalore");
			Thread.sleep(time);
			System.out.println("Changed Address");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@And("customer will click on Update Profile")
	public void customer_will_click_on_Update_Profile(){
		 //WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.xpath("//button[@type='submit']")));
		//firstres.click();
		try {
			Thread.sleep(time);
			WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			Thread.sleep(time);
			js.executeScript("arguments[0].click()", element);
			Thread.sleep(time);
			System.out.println("Updated Address");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	@And("close the application for customer")
	public void close_the_application_for_customer() {
		try {
			Thread.sleep(time);
			driver.quit();
			System.out.println("close the application");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@When("customer enters invalid email and password")
	public void customer_enters_invalid_email_and_password() {
		try {
			Thread.sleep(time);
			driver.findElement(By.name("email")).sendKeys("user@phptravel.com");
			driver.findElement(By.name("password")).sendKeys("demouser");
			Thread.sleep(time);
			System.out.println("Customer enters invalid email and password");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Then("customer will be unable to login")
	public void customer_will_be_unable_to_login() {
		try {
			Thread.sleep(time);
			 WebElement firstres=new WebDriverWait(driver,Duration.ofSeconds(20)).until(driver->driver.findElement(By.className("message")));

				System.out.println("Login failed"+firstres.getText());
				Thread.sleep(time);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	


}
