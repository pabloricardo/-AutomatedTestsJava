package bases;

import org.junit.After;
import org.junit.Before;

import java.util.Properties;

public class TestBase {

	public static Properties PROP;
		
	@Before
	public void setUp() {
		DriverConfig.createDriver();
		DriverConfig.DRIVER.manage().window().maximize();
		DriverConfig.createWait();
		PROP = DriverConfig.setProperties();
	}
	
	@After
	public void tearDown() {
		DriverConfig.quitDriver();
	}

}
