package loginTests;

import org.junit.Test;

import bases.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase {
	
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
