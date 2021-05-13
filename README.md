# seg3103_playground
| Outline | Value |
| --- | --- |
| Course | SEG 3103 |
| Date | Summer 2021 |
| Cynthia Sheng | xshen061@uottawa.ca |
| Xinyu Jin | xji059@uottawa.ca |


### Java

I am running Java openjdk 11

```bash
C:\Users\xiash>java --version
openjdk 11.0.10 2021-01-19
OpenJDK Runtime Environment AdoptOpenJDK (build 11.0.10+9)
OpenJDK 64-Bit Server VM AdoptOpenJDK (build 11.0.10+9, mixed mode)
```

To run the Java program (in `newmath_java`), first I compile it

```bash
javac seg3103/seg3103_playground/newmath_java/src/*.java
```
Then I run it

```bash
java -cp ./dist Main
```
Here is an output of the running program

```bash
Newmath (type 'exit' to exit program)
Numerator: 10
Demoninator: 5
10 / 5 = 2
Numerator: 20
Demoninator: 6
20 / 6 = 3
Numerator: exit
```

With a screenshot from the terminal
assets/java_main.PNG

### JUnit

I am working with JUnit 5 (via Console standalone 1.7.1)

To run JUnit, I need to compile the application (see above), and then compile the test code

```bash
javac -cp dist;lib/junit-platform-console-standalone-1.7.1.jar test/*.java
```

Then I run the tests using

```
java -jar lib/junit-platform-console-standalone-1.7.1.jar --class-path dist --scan-class-path
```

Here is the output of the tests

```bash
Thanks for using JUnit! Support its development at https://junit.org/sponsoring
←[36m.←[0m
←[36m+--←[0m ←[36mJUnit Jupiter←[0m ←[32m[OK]←[0m
←[36m| '--←[0m ←[36mNewmathTest←[0m ←[32m[OK]←[0m
←[36m|   +--←[0m ←[34mdiv_ok()←[0m ←[32m[OK]←[0m
←[36m|   '--←[0m ←[34mdiv_by_zero()←[0m ←[32m[OK]←[0m
←[36m'--←[0m ←[36mJUnit Vintage←[0m ←[32m[OK]←[0m

Test run finished after 83 ms
[         3 containers found      ]
[         0 containers skipped    ]
[         3 containers started    ]
[         0 containers aborted    ]
[         3 containers successful ]
[         0 containers failed     ]
[         2 tests found           ]
[         0 tests skipped         ]
[         2 tests started         ]
[         0 tests aborted         ]
[         2 tests successful      ]
[         0 tests failed          ]

```

With a screenshot from the terminal
assets/junit_main.png

### Elixir

I am running Elixir 11.4 with Erlang 23

```bash
elixir --version
Erlang/OTP 21 [erts-10.3] [64-bit] [smp:8:8] [ds:8:8:10] [async-threads:1]

Elixir 1.11.4 (compiled with Erlang/OTP 21)
```

To run the Elixir program (in `newmath_ex`), first I compile it

```bash
mix compile
```

Then I run it

```bash
iex -S mix
```

Here is an output of the running program

```elixir
iex(1)> NewmathEx.
MixProject    div/2
iex(1)> NewmathEx.div(10, 2)
{:ok, 5.0}
```

With a screenshot from the terminal

assets/elixir_iex.png
