package org.steps;

import java.util.List;

import org.libglobal.LibGlobal;
import org.locators.HomePage;
import org.locators.LoginPage;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends LibGlobal{
	
	@Given("User is on the Livetraining application")
	public void user_is_on_inventory_application() {
	    browserLaunch();
	    maximizeWindow();
	    OpenAppUrl("https://livetraining.org.in/");
	    implicitWait();
	    }

	@When("User to click login")
	public void user_to_click_login() {
		HomePage home = new HomePage();
		btnClick(home.getHeaderLogin());
	}
	
	@And("User clicks on Login button")
	public void user_clicks_on_Login_button() {
		LoginPage login = new LoginPage();
		
		btnClick(login.getBtnLogin());
		
	}
		
	@Then("User Verifies home page is displayed")
	public void user_Verifies_home_page_is_displayed() {
	   System.out.println("success");
	}
	
	@When("the user enters invalid username and password")
	public void the_user_enters_invalid_username_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	      List<String> list = dataTable.asList();
	      LoginPage login = new LoginPage();
	      enterValue(login.getTxtUserName(), list.get(0));
	      enterValue(login.getTxtPassword(), list.get(1));
	      Thread.sleep(5000);
	
	}

	@When("the user clicks the login button")
	public void the_user_clicks_the_login_button() {
		LoginPage login = new LoginPage();
		btnClick(login.getBtnLogin());
	    
	}

	@Then("the user should see an error message indicating invalid credentials")
	public void the_user_should_see_an_error_message_indicating_invalid_credentials() {
		   System.out.println("failed");
	    
	}


	
	


	
}
