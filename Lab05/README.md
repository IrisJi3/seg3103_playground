# SEG3103 Laboratory 5

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Henry Chen |
| Student 1 | Xia (Cynthia) Sheng (300091655) |
| Student 2 | Xinyu Ji (300061354)) |


### System

Windows 10

### setup
run the following code in grade folder:
```bash
mix deps.get
cd assets && npm install
```
![version](assets/deps-get.JPG)
![version](assets/npm-install.JPG)

Then we can run
```bash
mix phx.server
```
and login http://localhost:4000/:
![version](assets/grade.JPG)

### Stub
There is an error occurred when open http://localhost:4000/ and the button did't work. CMD showed that "function Grades.Calculator.letter_grade/1 is undefined (module Grades.Calculator is not available)". After checking page_live.ex, the module name should be Grades.Calculator. Then, according to TA, adding random number for each function to see if it works:
![part1](assets/random.JPG)

And it works now:
![part1](assets/random1.JPG)

Then, replace the code with assignment2. Run again.
