# CS 1632 Midterm 1 Exam Study Guide - Fall 2018

## TESTING THEORY AND TERMINOLOGY
* Equivalence class partitioning
 - **equivalence class**: a group of input values, which provide similar output
 - **equivalence class partitioning**: separating a specific functionality into distinct equivalence classes based on input values.
  - must maintain strict partitioning (i.e., nothing should be undefined)
* Boundary and interior values
 - **boundary values**: a value which is on the boundry of equivalence classes
 - **interior values**: a value that is not a boundry value in an equivalence class
* Base, Edge, and Corner cases
 - **base case**: a test case for basic functionality of a system (happy path :)
 - **edge case**: a test case for functionality of a system which can be expected, but is probably rare and will likely require additional dev work(sad path TT.TT)
 - **corner case**: a test case using ludacris input (sad path TT.TT)
* Static vs Dynamic testing
  - **static testing**: testing the system w/o executing any code (e.g., code analysis, modelling tools)
  - **dynamic testing**: testing the system by executing it (e.g., unit testing, black-box testing)
* Black/White/Grey box testing
  - **black box testing**: testing with no knowledge of how the systems works, as a user would (e.g., manual)
  - **white box testing**: testing knowing code(base) (e.g., unit testing)

## REQUIREMENTS ANALYSIS
* What makes a good or bad requirement?
  - Good
   - complete
   - consistent
   - unambiguous
   - quantitative
   - feasible to test
  - Bad = opposite of Good
* Functional vs Non-Functional Requirements  (Quality Attributes)
  - **functional requirements**: state what the system should do
  - **non-functional requirements**: state what the system should be (aka quality, the -ity) (e.g., reliability, usability, robustness, performance, portability, size, safety, ease of use)

## TEST PLANS
* Verification vs validation
 - **verification**: build software right (i.e., no bugs)
 - **validation**: build righ software (i.e., user will like)

## DEFECT REPORTING
* Be prepared to report a defect based on a test case
* Remember the defect template:
  * SUMMARY, DESCRIPTION, REPRODUCTION STEPS, EXPECTED BEHAVIOR, OBSERVED BEHAVIOR
  * Optionally: SEVERITY/IMPACT, NOTES
  * Levels of severity: BLOCKER, CRITICAL, MAJOR, NORMAL, MINOR, TRIVIAL
* Coding mistakes vs defects

## Smoke, Exploratory, and Path-based testing
* Define all of these concepts
 - **smoke testing**: a minimal amount of testing that can be done to ensure that they system under test is ready for further testing
 - **exploratory testing**: testing w/o specific plan, goal to learn/influence/explore development of the system (aka ad hoc testing)
 - **path-based testing**: ?

## AUTOMATED TESTING
* Pros and cons of automated testing
 - Pros: 
  - no chance of human/execution errors (also can be negative)
  - fast
  - easy to execute
  - repeatable
  - less resource intensive / scales well
  - only way to test some features
  - cheaper in the long-run
 - Cons
  - requires extra time upfront
  - may not catch user-facing bugs
  - requires learning tools/frameworks
  - requires CS and software QA skillset
  - only tests what is looking for
  - tautological and other bad tests may creep in

## UNIT TESTING
* Unit tests
  * Understand how to write a JUnit test (basic syntax)
    - 
* Given some Java code, be able to perform an equivalence class partitioning and write tests for it - study

## BREAKING SOFTWARE
* Be prepared to think of happy path vs edge case testing
* What are various ways that software can break?
 - logic errors
 - off-by-one errors
 - rounding / floating point errors
 - integration errors
 - errors of assumption
 - missing data
 - bad data
 - display errors
 - injection errors
 - network errors
 - disk i/o errors
 - interface errors
 - null pointer errors
 - distribution system errors
 - configuration errors
 - accessibility errors

## TDD
* Basic concepts of test-first development
 - write test b4 code
 - write only code that is tested
 - write only tests that test the code
 - short turnaround cycle
 - refactor (early/often)
* The red-green-refactor loop
 1. red - make a test that should fail.
 2. green - write test to ensure the test passes
 3. refactor - impove (remove magic numbers)
 4. repeat
 
 "make it green, then make it clean"

## WRITING TESTABLE CODE
* Basic strategies for testable code
 1. dependency injection
 2. interfaces 
 3. segment code
 4. give something to test
  - return values
  - throw exceptions
  - modified accessible attributes
 5. DRY
 6. use dominant paradigm for framework
* The DRY Principle
