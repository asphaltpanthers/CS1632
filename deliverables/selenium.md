**Selenium Notes (for Ryan, who tragically had to miss class)**

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

**Approaches***
* Downloading HTML
 * Why not? 
  * Not using DOM (using client-side JS)
  * Very fragile test
  * No semantic understanding
  * Test is unreadable (not valid for large sites)
* Using a testing framework (Selenium, QTP, Catalan (works w/Ruby), Protractor (Angular framework), etc.)

**Selenium IDE**
* Example 1:
 * Open extension
 * Screen will pop up
 * Right click - Selenium IDE - assert text
 * Click Play in the Selenium IDE and it will play
* Example 2: 
 * 
* Elements of the IDE
 * Target = web element
 * On the bottom of the IDEA an use "Reference" to understand methods
 
**Tips**
* Can use IDE to record clicking on an object
* Go to Selenium IDE > Target
* Will give you a number of selection methods (that you could use)
* Can move commands around (drag and drop row) 
* Avoid intermittent failures via `waitForPageToLoad` (waits for another page to load with an optional timeout) 
 * Note: If you don't wait, Selenium can go faster than the browser and tests will fail :-(
 * `clickAndWait` (many forms of wait)
* Explicit wait (set max time to wait for something)

**Selenium IDE Assertions***
* `assertText`
* `assertTextPresent`
* `assertElementPresent`
* `assertEditable`
* `assertAlert`
* `assertCookie`
* `assertEval` (Dustin doesn't use)

**Selenium w/Java***
* Project - clone this repo: https://github.com/asphaltpanthers/CS1632_Deliverable3
 * You could also start from scratch... (see presentation for notes)
 * Selenium JAR file in class path
 * WebDriver <- to manipulate browser (one for every browser)
* 






