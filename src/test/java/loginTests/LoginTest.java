package loginTests;

import org.junit.Ignore;
import org.junit.Test;

import bases.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.LoginPage;

import java.util.Collections;

public class LoginTest extends TestBase{
	
	private LoginPage loginPage;
	private String url = "http://blazedemo.com/login";
	private String email = "teste@teste.com";
	private String password = "123456";

	public LoginTest() {
		loginPage = new LoginPage();
	}
	
	@Test
	public void Login() {
		loginPage.navigate(url);
		loginPage.setEmail(email);
		loginPage.setPassword(password);
		loginPage.clickLogin();
	}

}
