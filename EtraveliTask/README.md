# EtraveliTask
Test_assignment_-_QA_Automation_Engineer
GENERAL INFORMATION
- The framework is built with maven - build automation tool
which has pom.xml file that allows me to manage my
dependencies/versions easily.
- BDD approach is implemented to simplify reading and
understanding my framework for the
non-technical teammates.
- Test case is written in Gherkin language in my feature files
in order to be understandable for
users perspective .
- JAVA-SELENIUM-JUNIT are implemented the actual coding logic
with inside of the
step_definitions package and it their own respective/related
classes.
- Page Object Model is used to simplify managing and
maintaining the framework.
- Singleton Design Pattern is used in the "Driver Class" to
allow the framework to pass the same instance of the webdriver
in one session.
- "configuration.properties" type of file is created in order
to keep the important test data about the framework and some
personal data.
- "The ConfigurationReader Class" is created from existing
java library to read from property file.
- "The BrowserUtils Class" is created from existing java
library to some reusable codes.
- Hooks class is created in order to implement some cucumber
annotations such as Before, After, beforestep, afterstep to
create outline for the scenarios.- The "maven-cucumber-reporting" plugin is used for creating
"cucumber-html-reports" under target folder.
– It includes pie-charts, matrixes on which tests are passing
and failing. Even has the option to
show what percentage of which tags are failing and passing.
- The "maven-cucumber-reporting" plugin is used for creating
"cucumber-html-reports" under target folder.
– It includes pie-charts, matrixes on which tests are passing
and failing. Even has the option to
show what percentage of which tags are failing and passing.
