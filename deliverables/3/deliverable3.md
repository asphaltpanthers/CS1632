# CS 1632 - Software Quality Assurance
Summer Semester 2019

DUE 3 July

## Deliverable 3

For this assignment, you or you and a partner will write systems-level, automated black-box tests for a web app using Selenium. 

Test code should be on a private Github repository named 'CS1632_Deliverable3', and I should be added as a collaborator by the beginning of class on the due date.

The web app is located here: <https://cs1632summer2019.herokuapp.com/>

## Format
Your repository should include a README file that includes a short ( < 1 page ) description of issues you faced when writing this code and tests.  If any tests you wrote fail, they should be included here, along with why you think that they are failing.

Your repository should also include a screen shot of the executed unit tests. If a test doesn't pass, it should be included in the concerns section above.  Ideally, for a perfect grade, all tests should be green (passing).  However, if you have what you think is a valid test and it is not passing, I would prefer that you include a defect report (in the proper template!) rather than just deleting it.  Knowing that a defect exists and reporting it is much better than having it discovered by the customer (me)!

The code should be a suite of JUnit tests that leverage Selenium to test the web application.

There should be a bare minimum of twenty tests, checking various base, edge, and corner cases.  There is a maximum of thirty tests.  However, do not focus on the number of tests too heavily; I am more concerned that you cover a broad variety of cases, check the requirements, and ones which are focused and yet still likely to find defects.

## Requirements

Requirements for the application are listed in the `requirements.md` file in this directory.

Remember to check for implicit as well as explicit requirements!

You should have at least one test for each requirement.

## Grading
* Summary and Testing concerns - 10% 
* Screen shot or printout of test results - 5%
* Tests - 85%

Please feel free to email me or come to office hours to discuss any problems you have. 

