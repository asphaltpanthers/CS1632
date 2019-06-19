**Selenium Notes (for Ryan, who tragically had to miss class):**

* selenium grid - can create a multiple computers for distributed testing
* selenium IDE
  * extension link: https://chrome.google.com/webstore/detail/selenium-ide/mooikfkahbdckldjjndioackbalphokd?hl=en (also available on FF)
  * records stuff
  * easy for beginners
  * build test via apoint and click reference
  * point of selenium: to test user interfaces
* Resources:
  * http://www.asphaltpanthers.com/
  * https://www.guru99.com/selenium-tutorial.html <- tutorials
* At the end of the day, we are comparing actual and expected performance
* Why code? Because it's more scalable
* Note: we will have to code in Java for deliverable 3

**Approaches:**
* Downloading HTML
 * Why not? 
  * Not using DOM (using client-side JS)
  * Very fragile test
  * No semantic understanding
  * Test is unreadable (not valid for large sites)
* Using a testing framework (Selenium, QTP, Catalan (works w/Ruby), Protractor (Angular framework), etc.)

**Selenium IDE:**
* Example 1: testing web GUI
 * Open extension
 * Screen will pop up
 * Right click - Selenium IDE - assert text
 * Click Play in the Selenium IDE and it will play
* Elements of the IDE
 * Target = web element
 * On the bottom of the IDEA an use "Reference" to understand methods
 
**Tips:**
* Can use IDE to record clicking on an object
* Go to Selenium IDE > Target
* Will give you a number of selection methods (that you could use)
* Can move commands around (drag and drop row) 
* Avoid intermittent failures via `waitForPageToLoad` (waits for another page to load with an optional timeout) 
 * Note: If you don't wait, Selenium can go faster than the browser and tests will fail :-(
 * `clickAndWait` (many forms of wait)
* Explicit wait (set max time to wait for something)

**Selenium IDE Assertions:***
* `assertText`
* `assertTextPresent`
* `assertElementPresent`
* `assertEditable`
* `assertAlert`
* `assertCookie`
* `assertEval` (Dustin doesn't use)

**Selenium w/Java:***
* Project - clone this repo: https://github.com/asphaltpanthers/CS1632_Deliverable3
 * You could also start from scratch... (see presentation for notes)
 * Selenium JAR file in class path
* WebDriver <- to manipulate browser (one for every browser)
 * Setting up driver
  * `WebDriver driver = HTMLUnitDriver();` // headless, lightweight and faster
  * `WebDriver driver = new FirefoxDriver();` // actual browser, the most supported driver
  * //+other drivers 
 * Navigate to a webpage
  * `driver.get("https://www.google.com");`
 * WebElements = anything that makes up a page (div tags, labels, buttons, images, pages)
  * Driver loads all of there references into hte driver object
  * Now we can use object selection  methods to get it to do something
 * Must select element
  * `driver.findElement()` to find a **specific** WebElement on a page
  * `driver.findElements()` for more than one WebElement on a page
  * the (unique) id is always preferred to test agains
 * Xpath selectors = way of search XMl structure in order to find a tag that we are interested in 
  * `//h2` xpath that searches for an h2 tag that exists anywhere
  * `//h1[1]` index locator, give us the second h1 (DON'T USE, it's just brittle)
  * `//[@id='sub-header']` search anywhere and find the id (@ = some attribute is coming) and will return that element
* Manipulating web browser
  * Most common actions `textBox.sendKey("Send text in input box");` and `randomElement.click();`
  * `F12` or `ctrl+i` Chrome Dev Tools -> Elements panel (use Xpath in the box)

**Coding Examples:**
* https://github.com/asphaltpanthers/CS1632/tree/master/examples/Lecture13/Lecture13Example/src
* Create a Base class that all tests work from (very DRY)
* Should all close the browser (e.g., `driver.quit();`)

Base class: \\ note: Dustin set this up for us in his CS1632_Deliverable 3 repository
```
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
```
* implicit wait = instructs the test to wait n seconds (Dustin recommends not doing, because it could fail and wastes resources)
 * `Thread.sleep(5);` (THIS SHOULD NOT BE IN 3RD DELIVERABLE, Dustin will take off points) 
* explicit wait = has a piece of code that executes until piece of code is true or timeout is reached

```
WebDriverWait wait = new WebDriverWAit (driver, 30);
wait.until((Predicate<WebDriver>)w->{
 //see deck
};
```

Example tests (with and without wait):
```
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class HelloWorldTest extends BaseTest { //Note: how it extends the BaseClass
	
	@Test
	public void helloWorldTestThatFails() {
		driver.get("http://www.google.com/"); //get URL
		
		driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("Hello World!" + Keys.RETURN); //Find element and insert Hello World and click Enter (i.e., carrage return)
        
        //TODO MUST ADD WAIT HERE
        
        WebElement rightHandSideHeader = driver.findElement(By.xpath("//div[contains(@class, 'kno-ecr-pt')]")); //this executes fast, must add in line above or it will fail, b/c program is too fast (and it hasn't loaded)
        assertEquals("\"Hello, World!\" program", rightHandSideHeader.getText());
        \\ should return false
	}
	
	@Test
    public void helloWorldTestThatSucceeds() {
        driver.get("http://www.google.com/");
        
        driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']")).sendKeys("Hello World!" + Keys.RETURN);
        
        By rightHandSideSelector = By.xpath("//div[contains(@class, 'kno-ecr-pt')]");
        waitUntil(d -> d.findElement(rightHandSideSelector).isDisplayed()); // WAIT ADDED :-), explicit wait, loops over code until the element is displayed (called a Lambda method, see BaseClass)
        assertEquals("\"Hello, World!\" program", driver.findElement(rightHandSideSelector).getText());
        \\ should return ture
    }
}
```
**Behaviour Driven Development:**
* evolution of TDD, but BDD != TDD
* focuses on the general expected behavior of the user 
* TDD focuses on writing good code
* BDD focuses on building the right product
* ATDD = acceptance test-driven development (once code is shipped, make sure that customer requirements are met)
  * Can use personas, user stories, etc.
  * As a <persona> I want to <perform this action> so that <reason/benefit>
  * Scenarios
  * Given / When / Then <-- Connextra format (Dustin mentioned this was important); pre-condititions, when, post-condition


