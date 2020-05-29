# Tutorial_testing
This Github page provides code for "[Tutorial] An introduction to unit test, regression test and code coverage with IntelliJ".
The instructions to this tutorial can be found [here](https://medium.com/@marcus.jonssonewerbring/tutorial-an-introduction-to-unit-test-regression-test-and-code-coverage-with-intellij-b08be1268719)

## Setup

Open IntelliJ, and select the import project and select the Tutorial_testing project. Note, if you are using IntelliJ 2020, open and import will be on the same button.

In the next step, select “Maven project” and click next. Note, if you are using IntelliJ 2020, the project will open the project instantly. Use the standard values in the upcoming windows by just clicking next, until IntelliJ has open the project. Expand the project structure in the left corner of IntelliJ and make sure that it is similar to the next image.

Note, if you get a notification in the down-right corner that you need to import/download some feature, do so.

![](/github_images/structure.png)

If the project structure is not correct, first make sure that IntelliJ is done with the import, if not try to import the project again. If the project structure seems to be correct look to the right edge of IntelliJ and expand the maven tab. Click on the button “Execute Maven Goal”.

Note, if the maven tab is not visible, click “View” select “Tool Windows” and then click on “Maven Projects”.
![](/github_images/execute_maven.png)
In the window, write “mvn package” to execute the code, you can also write “mvn test” to just run the tests. “mvn package” will build the program and execute the tests which are illustrated in the image below.

![](/github_images/mvn_package.png)

The program should output the following:

![](/github_images/tests.png)

## Project structure
The project used in this tutorial consists of two parts Tutorial_testing Tutorial_PBT. The reason why it’s 2 projects is that they are using dependencies that are not compatible with each other.

Tutorial_testing is the main project which contains a small math class called MyMath, the class Sort, the class MusicDatabase and the class MusicServices. These classes were constructed as a template to make it easier to construct unit tests. The class SortTest is an incomplete test class where you should add some extra unit tests. MyMath, Sort, MusicDatabase and MusicServices are located in the src/main/java and SortTest is located in src/main/java.

Tutorial_PBT is only used in the part property-based testing part of this tutorial. This project contains a copy of the Sort class and it’s test class SortTest. Sort is located in the src/main/java and SortTest is located in src/main/java.


