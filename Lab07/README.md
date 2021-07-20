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

### Bug 1: Comparison of String parameter using == or !=

Here is the bug:
![bugs](assets/b1.JPG)

Should use equals() method for String:
![bug](assets/f1.JPG)

### Bug 2: Certain swing methods needs to be invoked in Swing thread

Here is the bug:
![bugs](assets/b2.JPG)

Swing method isVisible() is not thread-safe in Java, so it might cause deadlock or some threading issues.

### Bug 3: Could be refactored into a named static inner class

Here is the bug:
![bugs](assets/b3.JPG)

We know CalCFrame class is the outer here. So we can create a new inner class in CalCframe like inner class. Then we can call inner.WindowClose(WindowEvent e) in outer class, of course make it in a static innner class. So we can pass the WindowEvent as argument and don't need to create a new WindowAdapter to make the class to large. 

### Bug 4: Private method is never called

Here is the bug:
![bugs](assets/b4.JPG)

Since the code is never called, and it is not a test at all, so I just delete it.
![Running Java in the console](assets/bug4-4.png)


### Bug 5 and 6: Boxing/unboxing to parse a primitive

Here are the Bug 5 and Bug 6, they have the same Bug issue:
![bugs](assets/b5.JPG)
![bugs](assets/b6.JPG)

We just need to change the code to XXX.parseXXX method
![bugs](assets/f5.JPG)
![bugs](assets/f6.JPG)


### Bug 7 to Bug 12: Unread field: should this field be static?

Bug 7 to Bug 12 have the same bug issue:
![bugs](assets/b7.JPG)

We just need to make them to static value.

![bugs](assets/f7.JPG)

### Bug 13: Method uses the same code for two branches

Here is the bug:
![bugs](assets/b13.JPG)

Since all the condition have will lead to the same result, we just need to remove the "else".

![bugs](assets/f13.JPG)

Here we delete all the if,else if and else because this bug is linked to bug 15-17.

### Bug 14: Switch statement found where default case is missing

Here is the bug:
![bugs](assets/b14.JPG)

We know it just miss a default statement, so we just need to add one.

![bugs](assets/f14.JPG)

### Bug 15-17: Condition has no effect


Bug 15 to Bug 17 have the same bug issue:
![bugs](assets/b15.JPG)

We know the reason is all the condition has the same result, so the condition has no meaning, we can delete all of them
![bugs](assets/f15.JPG)

### Bug 18: Condition has no effect(2)

Here is the bug:
![bugs](assets/b18.JPG)

We just need to delete the code because they did nothing(same result as the previous code)
![bugs](assets/f18.JPG)

### Check again
As expected, all bugs that we fixed no longer showed up in the analysis. There are only 2 bugs - bug 2 and bug 3 - remain, since we didn't fix them. 
![bugs](assets/bug.JPG)









