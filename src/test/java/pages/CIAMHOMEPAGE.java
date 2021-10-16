package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CIAMHOMEPAGE {
	
	public WebDriver driver;
	
	
	public CIAMHOMEPAGE(WebDriver driver) {
		this.driver=driver;
	}
	
	By CIAM_TEST= By.xpath("//tbody/tr[3]/td[3]/a[1]");
	
	
	public WebElement getCiamTestLink() {
		
		return driver.findElement(CIAM_TEST);
	}
	
	

}
