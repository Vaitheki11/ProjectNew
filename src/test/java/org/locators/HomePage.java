package org.locators;

import org.libglobal.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends LibGlobal {

	public HomePage() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[text()='Login']")
	private WebElement headerLogin;

	public WebElement getHeaderLogin() {
		return headerLogin;
	}	



}
