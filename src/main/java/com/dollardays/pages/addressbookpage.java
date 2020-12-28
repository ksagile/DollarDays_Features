package com.dollardays.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addressbookpage {
	
	WebDriver driver;
	// intitalizing driver to this page
		public addressbookpage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath="//a[contains(text(),'Address Book')]")
		WebElement adressbook;
		public WebElement clickonadressbook()
		{
			return adressbook;
		}
		
		@FindBy(xpath="//h5[contains(text(),'+ Add a new ship-to address')]")
		WebElement newaddress;
		
		public WebElement clickonnewaddress()
		{
			return newaddress;
		}
		
		
		@FindBy(xpath="//input[@id='ctl00_cphContent_txtfirstname']")
		WebElement firstname;
		public WebElement enterfirstname()
		{
			return firstname;
		}
		
	
		@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
		private WebElement signInBtn;

		public WebElement signInBtn() {
		return signInBtn;

		}
	
}
