package com.dollardays.testcases;



import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.ExampleSearch;
import com.dollardays.pages.LoginPage;

import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;
import com.dollardays.commons.BrowserUtil;
import com.dollardays.utilities.JsonReader;
import com.dollardays.utilities.VideoRecorder_utlity;
import com.aventstack.extentreports.Status;
import java.util.Map;
public class newaccounttest extends BaseTest
{
	
	 @DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "", runmode = "Yes")

	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void createlogin(Hashtable<String, String> datatable) throws Exception{
	
		ExtentTestManager.getTest().log(Status.INFO, "login testcase");
		Thread.sleep(1000);
		//LoginPage lp=new LoginPage(driver);
		//lp.getSignIn().click();
		
	//	System.out.println("I am sleeping");
		com.dollardays.pages.newaccount create_acc = new com.dollardays.pages.newaccount(driver);
		create_acc.getsignInButton().click();
		create_acc.getcreataccountlink().click();
		create_acc.getdata(datatable.get("Firstname"),datatable.get("Lastname"),datatable.get("Email"),datatable.get("Number"),datatable.get("Password"),datatable.get("Confirmpassword"));		
		//BrowserUtil.takeSnapShot(driver,"C:\\Users\\krant\\OneDrive\\Documents\\_Shanthi_Learn\\Team2_TaxExempt-master\\Team2_TaxExempt-master\\testdata\\screenshots.jpg" );
		create_acc.getcreatebutton().click();
	
		
		
	}
	 // wanted to take full screen shot of the page, and numbers takign it as a 4.0, and also want to take screen shot for each test case with out overriding. 
	
	 
	}






