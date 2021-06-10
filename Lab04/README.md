# SEG3103 Laboratory 4

| Information | Value |
| --- | --- |
| Course | SEG 3103 |
| Semester | Summer 2021 |
| Professor | Andrew Forward |
| TA | Nazanin Bayati |
| Student 1 | Xia (Cynthia) Sheng (300091655) |
| Student 2 | Iris Ji (300061354)) |


### Elixir

I am running Elixir 12.0 with Erlang 22

```bash
elixir --version
```
![version](assets/elixir-version.JPG)

To run the Elixir program (in `fizzbuzz` and `tic`), first I compile it

```bash
mix compile
```

Then I run it

```bash
iex -S mix
```

Here is an output of the running program with a screenshot from the terminal

![compile](assets/elixir-fb.JPG)
![compile](assets/elixir-tic.JPG)

### ExUnit

ExUnit is built directly into Elixir (and compiled like above with `mix compile`)

To run the tests

```
mix test
```

Here is the output of the tests, with a screenshot from the terminal
![test](assets/elixir-fbtest.JPG)
![test](assets/elixir-tictest.JPG)


## Test Driven Development

To compile:

    javac -encoding UTF-8 --source-path test -d dist -cp lib/junit-platform-console-standalone-1.7.1.jar test/*.java src/*.java

Then run the tests:

```
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```


### Commit 1 - test_defaultBoard():

function of default_Board() creates a 3x3 2D array with all elements are "_".

Make it fail first:
```
String[] [] map = {{"_","_","_"},{"_","0","_"},{"_","_","_"}};
```

Failed because using "0" instead of "_".
![TDD](assets/fail1.JPG)

Then, change it to all "_" 

```
String[] [] map = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
```

It passed now:
![TDD](assets/pass1.JPG)

Here is the commit of 1st group:

![image](assets/group1.JPG)


### Commit 2 - test_defaultBoard():

Here is to test whether it fails when a 2x2 2D array with all elements are "_".

![TDD](assets/fail2.JPG)

Then, change it back:

![TDD](assets/pass2.JPG)

Here is the commit of 2nd group:

![image](assets/group2.JPG)



