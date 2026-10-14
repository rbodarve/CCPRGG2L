# CCPRGG2L - Intermediate Programming

Comprehensive collection of Java programming exercises and projects covering object-oriented programming, GUI development, threading, file I/O, and regular expressions. This repository contains coursework from the CCPRGG2L intermediate programming course, demonstrating progressive skill development from basic console applications to advanced GUI applications with multi-threading.

## Table of Contents

- [About](#about)
- [Course Structure](#course-structure)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Organization](#project-organization)
- [How to Run](#how-to-run)
- [Course Progression](#course-progression)
- [Review notes (2026-10-14)](#review-notes-2026-10-14)
- [Contributing](#contributing)
- [License](#license)
- [Credits](#credits)

## About

CCPRGG2L is an intermediate programming course that progresses from fundamental Java concepts to advanced graphical user interface (GUI) development with Swing. This repository documents the learning journey with weekly exercises and practice programs covering:

- Array manipulation and dynamic data structures
- Object-oriented programming (inheritance, composition, polymorphism)
- GUI development with Swing
- Multi-threading and concurrent programming
- File I/O operations
- Regular expressions and pattern matching

## Course Structure

The repository is organized by weekly topics:

### Week 3: Basic Programming Concepts
- **distCoordinates.java** - Calculate distance between two points using the distance formula (integer coordinates only: a decimal such as `0.5` or text stops the program with `InputMismatchException`)
- **leapYear.java** - Determine if a given year is a leap year
- **normalDeleteArray.java** - Delete elements from an ArrayList
- **threeSumAvePro.java** - Calculate sum, average, and product of three numbers (integer input only: `1.5` or text stops the program with `InputMismatchException`)

### Week 4: Improved Data Structures
- **improveDeleteArray.java** - Enhanced array deletion with error handling and try-with-resources

### Week 5: Advanced Array Operations
- **deleteArray.java** - Array deletion with exception handling
- **dynamicDeleteArray.java** - Dynamic array creation and deletion with custom exceptions
- **SumAvePro.java** - Sum, average, and product calculations with error handling (integer input only: a decimal such as `2.5` shows "Wrong Input")

### Week 6: Regular Expressions
- **regexMatcher.java** - Pattern matching using Java regex
- **regexPattern.java** - Regex pattern examples and demonstrations
- **simpleReplaceRegex.java** - String replacement using regular expressions

### Week 7: Object-Oriented Programming
- **comOOP.java** - Demonstrates composition pattern
- **inhOOP.java** - Inheritance example
- **oopSumAveProdSub.java** - OOP with class design and static methods
- **polyOOP.java** - Polymorphism with method overriding
- **swingSumAveProd.java** - GUI application with Swing

### Week 9: GUI Development
- **swingDormInfo.java** - Registration form with form validation

### Week 10: Threading and Advanced GUI
- **dormInfo.java** - NetBeans-generated form application
- **fibSeqThread.java** - Fibonacci sequence calculation with threading and pause/resume (Reset starts a second thread without stopping the first, so both advance the same sequence: `fibSeqThread.java:87`)
- **guiOldProgram.java** - Menu-driven GUI application
- **NewJFrame.java** - Circle area calculation GUI (uses π = 3.14, so radius 2 gives 12.56, not 12.566: `NewJFrame.java:156`)
- **swingThread.java** - Threading with Swing event dispatch (overlapping submits can finish out of order, so an older result can replace a newer one: `swingThread.java:43-44`)

### Week 11: Professional GUI Applications
- **swingCV.java** - Curriculum Vitae form with threading
- **swingCV2.java** - Professional CV form with NetBeans design

### Practice Programs
Collection of utility programs demonstrating various Java concepts:
- **assortedPrograms.java** - Multi-functional menu application
- **complexReplaceRegex.java** - Advanced regex pattern replacement utilities (helper class without a `main` method; `java complexReplaceRegex` fails)
- **createFile.java** - File creation operations
- **deleteFile.java** - File deletion operations
- **findGCD.java** - Greatest common divisor using recursion (a negative input can give a negative result: gcd(4, -6) = -2)
- **readFile.java** - Reading file contents
- **towerHanoi.java** - Tower of Hanoi recursive solution
- **writeFile.java** - Writing to files
- **userInfo.java** - GUI registration form
- **regExample.java** - Interactive regex tool
- **fileReaderFrame.java** - File reader with GUI display
- **infoFile.java** - File information display
- **storeUserInfo.java** - Data collection form with file persistence (shows "Successfully Saved" even when the write fails: `storeUserInfo.java:73`)

## Technologies

- **Java Version:** Java 21 (OpenJDK)
- **Build System:** javac (Java Compiler)
- **GUI Framework:** Swing
- **Development Styles:**
  - Console-based applications
  - GUI applications with event handling
  - Multi-threaded applications
  - Form-based applications (NetBeans generated)

## Prerequisites

- Java Development Kit (JDK) 21 or higher installed
- Windows, macOS or Linux terminal (the commands below use a POSIX shell such as Git Bash)
- Text editor or IDE (VS Code, NetBeans, IntelliJ IDEA recommended)
- Basic command-line knowledge

## Getting Started

### Installation

1. Clone or download the repository
2. Ensure Java 21 is installed and available in your PATH

```bash
java -version
```

3. Navigate to the workspace directory

```bash
cd CCPRGG2L
```

## Project Organization

```
CCPRGG2L/
├── README.md
├── Week 3/           # Basic programming concepts
├── Week 4/           # Improved data structures
├── Week 5/           # Advanced array operations
├── Week 6/           # Regular expressions
├── Week 7/           # Object-oriented programming
├── Week 9/           # GUI development
├── Week 10/          # Threading and advanced GUI
├── Week 11/          # Professional GUI applications
└── Practice Programs/ # Utility programs and examples
```

## How to Run

### Compile and Run Console Application

```bash
cd "Week 3"
javac distCoordinates.java
java distCoordinates
```

### Compile and Run GUI Application

```bash
cd "Week 10"
javac swingThread.java
java -cp . swingThread
```

### Compile All Programs in a Folder

```bash
javac Week\ 10/*.java
```

### Clean Compiled Files

```bash
find . -name "*.class" -type f -delete
```

## Course Progression

This course demonstrates a clear learning progression:

1. **Foundations (Week 3-5):** Basic data structures, array manipulation, exception handling
2. **Core OOP (Week 6-7):** Regular expressions, inheritance, composition, polymorphism
3. **GUI Development (Week 9-11):** Swing framework, event handling, form design
4. **Advanced Topics (Week 10-11):** Multi-threading and GUI updates from threads (not all thread-safe: see fibSeqThread and swingThread above)

Each week builds upon previous concepts, demonstrating increased complexity and professional code practices.

## Key Learning Outcomes

- Strong foundation in Java fundamentals
- Object-oriented programming principles and patterns
- GUI development with Swing framework
- Multi-threaded application development
- Exception handling and custom exceptions (some GUI inputs still throw an uncaught `NumberFormatException`; see Known issues)
- File I/O operations
- Regular expression pattern matching

## Review notes (2026-10-14)

The code is kept as submitted. These notes list known issues; nothing below is fixed in the code.
Issues already stated in the program descriptions above are not repeated here.

### Known issues

**High**

| # | File:line | What happens | Expected |
|---|---|---|---|
| 1 | `Practice Programs/assortedPrograms.java:62` | Division by 0 throws an uncaught `ArithmeticException`; the menu loop stops | Error message; the menu continues |
| 2 | `Week 10/guiOldProgram.java:149` | Arithmetic menu "5. Back to Main Program" closes the whole app (`System.exit`) | Return to the main window |
| 3 | `Week 7/swingSumAveProd.java:10-14`, `Week 10/guiOldProgram.java:112, 231-234` | Cancel or text input throws an uncaught `NumberFormatException` (the catch at 231-234 catches `InputMismatchException`) | Error message; ask again |
| 4 | `Week 10/guiOldProgram.java:151, 175-177, 187-189`, `Week 10/fibSeqThread.java:45-49, 88-92`, `Week 10/swingThread.java:61` | Cancel, a decimal or a negative input closes the whole app | Error message; the window stays open |

**Medium**

| # | File:line | What happens | Expected |
|---|---|---|---|
| 7 | `Week 7/swingSumAveProd.java:18`, `Practice Programs/assortedPrograms.java:91, 97`, `Week 10/fibSeqThread.java` | `int` overflow: product 2000³ = -589934592; 25% discount on 100,000,000 = 117949672; Fibonacci after F(46) is negative | Use `long` |
| 8 | `Week 3/leapYear.java:9`, `Week 3/normalDeleteArray.java:17` | Text input stops the program with `InputMismatchException` | Error message; ask again |
| 9 | `Practice Programs/fileReaderFrame.java:18, 86` | Without `words.txt`, `readFile` returns null and `clone()` throws `NullPointerException` | "File not found" message |
| 10 | `Practice Programs/towerHanoi.java:5` | 0 or a negative disk count gives `StackOverflowError` | Reject n < 1 |
| 11 | `Practice Programs/regExample.java:18, 22` | Pattern `(` throws `PatternSyntaxException`; replacement `$5` throws `IndexOutOfBoundsException` | Error message; `Matcher.quoteReplacement` |
| 13 | `Week 10/guiOldProgram.java:147`, `Practice Programs/assortedPrograms.java:62` | Integer division: 7 / 2 = 3 | 3.5 |
| 14 | `Week 10/fibSeqThread.java:132-133` | The first input number is never shown: start 0, 1 shows 1, 1, 2 | 0, 1, 1, 2 |
| 15 | `Week 10/dormInfo.java:318` | An empty form is saved | Required-field check |
| 16 | `Week 10/dormInfo.java:320` | The password is saved in plain text in `userInfo.txt` | Do not store it |

**Low**

| # | File:line | What happens | Expected |
|---|---|---|---|
| 19 | `Week 11/swingCV2.java:351-361` | Clear sets the combo boxes to null; the next Submit prints "null" | Reset to the first item |
| 20 | `Week 11/swingCV2.java:372` | "Years Spent: 2010 to 2004" is accepted | Error when "to" < "from" |
| 21 | `Practice Programs/userInfo.java:97, 103` | Date 31 Feb is accepted | Date check |
| 22 | `Practice Programs/userInfo.java:197-204` | Reset leaves no gender selected | "Male" selected, as at start |
| 23 | `Practice Programs/assortedPrograms.java:108-112` | Cancel on the name shows "name is null" | Ask again |
| 24 | `Practice Programs/assortedPrograms.java:16` | "Student Grading" only shows name and age; no grade | Show a grade |
| 25 | `Week 10/guiOldProgram.java:128`, `Practice Programs/assortedPrograms.java` (arithmetic sub-menu) | Menu choice 9 does nothing | "Invalid choice" message |
| 26 | `Week 10/guiOldProgram.java:228, 230` | The array and "Array is empty" show as error dialogs | Information dialogs |
| 27 | `Week 4/improveDeleteArray.java:36-44` | "Updated List" prints once per removed duplicate | Print once |
| 28 | `Week 5/dynamicDeleteArray.java:23-24` | An answer other than Y/N ends the program | Ask again |
| 29 | `Week 5/dynamicDeleteArray.java:40` | Message says "No score Found!" | "No element found!" |
| 31 | `Week 11/swingCV.java:72-92` | No input check: email `notanemail` and years `abc` are accepted | Validation message |

### Not tested

- Visual layout and look-and-feel (for example the overlapping text areas in `userInfo.java:165`).
- Thread races other than the two above (fibSeqThread Reset, swingThread overlapping submits).
- Week 6 regex programs take no input; only their fixed output was checked (all pass).

### Simplification ideas

1. The delete-array loop is copied in 4 files; `list.removeIf(v -> v == element)` replaces it.
2. `assortedPrograms.java:59-100`: pick a discount rate in the `if` chain, then compute and show once.
3. `complexReplaceRegex.java:45-60`: `Matcher.replaceAll(m -> m.group().toLowerCase())` (Java 9+) replaces the hand-written loop.
4. The empty `Negative` / `YesOrNo` exception classes are declared in 4 files; one shared class or `IllegalArgumentException` is enough.
5. `Math.hypot(dx, dy)` replaces `Math.sqrt(dx*dx + dy*dy)` in `distCoordinates.java` and `guiOldProgram.java`.

### Tested

- All 9 folders compile with 0 errors on JDK 21.0.12.
- 131 scripted runs (console input piped in; GUI dialogs answered by a test driver); 47 of them showed a real defect (31 distinct issues).

## Contributing

This is a course repository for learning purposes. Suggestions for improvements are welcome through pull requests or issues.

## License

No license file is included. The program headers contain only the NetBeans template placeholder, not a license.

## Credits

README template based on the Awesome README collection by [Matias Singers](https://github.com/matiassingers/awesome-readme).

Course work for CCPRGG2L - Intermediate Programming
