# Masai School Selenium Automation

## Project Overview
This project is an automated test framework for testing an  career Educational website using Selenium WebDriver, TestNG. It includes test plans, test cases, bug reports, and automation scripts.

## Directory Structure
```
mrrajak1296-masai/
├── Bug Report (2).xlsx       # Document containing bug reports
├── TEST_PLAN (6).docx        # Test plan document
├── Test Cases (5).xlsx       # Test cases documentation
├── The Summary Report (5).docx # Summary report of test execution
├── pom.xml                   # Maven configuration file
├── src/
│   └── test/
│       └── java/
│           └── masaiSchool/
│               └── allMasai.java # TestNG test script
└── test-output/
    ├── emailable-report.html # TestNG email report
    ├── index.html            # TestNG report index
    ├── testng-failed.xml     # Failed test cases
    ├── testng-reports.css    # TestNG styles
    ├── testng-reports.js     # TestNG scripts
    ├── testng-reports1.css   # Additional styles
    ├── testng-reports2.js    # Additional scripts
    ├── testng-results.xml    # TestNG results
    ├── Default suite/
    │   ├── Default test.html
    │   ├── Default test.xml
    │   └── testng-failed.xml
    └── junitreports/
        └── TEST-masaiSchool.allMasai.xml # JUnit test report
```

## Prerequisites
Before running the automation tests, ensure you have the following installed:
- Java (JDK 11 or later)
- Maven
- Selenium WebDriver
- TestNG
- ChromeDriver (or appropriate WebDriver for your browser)

## Running Tests with TestNG
Run tests using TestNG:
```sh
mvn test
```
Alternatively, you can execute tests via the `testng.xml` file:
```sh
mvn test -DsuiteXmlFile=testng.xml
```

## Test Reports
After test execution, TestNG reports can be found in the `test-output/` directory. Open `index.html` for a detailed test report.
