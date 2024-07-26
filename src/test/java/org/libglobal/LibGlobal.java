package org.libglobal;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	
	public static WebDriver driver;
	
	public WebDriver browserLaunch() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
			}
	
	public void OpenAppUrl(String url) {
		driver.get(url);
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void enterValue(WebElement e,String data) {
		e.sendKeys(data);
	}
	
	public void btnClick(WebElement e) {
		e.click();
	}
	
	public void implicitWait() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}
	
	

}
