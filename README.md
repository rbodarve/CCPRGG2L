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
- **distCoordinates.java** - Calculate distance between two points using the distance formula
- **leapYear.java** - Determine if a given year is a leap year
- **normalDeleteArray.java** - Delete elements from an ArrayList
- **threeSumAvePro.java** - Calculate sum, average, and product of three numbers

### Week 4: Improved Data Structures
- **improveDeleteArray.java** - Enhanced array deletion with error handling and try-with-resources

### Week 5: Advanced Array Operations
- **deleteArray.java** - Array deletion with exception handling
- **dynamicDeleteArray.java** - Dynamic array creation and deletion with custom exceptions
- **SumAvePro.java** - Sum, average, and product calculations with proper error handling

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
- **fibSeqThread.java** - Fibonacci sequence calculation with threading and pause/resume
- **guiOldProgram.java** - Menu-driven GUI application
- **NewJFrame.java** - Circle area calculation GUI
- **swingThread.java** - Threading with proper Swing event dispatch

### Week 11: Professional GUI Applications
- **swingCV.java** - Curriculum Vitae form with threading
- **swingCV2.java** - Professional CV form with NetBeans design

### Practice Programs
Collection of utility programs demonstrating various Java concepts:
- **assortedPrograms.java** - Multi-functional menu application
- **complexReplaceRegex.java** - Advanced regex pattern replacement utilities
- **createFile.java** - File creation operations
- **deleteFile.java** - File deletion operations
- **findGCD.java** - Greatest common divisor using recursion
- **readFile.java** - Reading file contents
- **towerHanoi.java** - Tower of Hanoi recursive solution
- **writeFile.java** - Writing to files
- **userInfo.java** - GUI registration form
- **regExample.java** - Interactive regex tool
- **fileReaderFrame.java** - File reader with GUI display
- **infoFile.java** - File information display
- **storeUserInfo.java** - Data collection form with file persistence

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
- Linux/WSL environment (or Windows/Mac with appropriate path configuration)
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
4. **Advanced Topics (Week 10-11):** Multi-threading, proper thread-safe GUI updates

Each week builds upon previous concepts, demonstrating increased complexity and professional code practices.

## Key Learning Outcomes

- Strong foundation in Java fundamentals
- Object-oriented programming principles and patterns
- GUI development with Swing framework
- Multi-threaded application development
- Proper exception handling and custom exceptions
- File I/O operations
- Regular expression pattern matching

## Contributing

This is a course repository for learning purposes. Suggestions for improvements are welcome through pull requests or issues.

## License

This project is licensed under the MIT License - see individual program headers for details.

## Credits

README template based on the Awesome README collection by [Matias Singers](https://github.com/matiassingers/awesome-readme).

Course work for CCPRGG2L - Intermediate Programming
