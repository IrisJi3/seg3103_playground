# SEG3103 Assignment 3

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
mvn --version
```
![maven](assets/mv.JPG)

### mvn compile
```bash
mvn compile
```
![maven](assets/mc.JPG)

### mvn package -DskipTests
Then compile all of the tests without running them:
```bash
mvn package -DskipTests
```
![maven](assets/test1.JPG)

It packages all project files into one jar file: BookstoreApp-0.1.0.jar:
![maven](assets/test2.JPG)

### java -jar ./target/BookstoreApp-0.1.0.jar
```bash
java -jar ./target/BookstoreApp-0.1.0.jar
```
![maven](assets/jar1.JPG)

http://localhost:8080 didn't work:

![maven](assets/localhost1.JPG)

Then, after referring to ..\seg3103_playground\Assignment3\BookstoreApp\src\main\java\main\App.java, it used a different jar file:
```bash
ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
```
![maven](assets/jar2.JPG)

So, used 
```bash
java -jar bookstore5.jar
```
![maven](assets/jar3.JPG)

Now it worked:
![maven](assets/localhost2.JPG)


### mvn test

```bash
mvn test
```
![maven](assets/test4.JPG)
![maven](assets/test5.JPG)


