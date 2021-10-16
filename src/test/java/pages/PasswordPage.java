package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordPage {
	
	public WebDriver driver;
	
	public PasswordPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By textbox_password= By.id("password");
	
	By button_signin = By.id("next");
	
	
	public  WebElement  enterPassword() {
		
		return driver.findElement(textbox_password);
	}
	
	public WebElement clickSignIn() {
		
		return driver.findElement(button_signin);
	}
	

}
