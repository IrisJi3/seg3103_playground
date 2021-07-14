# SEG3103 Laboratory 6

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Zahra Kakavand |
| Student 1 | Cynthia Sheng (30091655) |
| Student 2 | Iris Ji (300061354) |

### mvn version
download Maven and install by the instruction at https://maven.apache.org/install.html. Here is the Maven version:
```bash
mvn -v
```
![maven](assets/mvn-v.JPG)

### mvn compile
```bash
mvn compile
```
![maven](assets/compile1.JPG)
![maven](assets/compile1-2.JPG)

### mvn package -DskipTests
Then compile all of the tests without running them:
```bash
mvn package -DskipTests
```
![maven](assets/compile2.JPG)

It packages all project files into one jar file: BookstoreApp-0.1.0.jar:
![maven](assets/compile2-2.JPG)

### java -jar ./target/BookstoreApp-0.1.0.jar
```bash
java -jar ./target/BookstoreApp-0.1.0.jar
```
![maven](assets/jar1.JPG)

http://localhost:8080 didn't work:

![maven](assets/8080.JPG)

Then, after referring to ..\seg3103_playground\Lab06\BookstoreApp\src\main\java\main\App.java, it used a different jar file:
```bash
ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
```

So, used 
```bash
java -jar bookstore5.jar
```
![maven](assets/jar3.JPG)

Now it worked:
![maven](assets/8080-1.JPG)


### mvn test
```bash
mvn test
```
![maven](assets/test1.JPG)
![maven](assets/test2.JPG)

### Screenshot of at least one additional selenium web driver test
Test if it enabled to login as admin:
![maven](assets/login.JPG)

The code added to ..\seg3103_playground\Lab06\BookstoreApp\src\test\java\selenium\ExampleSeleniumTest.java:
![maven](assets/test3.JPG)

##### mvn test for new test
```bash
mvn test
```
![maven](assets/test4.JPG)
![maven](assets/test5.JPG)


