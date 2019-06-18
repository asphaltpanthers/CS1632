import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class BaseTest {
	public WebDriver driver;
	private WebDriverWait wait;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 30);
	}
	
	@After
	public void teardown() {
		driver.quit();
	}
	
	public void waitUntil(Function<WebDriver, Boolean> predicate) {
		wait.until(predicate);
	}
}
