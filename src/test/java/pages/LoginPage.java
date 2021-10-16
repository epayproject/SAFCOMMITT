package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	protected	WebDriver driver;

	private	By txt_username=By.id("name");
	private	By txt_password=By.id("password");
	private By btn_login=By.id("login");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
		if(!driver.getTitle().equals("TestProject Demo")) {
			throw new IllegalStateException("This is not login page. The current Page is."
					+driver.getCurrentUrl());
		}
	}

	public void enterUsername(String Username) {

		driver.findElement(txt_username).sendKeys(Username);
	}

	public void enterPassword(String Password) {

		driver.findElement(txt_password).sendKeys(Password);
	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}

}
