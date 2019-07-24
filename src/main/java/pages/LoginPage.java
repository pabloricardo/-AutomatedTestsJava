package pages;

import org.openqa.selenium.By;

import bases.Methods;

public class LoginPage extends Methods{
	
	By emailField = By.id("email");
	By passwordField = By.id("password");
	By btnLogin = By.cssSelector("button[type='submit']");
	
	public void setEmail(String email) {
		sendKey(emailField, email);
	}
	
	public void setPassword(String password) {
		sendKey(passwordField, password);
	}
	
	public void clickLogin() {
		click(btnLogin);
	}
}
