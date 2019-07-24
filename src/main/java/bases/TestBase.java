package bases;

import org.junit.After;
import org.junit.Before;

public class TestBase {
		
	@Before
	public void setUp() {
		DriverConfig.createDriver();
		DriverConfig.DRIVER.manage().window().maximize();
		DriverConfig.createWait();
	}
	
	@After
	public void tearDown() {
		DriverConfig.quitDriver();
	}

}
