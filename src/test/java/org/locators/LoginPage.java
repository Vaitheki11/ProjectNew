package org.locators;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="form_details")
	private WebElement btnLogin;
	
	//@FindBy(id="customer_details")
	//private WebElement customerDetails;

	
	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public WebElement getCustomerDetails()
	{
		return getCustomerDetails();
		
		}
	

}