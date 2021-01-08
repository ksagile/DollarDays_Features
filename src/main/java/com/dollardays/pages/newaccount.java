package com.dollardays.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newaccount {

	WebDriver driver;
	//signin 
	@FindBy(xpath="/html//form[@id='aspnetForm']/header//div[@class='header-right']/ul//a[@role='button']/img[@class='header-user']")
private	WebElement sign_in;
	public WebElement getsignin()
	{
		return sign_in;
	}
	
	
	
	@FindBy(xpath = "//li[@class='dropdown']//a[@class='dropdown-toggle']")
	//@FindBy(css="a[role='button']")
	private WebElement signInButton;
	
	public WebElement getsignInButton() {
		return signInButton;
	}
	
	
	
	// create account link
	//@FindBy(xpath="//a[contains(text(),'Create account')]")
	//@FindBy(xpath="[@id='aspnetForm']/header/div/div/div/div[3]/div/ul/li[1]/ul/li[3]/a")
	@FindBy(linkText="Create account")
	
	private WebElement create_account;
	
	public WebElement getcreataccountlink()
	{
		return create_account;
	}
	
	//first name
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtFName']")
	private WebElement first_name;
	
	public WebElement getfirstname()
	{
		return first_name;
	}
	
	//last name
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtLName']")
	private WebElement last_name;
	
	public WebElement getlastname()
	{
		return last_name;
	}
	
	//email
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtClientEmail']")
	private WebElement e_mail;
	
	public WebElement getemail()
	{
		return e_mail;
	}
	
	//phone number
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtPhoneMain']")
	private WebElement phone_num;
	
	
	public WebElement getnumber()
	{
		return phone_num;
	}
	//password
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtPassword']")
	private WebElement p_wrd;
	
	
	public WebElement getpassword()
	{
		return p_wrd;
	}
	
	//confirm password
	@FindBy(xpath="//input[@id='ctl00_cphContent_txtPasswordConfirm']")
	private WebElement confirm_p_wrd;
	
	
	public WebElement getconfirmpass()
	{
		return confirm_p_wrd;
	}
	
	//create account button
		@FindBy(xpath="//input[@id='ctl00_cphContent_btnRegister']")
		private WebElement create_button;
		
		public WebElement getcreatebutton()
		{
			return create_button;
		}
		
		
		
		@FindBy(xpath = "//h4[contains(text(),'Welcome to DollarDays!')]")
		private WebElement successfulRegistrationMessage;
		public WebElement getsuccessfulRegistrationMessage() {
			return successfulRegistrationMessage;
		}
		
		
		
		public newaccount(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	
		public void getdata(String fname,String lname,String mail,String num,String pwd,String cpwd)
		{
			
			
			first_name.sendKeys(fname);
			last_name.sendKeys(lname);
			e_mail.sendKeys(mail);
			phone_num.sendKeys(num);
			p_wrd.sendKeys(pwd);
			confirm_p_wrd.sendKeys(cpwd);
			create_button.click();
			
			
		}
	
	
	
}


