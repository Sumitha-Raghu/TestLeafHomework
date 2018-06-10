package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;


	public class CreateLeadPage extends ProjectMethods{
		
		public CreateLeadPage() {		
			PageFactory.initElements(driver,this);
		}	
		@FindBy(how=How.ID,using="createLeadForm_companyName")
		private WebElement elecName;
		@And("Enter company name as  Amazon")
		public CreateLeadPage enterCompanyName(String data) {
			type(elecName, data);
			return this ;
		}
		@FindBy(how=How.ID,using="createLeadForm_firstName")
		private WebElement elefName;
		@And("Enter first name as Sumitha")
		public CreateLeadPage enterFirstName(String data) {
			type(elefName,data);
			return this ;
		}
		@FindBy(how=How.ID,using="createLeadForm_lastName")
		private WebElement elelName;
		@And("Enter last name as  Raghu")
		public CreateLeadPage enterLastName(String data) {
			type(elelName, data);
			return this ;
		}
		
		@FindBy(how=How.CLASS_NAME,using="smallSubmit")
		private WebElement elecreateLeadButton;
		@And("Click Create Lead")
		public ViewLeadPage clickCreateleadButton() {
			click(elecreateLeadButton);
			return new ViewLeadPage ();
		}
		
		

}
