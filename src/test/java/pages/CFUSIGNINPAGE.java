package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CFUSIGNINPAGE {
	
	public WebDriver driver;
	
	public CFUSIGNINPAGE(WebDriver driver) {
		
		this.driver=driver;
	}
	
	By sign_in_button= By.xpath("//button[@id='signIn']");
	
	
	public WebElement clickOnSignIn() {
		
		return driver.findElement(sign_in_button);
	}

}
