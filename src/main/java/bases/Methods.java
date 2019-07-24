package bases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Methods {

	public void navigate(String url) {
		DriverConfig.DRIVER.navigate().to(url);
	}
	
	public void click(By locator) {
		DriverConfig.WAIT.until(ExpectedConditions.elementToBeClickable(locator));
		WebElement element = DriverConfig.DRIVER.findElement(locator);
		element.click();
	}
	
	public void sendKey(By locator, String value) {
		DriverConfig.WAIT.until(ExpectedConditions.visibilityOfElementLocated(locator));
		WebElement element = DriverConfig.DRIVER.findElement(locator);
		element.clear();
		element.sendKeys(value);
	}
}
