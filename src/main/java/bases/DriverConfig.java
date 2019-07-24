package bases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverConfig {

	public static WebDriver DRIVER;
	public static WebDriverWait WAIT;
	
	public static void createDriver() {
		System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver.exe");
		DRIVER = new ChromeDriver();
	}
	
	public static void createWait() {
		WAIT = new WebDriverWait(DRIVER, 30);
	}
	
	public static void quitDriver() {
		DRIVER.quit();
		DRIVER = null;
	}
}
