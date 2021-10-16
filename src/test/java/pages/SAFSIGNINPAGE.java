package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SAFSIGNINPAGE {
	
	
	public WebDriver driver;
	
	
	public SAFSIGNINPAGE(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By username_textbox= By.id("signInName");
	
	By signin_button= By.id("next");
	
	
	public WebElement enterSignInName() {
		
		return driver.findElement(username_textbox);
	}
	
	public WebElement getSignInButton() {
		
		return driver.findElement(signin_button);
	}

}
