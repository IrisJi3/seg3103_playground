# SEG3103 Laboratory 6

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Zahra Kakavand |
| Student 1 | Cynthia Sheng (30091655) |
| Student 2 | Iris Ji (300061354) |

### Maven 
download Maven and install by the instruction at https://maven.apache.org/install.html. Here is the Maven version:
```bash
mvn -v
```
![maven](assets/mvn-v.jpg)

### Compile BookStoreApp
Then extract compressed BookStoreApp file and compile:
```bash
mvn compile
```
![maven](assets/compile1.jpg)
![maven](assets/compile1-2.jpg)

Then compile all of the tests without running them:
```bash
mvn package -DskipTests
```
![maven](assets/compile2.jpg)
It packages all project files into one jar file, so that we can easily run it.
![maven](assets/compile2-2.jpg)





