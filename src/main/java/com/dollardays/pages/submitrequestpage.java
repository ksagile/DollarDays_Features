package com.dollardays.pages;





import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.dollardays.commons.Base64;

public class submitrequestpage{

	WebDriver driver;
// intitalizing driver to this page
	public submitrequestpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// submit request text on top of the page

@FindBy(xpath="//h1[contains(text(),'Submit a request')]")
private	WebElement submitequesttext;

public boolean getrequesttext()
{
	return submitequesttext.isDisplayed();
}


@FindBy(xpath="//a[contains(text(),'Sign Out')]")
private WebElement logout;


public WebElement logginout()
{
	return logout;
}
// getting window handle and title
public void title() {
	String s=driver.getWindowHandle();
	String titleofthepage=driver.getTitle();
	System.out.println("current window handle"+s);
	System.out.println("Title of the page:"+titleofthepage);
Assert.assertEquals(titleofthepage, "Submit A Request");

}
// showing this message on top of the page
@FindBy(xpath="//p[contains(text(),'We’re here to help you! Please provide us with as ')]")
private WebElement helptext;

public WebElement gethelptext()
{
	return helptext;
	
}


// signin image
@FindBy(xpath = "//*[@id=\"aspnetForm\"]/header/div/div/div/div[3]/div/ul/li[1]/a/img")
private WebElement signInBtn;

public WebElement signInBtn() {
return signInBtn;

}

//submit request link in the dropdown
@FindBy(linkText = "Submit A Request")
private WebElement submitARequestLink;

public WebElement submitARequestLink() {
return submitARequestLink;

}


//dropwdown for select request type

@FindBy(xpath = "//*[contains(@class,'form-control blg_cc_month')]")
////select[@id='ctl00_cphContent_drpReason']
private WebElement selectARequestType;

public WebElement selectARequestType() {
return selectARequestType;

}


// email textbox
@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtemail\"]")
private WebElement emailTextBox;

public WebElement emailTextBox() {
return emailTextBox;

}	

// phone number 
@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtPhone\"]")
private WebElement phoneNumTextBox;

public WebElement phoneNumTextBox() {
return phoneNumTextBox;

}	


// order number
//@FindBy(xpath = "//input[@id='ctl00_cphContent_txtOrderNo']")
@FindBy(xpath="/html[1]/body[1]/form[1]/div[6]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
//@FindBy(id="ctl00_cphContent_txtOrderNo")
private WebElement OrderNoTxtBox;

public WebElement OrderNoTxtBox() {
return OrderNoTxtBox;

}


// message box
@FindBy(xpath = "//*[@id=\"ctl00_cphContent_txtNote\"]")
private WebElement messageTextBox;

public WebElement messageTextBox() {
return messageTextBox;

}


// recaptacha chekbox
//@FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
@FindBy(xpath="//*[@id='recaptcha-anchor-label']")
private WebElement iamnotARobotCheckBox;

public WebElement iamnotARobotCheckBox(){
return iamnotARobotCheckBox;

}


// submit button at the bottom
@FindBy(xpath = "//*[@id=\"ctl00_cphContent_btnCreate\"]")
private WebElement submitBtn;

public WebElement submitBtn(){
return submitBtn;
}


// after submit success message
@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[6]/div/div[1]/div/div/div")
private WebElement submitARequestSuccessMessage;

public WebElement submitARequestSuccessMessage(){
return submitARequestSuccessMessage;
}

@FindBy(xpath = "//*[@id=\"aspnetForm\"]/div[6]/div/div[2]/div/div/p")
private WebElement helpmessage;

public WebElement helpmessage(){
return helpmessage;
}


//bottom popup

//@FindBy(xpath="//input[@type='button']")
@FindBy(xpath="//input[@class='iagree btn']")
private WebElement popupaccept;

public WebElement getpopup()
{
	return popupaccept;
}
public void popupbox()
{
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.elementToBeClickable(popupaccept));
popupaccept.click();
}


// carrer link at the bottom
@FindBy(xpath="//a[contains(text(),'Careers')]")
private WebElement carrer;


public WebElement carrerlink()
{
	return carrer;
}
//body/form[@id='aspnetForm']/footer[1]/div[3]/div[1]/p[1]/input[1]
}










