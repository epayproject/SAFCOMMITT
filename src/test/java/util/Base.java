package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	
	public static WebDriver getDriver() throws IOException {
		
		Properties prop=new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\ARCHANA\\eclipse-workspace\\SAF\\config.properties");
		prop.load(fis);
		String projectPath=System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
