package testcases;

import org.testng.annotations.BeforeTest;

import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
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
	
	
	

}
