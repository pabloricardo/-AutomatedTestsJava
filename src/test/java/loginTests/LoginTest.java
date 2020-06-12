package loginTests;

import org.junit.Test;

import bases.TestBase;
import pages.LoginPage;

public class LoginTest extends TestBase{
	
	private LoginPage loginPage;

	public LoginTest() {
		loginPage = new LoginPage();
	}
	
	@Test
	public void Login() {
		loginPage.navigate(PROP.getProperty("url"));
		loginPage.setEmail(PROP.getProperty("email"));
		loginPage.setPassword(PROP.getProperty("password"));
		loginPage.clickLogin();
	}

}
