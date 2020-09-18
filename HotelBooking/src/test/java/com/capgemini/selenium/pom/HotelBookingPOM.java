package com.capgemini.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelBookingPOM {
	
	WebDriver driver;
	private By userFirstName = By.id("txtFirstName");
	private By userLastName = By.id("txtLastName");
	private By userEmail =By.id("txtEmail");
	private By userPhone  =By.id("txtPhone");
	private By userAddress = By.xpath("//textarea");
	private By userCity =By.xpath("//table//tr[7]//td[2]//select//option[3]");
	private By userState =By.xpath("//table//tr[8]//td[2]//select//option[3]");
	private By userNoOfGuests = By.xpath("//table//tr[10]//td[2]//select//option[3]");
	private By userPaymentCardHolderName =By.id("txtCardholderName");
	private By userPaymentCardNumber =By.id("txtDebit");
	private By userPaymentCardCvv = By.id("txtCvv");
	private By userPaymentCardMonth = By.id("txtMonth");
	private By userPaymentCardYear = By.id("txtYear");
	
	private By userConfirmButton = By.id("btnPayment");

	public HotelBookingPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/***************************************************
	 * METHOD      : hotelBookingDetails
	 * PARAMETERS  : ()
	 * AUTHOR      : Vijayvenkat Reddy Kumbam
	 * DATE        : 17/09/2020
	 * DESCRIPTION : This method had the zero parameters and the values are hard coded
	 * 				This Method is implemented by the POM(Page object Model) 
	 * 
	 ***********************************************/
	public void hotelBookingDetails() {
		driver.findElement(userFirstName).sendKeys("Vijay");
		driver.findElement(userLastName).sendKeys("Venkat");
		driver.findElement(userEmail).sendKeys("vijayvenkat@gmail.com");
		driver.findElement(userPhone).sendKeys("9779316655");
		driver.findElement(userAddress).sendKeys("nkl 508211");
		driver.findElement(userCity).click();
		driver.findElement(userState).click();
		driver.findElement(userNoOfGuests).click();
		driver.findElement(userPaymentCardHolderName).sendKeys("vijayvenkat");
		driver.findElement(userPaymentCardNumber).sendKeys("5081-2356-5856-8798");
		driver.findElement(userPaymentCardCvv).sendKeys("555");
		driver.findElement(userPaymentCardMonth).sendKeys("2");
		driver.findElement(userPaymentCardYear).sendKeys("22");	
	}
	
	
	/***************************************************
	 * METHOD      : confirmBookingButton
	 * PARAMETERS  :()
	 * AUTHOR      : Vijayvenkat Reddy Kumbam
	 * DATE        : 17/09/2020
	 * DESCRIPTION : This method will take the zero parameters
	 * 
	 ***********************************************/
	public void confirmBookingButton() {
		driver.findElement(userConfirmButton).click();
	}
	
}
