# CS 1632 - Software Quality Assurance
Summer Semester 2019
ASSIGNED 5 JUNE 2019; DUE 19 JUNE 2019

## Deliverable 2

For this assignment, you or you and a partner will write code and unit tests for Gold Rush, a simulator of prospectors hunting for gold and silver during the California Gold Rush and the Nevada Silver Rush.

Requirements for this program are in the `requirements.md` file in this directory.  Sample output is also provided for several runs of the program.  In case of ambiguity, please see the sample output as an example of what to display and how the system should work.  Note that the sample output shows specific routes for given seeds - you do NOT have to have your seeds create the exact same routes.  They are purely for demonstration purposes.

This program must be written in Java and use JUnit for the unit tests. 

All code and tests should be on GitHub in a private repository accessible to me.

Your repository MUST be named GoldRush.

## Format
ENSURE THAT I AM ADDED AS A COLLABORATOR ON GITHUB!  My username is `asphaltpanthers`. 

Before turning this assignment in, I HIGHLY recommend you double-check that all of the code that you think is committed is in fact committed by (1) looking at the code on the GitHub web interface and (2) cloning it down to a new directory on your machine and trying to run it from there.

Your repository should include a README file that includes a short ( < 1 page ) description of issues you faced when writing this code and tests.  If any tests you wrote fail, they should be included here, along with why you think that they are failing.

Your repository should also include a screen shot of the executed unit tests. If a test doesn't pass, it should be included in the concerns section above.  Ideally, for a perfect grade, all tests should be green (passing).  However, if you have what you think is a valid test and it is not passing, I would prefer that you include a defect report (in the proper template!) rather than just deleting it.  Knowing that a defect exists and reporting it is much better than having it discovered by the customer (me)!

At least four (4) unit tests should use stubbing of methods.

At least three (3) unit tests should test an edge case.  These should be marked in the comments above with the term "EDGE CASE" in all-caps on its own line, like so:

```java
// This unit test checks what happens if we try to set a value
// larger than the maximum value.  It should return -1 in that case.
// EDGE CASE
```

There should be an absolute minimum of sixteen (16) unit tests and 90% statement coverage as measured by JUnit.  Note that the above are ABSOLUTE MINIMUM values.  You will not get a perfect score just for meeting these two criteria.  Rather, if you have less than these, you will automatically lose points: -5 points for each non-trivial/non-tautological unit test less than 16 (see the next paragraph for what I mean by "non-trivial" and "non-tautological" unit tests) and -1 for each coverage percentage point less than 90% (e.g., 88% statement coverage = -2, 80% statement coverage = -10, etc., up to -30).  There is one exception to this: you may exclude the main `GoldRush.java` from coverage, as long as it is 20 lines or fewer.

Unit tests should be valid and pass, and should be checking non-trivial aspects of the program.  For example, checking that `Game.new` returns a object of class Game, or that its return value is not nil, will generally not count in terms of unit test count.  In general, if the test is tautological - that is, there is no realistic way it will ever fail - you should not waste time writing it.  That being said, in rare instances, you may have a few of these in order to increase code coverage in some circumstances (e.g. very bare-bones constructors that do not provide much publicly accessible state to check), but they will not count in terms of the count of overall unit tests.

Group the unit tests for each method together (see format below).  Before each group of unit tests for a method, do an equivalence class partitioning for that method OR, for a method that does not lend itself to this, indicate why not.  For example, assume you have a method which just prints a line of asterisks to the console:

```java
public void printLine() {
    for (int i = 0; i < 80; i++) {
        System.out.println("*");
    }
}
```

You can write down that as the method does the same thing every time, and has no parameters, it does not make sense to partition it.  Generally, this should be a rare case.  The following method, for example, definitely does have multiple equivalence classes and should be partitioned!

```java
public void printLine(int i) {
    for (i = i; i < 80; i++) {
        System.out.println("*");
    }
}
```
If you have a method which seems like it would have an extreme number of equivalence classes (>6), perhaps due to a large number of parameters, you may instead just write down a list of possible success and failure cases.  For example,

```java
// Returns concatenated version of all vars.
// SUCCESS CASES: All variables are valid and contain something that can be stringified
// FAILURE CASES: If any variable is nil, that area is blank

// REFERENCED METHOD
public void concatStuff(String a, String b, String c, String d, String e, String f) {
    return a + ": " + b + " and " + c + " / " + d + " / " + e + "(" + f + ")";
}
```

The following format should be used:

```java
// UNIT TESTS FOR METHOD absolute_value(x)
// Equivalence classes:
// x= -INFINITY..-1 -> returns -x
// x= 0..INFINITY -> returns x
// x= (not a number) -> returns nil

// If a negative value is given for x, then -x is returned.
@Test
public void testNegativeVal() {
    Assert.assertEqual(1, Math.abs(-1));
}

// If a positive value is given for x, then x is returned.
@Test
public void testPositiveVal() {
    Assert.assertEqual(1, Math.abs(1));
}

// If an invalid value, such as a string, is given for x,
// then nil is returned.
// EDGE CASE
public void testInvalidVal() {
    Assert.assertNull(Math.abs("poodle'"));
}
```

Keep in mind some of the things we learned when doing manual testing; you should be cognizant of equivalence classes, boundary values, etc. and focus on them.

The program should use appropriate object-oriented design.  Think of what objects could possibly exist to describe this world, and what methods they should have.  Do not attempt to do this with no classes or methods, etc.  It is, of course, possible, but will make testing more difficult!

For this project, you should endeavour to get a good sampling of different equivalence classes and success/failure cases.

If you are not familiar with seeds for random number generators, recall that in the absence of external input, a computer can only generate data deterministically.  This seed will act as our "external input".  I recommend you review the Java Random class: <https://docs.oracle.com/javase/8/docs/api/java/util/Random.html>  Remember that running your program twice with the same seed should *always* produce the same output.

Before each test, add some comments (two or three sentences, on average) explaining what the test is checking.

## Exiting With Exit Code

To exit with a specific exit code, just use the method `System.exit(int status)` with one integer argument, e.g. `System.exit(5)` will cause the current program to cease execution and exit with exit code 5.

## Test Execution

I should be able to run ALL of the tests from the Eclipse JUnit test runner.

## Grading
I remind you that grammar and good code count as well as functionality.  By good code, I mean: no commented-out code unless there's an EXPLICIT reason, properly indented code, no misspelled words or bad grammar, in comments or summaries, etc.

The program must be run from Eclipse or by typing `java GoldRush *seed* *number of prospectors*`  at the command line in the Eclipse `bin` directory. 

You may ignore the main `GoldRush.java` file IF AND ONLY IF it has 20 or fewer lines of code.  This will be very useful when developing your tests, so I recommend you look back at D1 and the sample code to see how they are laid out in order to see how to minimize the number of lines in `gold_rush.rb`.

You will lose points if the program itself runs when I try to run the tests.  If you are having trouble with this, remember that any code that you require by a test file will be run.  Having a very small "main" file, which "imports" many files that only have classes, will help you avoid this situation - you can then just test the individual class files and treat the `GoldRush.java` file as an untested `public static void main`.

Unlike D1, you do NOT need to precisely line up requirements with test cases or develop a traceability matrix, but requirements are still useful for doing exploratory testing of your finished product.

## Grading Breakdown
* Summary and Testing Concerns- 5%
* Screenshot of executed unit tests - 5%
* Program Functionality - 45%
* Test Code (including statement coverage) - 45%
* [-1 for each percentage point of statement coverage below 90%, possibly excluding GoldRush.java]
* [-5 for each non-trivial unit test less than 16]

Please feel free to email me or come to office hours to discuss any problems you have.
