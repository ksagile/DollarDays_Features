package com.dollardays.testcases;




import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.commons.BrowserUtil;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.submitrequestpage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.TestUtil;
import com.dollardays.utilities.VideoRecorder_utlity;

public class submitrequesttest  extends BaseTest{
/*
	// printing all the options from the dropdown
	@DDDataProvider(datafile = "testdata/my data.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void submitreqst(Hashtable<String, String> datatable) throws Exception{
		//logging in to the page
	
		Thread.sleep(1000);	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));		
		ExtentTestManager.getTest().log(Status.INFO, "logged in to the page");
		
		// creating object for submitrequest page 
		submitrequestpage sr=new submitrequestpage(driver);
	
		sr.signInBtn().click();
		ExtentTestManager.getTest().log(Status.INFO, "clicked on sign in button");
		
		sr.submitARequestLink().click();
		ExtentTestManager.getTest().log(Status.INFO, "clicked on submit request");
		
		
		//getting select request type dropdownand printing all the options  from dropdown
		Select d=new Select(sr.selectARequestType());
		
		List<WebElement> opt=d.getOptions();
	int numberofoption=opt.size();
	System.out.println("All the options from selectrequest Type:"+numberofoption);
	
	ExtentTestManager.getTest().log(Status.INFO, "getting all the options from the  dropdown");
	
	for(int i=0;i<numberofoption;i++)// printing all the elements that are present in the dropdown
	{
	System.out.println(opt.get(i).getText());
	
	}		
	}
	*/
	
	
	
	//entering the datain the form using excel sheet
	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet3",  testcaseID = "", runmode = "")
		@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
		public void enteringthedata(Hashtable<String, String> datatable) throws Exception{
			
		
			Thread.sleep(1000);
			LoginPage loginPage = new LoginPage(driver);
			loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));
			ExtentTestManager.getTest().log(Status.INFO, "Step1:signed in");
		
			submitrequestpage sr=new submitrequestpage(driver);
			//getting the help info
			sr.signInBtn().click();// click on sign in button
			ExtentTestManager.getTest().log(Status.INFO, "Step2: clicked on sigin button");
			
			sr.submitARequestLink().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step3: clicked on submit request in the dropdown");
			
			sr.phoneNumTextBox().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step4:clicked in phone number field");
			
			sr.phoneNumTextBox().sendKeys(datatable.get((String.valueOf("Phone Number"))));
			ExtentTestManager.getTest().log(Status.INFO, "Step5: entered phone number");
			Thread.sleep(2000);
			
			
			Select Ddown= new Select(sr.selectARequestType());
			Ddown.selectByVisibleText(datatable.get("Select RequestType"));
			ExtentTestManager.getTest().log(Status.INFO, "Step6:selected request type");
			Thread.sleep(2000);
			
			sr.getpopup().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step7:clicked on pop up");
			
			Thread.sleep(2000);
			sr.OrderNoTxtBox().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step8: clicked on ornumber box");
			Thread.sleep(3000);
			
			sr.OrderNoTxtBox().sendKeys(datatable.get("ordernumber").toString());
			ExtentTestManager.getTest().log(Status.INFO, "Step9:order number entered");
			
			
			sr.messageTextBox().clear();
			ExtentTestManager.getTest().log(Status.INFO, "Step10: cleared message box");
			sr.messageTextBox().sendKeys(datatable.get("Message"));
			Thread.sleep(4000);
			ExtentTestManager.getTest().log(Status.INFO, "Step11: entered message");
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			ExtentTestManager.getTest().log(Status.INFO, "Step12: scrolled down");
			//sr.iamnotARobotCheckBox().click();
			
			sr.submitBtn().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step13:clicked on submit button");
			
			sr.signInBtn().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step14: clicked on signin button");
			
			sr.logginout().click();
			ExtentTestManager.getTest().log(Status.INFO, "Step15: clicked on logout button");
		}
		
		
	/*
	
	// loggeing in, checking submitrequest text, cheking title of the page, scrolling down and clicking on the career link
	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet1",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	
	public void scrolldown(Hashtable<String, String> datatable) throws Exception{
		{
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));		
		ExtentTestManager.getTest().log(Status.INFO, "Step1:signed in");
		
		
		submitrequestpage sr=new submitrequestpage(driver);
	
		sr.signInBtn().click();
		sr.submitARequestLink().click();
		ExtentTestManager.getTest().log(Status.INFO, "Step2:clicked on submitrequest");
	
		
		//checking submitrequest is there or not
		boolean b=sr.getrequesttext();
		System.out.println("submitrequest is there:"+b);
		ExtentTestManager.getTest().log(Status.INFO, "Step3:checked submit request text is there or not");
		
		
		//checking title of the page
		sr.title();
		ExtentTestManager.getTest().log(Status.INFO, "Step4:title of the page printed and validated");
		
		//checking the help message is there or not
		boolean helptext=sr.gethelptext().isDisplayed();
		System.out.println("helptext is displaed or not: "+helptext);
		
		
		//scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
sr.carrerlink().click();
ExtentTestManager.getTest().log(Status.INFO, "going down and click on carrer link");

Thread.sleep(3000);
		}
		
	}
	*/
		
}
