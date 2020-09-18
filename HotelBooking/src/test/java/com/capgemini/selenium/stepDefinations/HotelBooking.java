package com.capgemini.selenium.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import com.capgemini.selenium.pom.HotelBookingPOM;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class HotelBooking {

	HotelBookingPOM hotelBookingPOMObj;
	WebDriver driver=null;
	String expectedTitle ="Hotel Booking";
	String path = System.getProperty("user.dir");
	String webSiteUrl = path+"/src/test/resources/Pages/hotelbooking.html";
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.opera.driver", path + "/src/test/resources/Driver/operadriver.exe");
		driver = new OperaDriver();	
		
	}
	
	
	@Given("User is already in the Hotel Booking form")
	public void user_is_already_in_the_hotel_booking_form() {
		driver.navigate().to(webSiteUrl);
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		if(expectedTitle.contentEquals(title)==false) {
			System.out.println("Sry you landed in wrong Planet!");
			driver.close();
			driver.quit();
		}
	}

	@When("User is entered the details")
	public void user_is_entered_the_details() {
		hotelBookingPOMObj = new HotelBookingPOM(driver);
		hotelBookingPOMObj.hotelBookingDetails();
	}

	@And("User entered the confirm Booking button")
	public void user_entered_the_confirm_booking_button() {
		hotelBookingPOMObj.confirmBookingButton();
	}

	@Then("User will get the Booking msg")
	public void user_will_get_the_booking_msg() {
	   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.getPageSource().contentEquals("Booking Completed!");
		System.out.println("Yeah your booking is success !");
		
	}
	
	@After
	public void afterMethod() {
		driver.close();
		driver.quit();
	}
}
