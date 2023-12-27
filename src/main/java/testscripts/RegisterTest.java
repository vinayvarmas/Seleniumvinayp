package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pom_Script.BasePage;
import Pom_Script.RegisterPage;
import generic.ReadExcel;

public class RegisterTest extends BasePage {
	


		public RegisterTest(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		@DataProvider(name = "data")
		public Object[][] testData() throws IOException {
			return ReadExcel.getMultipleData("data");
		}
		
		@Test(dataProvider = "data")
		public void Register(String fn, String ln, String em, String ps, String cps) {
			RegisterPage r = new RegisterPage(driver);
			r.getGender().click();
			r.getFirstname().sendKeys(fn);
			r.getLastname().sendKeys(ln);
			r.getEmail().sendKeys(em);
			r.getPassword().sendKeys(ps);
			r.getConfirmpassword().sendKeys(cps);
			r.getReegisterbutton().click();
		}
	}