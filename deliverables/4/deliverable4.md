# CS 1632 - Software Quality Assurance

Summer Semester 2019

Due 24 July

## Deliverable 4

For this assignment, you or you and a partner will design a performance test plan, execute performance tests, and document performance test results.

The system under test can be found here, https://github.com/asphaltpanthers/CS1632_Deliverable4.git. Instructions for installing can be found in the repo's ReadMe file.

The system takes in a request to calculate the Math.Tangent of a number like this:

`{ "input": 1 }`

And returns the result like this:

`{ "response": <tangent of 1> }`

The only performance threshold the customer of the tangent endpoint has is this.

- A typical user for the tangent endpoint will make a request every 10 milliseconds and the response time must be less than 300 milliseconds. Anything less than this is unacceptable.

## Format

Your repository should contain 3 things:

1. A performance test plan, PerformanceTestPlan.md or PerformanceTestPlan.docx.
2. A folder containing JMeter performance tests, JMeter.
3. Performance test results, PerformanceTestResults.md or PerformanceTestResults.docx.

The performance test plan should document your performance testing strategy. The document should answer questions like:

- What kind of tests will you execute against the system (load, stress, ramp up, etc)?
- Why are you executing these tests?
- What do you hope to learn from executing these tests?
- What are the hardware specifications of the system under test (aka your computer)?

In a folder named JMeter, store all the JMeter tests that you executed. A good performance test plan for this system should have at least 3 tests:

- Ramp up test
- Stress test
- Realistic load test

Instructions for setting up JMeter can be found in the JMeterREADME.docx file. I've created a JMeter test to get you started in the JMeter folder.

If you get the `java.net.BindException: Address already in use: connect` error message, a solution can be found here, https://www.baselogic.com/2011/11/23/solved-java-net-bindexception-address-use-connect-issue-windows/.

Finally the performance test results document should contain the results of the performance tests. Include graph screen shots from JMeter and whatever performance monitor you are using and answer the following questions.

- What is the maximum throughput of the tangent endpoint?
- What is the average response times of the tangent endpoint at its maximum throughput?
- How much of your systems resources were consumed during the tests (cpu, memory, etc).
- Keeping the customers performance threshold in mind, what is the maximum number of users that can use the system?

There are no right or wrong answers to these questions. Your task is to find the KPIs of your system.

You will be graded on how well your test plan describes the testing you will execute and how well your test plan demonstrates your knowledge of performance testing.

You will be graded on your test selection. You should execute enough tests to thoroughly performance test the system.

You will be graded on the content of your results. Can I read the results and clearly understand its conclusions and the logic used to reach those conclusions.

Written communication is key with performance testing. Performance testing is complicated stuff and its important that its documentation is clear and precise. Often, the people reading performance testing results are non-technical stakeholders. It's important that these stakeholders can read and understand the results of the tests.

## Grading

- Performance test plan - 40%
- JMeter tests - 20%
- Performance test results - 40%
