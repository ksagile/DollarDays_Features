package com.dollardays.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.dollardays.commons.Base64;
import com.dollardays.listners.ExtentTestManager;
import com.dollardays.pages.LoginPage;
import com.dollardays.pages.addressbookpage;
import com.dollardays.utilities.DDDataProvider;
import com.dollardays.utilities.TestUtil;

public class addressbookpagetest extends BaseTest {
	
	@DDDataProvider(datafile = "testdata/testdata1.xlsx", sheetName = "Sheet2",  testcaseID = "TC1", runmode = "Yes")
	@Test(dataProvider = "dd-dataprovider", dataProviderClass = TestUtil.class)
	public void adresbook(Hashtable<String, String> datatable) throws Exception{
		//logging in to the page
	
		Thread.sleep(1000);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(datatable.get("UserName"), Base64.decrypt(datatable.get("Password")));		
		
		addressbookpage ap=new addressbookpage(driver);
		ap.signInBtn().click();
		ap.clickonadressbook().click();
		ap.clickonnewaddress().click();
		
		ap.enterfirstname().sendKeys(datatable.get("firstname"));
		
	

	
	
}
}
