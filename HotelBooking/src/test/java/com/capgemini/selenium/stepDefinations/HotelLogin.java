package com.capgemini.selenium.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.capgemini.selenium.pom.HotelLoginPOM;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HotelLogin {
	
	WebDriver driver=null;
	HotelLoginPOM  hotelLoginObject;
	String path = System.getProperty("user.dir");
	String webSiteUrl = path+"/src/test/resources/Pages/login.html";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.opera.driver", path + "/src/test/resources/Driver/operadriver.exe");
		driver = new OperaDriver();
		driver.navigate().to(webSiteUrl);
		driver.manage().window().maximize();
	}
	
	
	@Given("User is already in login screen")
	public void user_is_already_in_login_screen() {
		hotelLoginObject= new HotelLoginPOM(driver);  //object 
	}

	
	
	@When("User is entered the Username and Password")
	public void user_is_entered_the_username_and_password() {
		hotelLoginObject.loginPageCheck("Capgemini", "cap1234");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	
	
	@And("User click on the Login button")
	public void user_click_on_the_login_button() {
		hotelLoginObject.loginButton();
	}

	
	
	@Then("User will navigate to Homescreen")
	public void user_will_navigate_to_homescreen() {
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
	   // String msg = driver.findElement(By.id("userErrMsg")).getText();
	   // System.out.println(msg);
	    driver.close();
	    driver.quit();
		
	}

}
