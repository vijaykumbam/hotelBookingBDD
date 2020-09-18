package com.capgemini.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelLoginPOM {

	WebDriver driver;
	private By userName = By.name("userName");
	private By userPassword = By.name("userPwd");
	private By loginButton = By.xpath("//tbody/tr[4]/td[2]/input");
	
	
	public HotelLoginPOM(WebDriver driver) {
		this.driver = driver;
	}
	
	
	/***************************************************
	 * METHOD      : loginPageCheck
	 * PARAMETERS  : (username,password)
	 * AUTHOR      : Vijayvenkat Reddy Kumbam
	 * DATE        : 17/09/2020
	 * DESCRIPTION : This method will take the two parameters of username and password
	 * 				 these parameters will help to achieve the POM based testing
	 * 
	 ***********************************************/
	public void loginPageCheck(String username, String password) {
		driver.findElement(userName).sendKeys(username);
		driver.findElement(userPassword).sendKeys(password);
	}
	
	
	/***************************************************
	 * METHOD      : loginButton
	 * PARAMETERS  :()
	 * AUTHOR      : Vijayvenkat Reddy Kumbam
	 * DATE        : 17/09/2020
	 * DESCRIPTION : This method will take the zero parameters
	 * 
	 ***********************************************/
	public void loginButton() {
		driver.findElement(loginButton).click();
	}
}
