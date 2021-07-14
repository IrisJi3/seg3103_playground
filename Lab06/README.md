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

### Compile BookStoreApp
Then extract compressed BookStoreApp file and compile:

###### mvn compile
```bash
mvn compile
```
![maven](assets/compile1.JPG)
![maven](assets/compile1-2.JPG)

###### mvn package DskipTests
Then compile all of the tests without running them:
```bash
mvn package -DskipTests
```
![maven](assets/compile2.JPG)

It packages all project files into one jar file: BookstoreApp-0.1.0.jar:
![maven](assets/compile2-2.JPG)

###### java -jar ./target/BookstoreApp-0.1.0.jar
```bash
java -jar ./target/BookstoreApp-0.1.0.jar
```
![maven](assets/jar1.JPG)

http://localhost:8080 didn't work:

![maven](assets/8080.JPG)

Then, after referring to C:\Users\xiash\seg3103\seg3103_playground\Lab06\BookstoreApp\src\main\java\main\App.java, it used a different jar file:
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

Then, logged in with admin:
![maven](assets/login.JPG)

Now the screen showed:
![maven](assets/8080-2.JPG)

###### mvn test
```bash
mvn test
```
![maven](assets/test1.JPG)
![maven](assets/test2.JPG)


