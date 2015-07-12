package driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public abstract class WebDriverTestBase {

	protected WebDriver driver;
	
	@Before
	public void setUp(){
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown(){
		driver.close();
	}
}
