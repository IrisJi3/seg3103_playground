# SEG3103 Laboratory 7

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Henry Chen |
| Student 1 | Cynthia Sheng (30091655) |
| Student 2 | Iris Ji (300061354) |


### System

Windows 10

## Compile and run

Compiled the program by 
```bash
javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java
```
![compile](assets/1.JPG)

then ran with 
```bash
java -cp ./dist Main
```
![compile](assets/2.JPG)

Then we run
```bash
java -jar ./lib/spotbugs/lib/spotbugs.jar 
```

to start SpotBugs
![bugs](assets/s1.JPG)

We see there are total 18 bugs in the program:
![bugs](assets/s2.JPG)









