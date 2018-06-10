package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods {
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Create Lead creation";
		testNodes="Leads";
		category="Smoke";   
		authors="Sumitha";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void CreateLead (String uName,String pwd,String cName,String fName,String lName) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		//clickOnCRMSFA()
		.clickOnCRMSFA()
		.Clickleads()
		.ClickCreatelead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateleadButton()
		.verify(fName);
	
}
}

