# Java Learnings Project

## Table of Contents
1. [Introduction to Java](#introduction-to-java)
2. [JRE, JDK, and JVM Explained](#jre-jdk-and-jvm-explained)
3. [How a Java Program Works](#how-a-java-program-works)
4. [The Use of IDEs](#the-use-of-ides)
5. [Java Hello World Program Explained](#java-hello-world-program-explained)
6. [The Use of the `main` Method](#the-use-of-the-main-method)
7. [Data Types and Variables Explained](#data-types-and-variables-explained)
8. [Classes and Objects Methodology](#classes-and-objects-methodology)
9. [Methods and Their Structure](#methods-and-their-structure)
10. [Assignments](#assignments)

## Introduction to Java
Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is widely used for building enterprise-scale applications, mobile applications, and for building robust, secure, and scalable systems.

## JRE, JDK, and JVM Explained
- **JRE (Java Runtime Environment):** It provides the libraries, Java Virtual Machine (JVM), and other components to run applications written in Java. It does not contain any development tools like compilers or debuggers.
- **JDK (Java Development Kit):** It is a full-featured software development kit required to develop Java applications and applets. It includes the JRE, an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools needed for Java development.
- **JVM (Java Virtual Machine):** It is an abstract machine that enables your computer to run a Java program. When you run a Java program, the JVM is responsible for converting the bytecode into machine-specific code and executing it.

## How a Java Program Works
1. **Write Code:** Write your Java code in a `.java` file.
2. **Compile Code:** Use the `javac` compiler to compile your `.java` file into bytecode, which is stored in a `.class` file.
3. **Run Code:** The JVM takes the `.class` file and executes it on the machine.

## The Use of IDEs
An Integrated Development Environment (IDE) is a software application that provides comprehensive facilities to computer programmers for software development. It typically includes:

- **Code Editor:** Helps you write code with syntax highlighting and auto-completion.
- **Compiler/Interpreter:** Compiles or interprets your code.
- **Debugger:** Helps you debug your code.
- **Build Automation Tools:** Automates tasks like building and testing your code.

Popular Java IDEs include IntelliJ IDEA, Eclipse, and NetBeans.

## Java Hello World Program Explained
```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```
This simple program prints "Hello, World!" to the console. It consists of a class `HelloWorld` with a `main` method.

## The Use of the `main` Method
The `main` method is the entry point of any Java program. It is a special method that is called by the Java Virtual Machine (JVM) to start the execution of the program. Without the `main` method, the JVM does not know where to start the execution of the program.

## Data Types and Variables Explained
- **Data Types:** Java provides various data types to store different types of data. The basic data types are:
  - `int`: Integer values
  - `float`: Floating point numbers
  - `double`: Double precision floating point numbers
  - `char`: Single character
  - `boolean`: True or false
  - `byte`, `short`, `long`: Other integer types with different ranges
- **Variables:** Variables are containers for storing data values. Each variable in Java must be declared with a data type.

## Classes and Objects Methodology
- **Class:** A class is a blueprint for creating objects. It contains fields (variables) and methods (functions) to define the behavior of the objects.
- **Object:** An object is an instance of a class. It is created using the `new` keyword.

Example:
```java
class Car {
    String brand;
    void start() {
        System.out.println("Car is starting...");
    }
}
```

## Methods and Their Structure
- **Method:** A method is a block of code that performs a specific task. It is defined within a class and can be called to execute the code within it.
- **Structure of Methods:**
```java
returnType methodName(parameters) {
    // method body
}
```
- **Example:**
```java
public int add(int a, int b) {
    return a + b;
}
```
- **Use of Methods:** Methods help in code reusability, modularity, and organization.

## Assignments

### Assignment 1: Calculate Total and Average of 5 Subjects
**Program Structure:**
1. Create a class (`Calculation`).
2. Create a `main` method.
3. Declare and initialize variables.
4. Calculate total and average.
5. Print total and average along with the student name and roll number.

**Sample Code:**
```java
public class Calculation {
    public static void main(String[] args) {
        String studentName = "John Doe";
        int rollNo = 123;
        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
        int subject4 = 88;
        int subject5 = 92;

        int total = subject1 + subject2 + subject3 + subject4 + subject5;
        double average = total / 5.0;

        System.out.println("Student Name: " + studentName);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
```

### Assignment 2: Calculate Total and Average Using Methods and Objects
**Program Structure:**
1. Create a class (`Calculation`).
2. Create a `main` method.
3. Declare and initialize variables.
4. Create a method to calculate total.
5. Create a method to calculate average.
6. Create a `main` method.
7. Create an object and call methods.

**Sample Code:**
```java
public class Calculation {
    String studentName;
    int rollNo;
    int subject1, subject2, subject3, subject4, subject5;

    public Calculation(String name, int roll, int s1, int s2, int s3, int s4, int s5) {
        studentName = name;
        rollNo = roll;
        subject1 = s1;
        subject2 = s2;
        subject3 = s3;
        subject4 = s4;
        subject5 = s5;
    }

    public int calculateTotal() {
        return subject1 + subject2 + subject3 + subject4 + subject5;
    }

    public double calculateAverage(int total) {
        return total / 5.0;
    }

    public static void main(String[] args) {
        Calculation student = new Calculation("John Doe", 123, 85, 90, 78, 88, 92);
        int total = student.calculateTotal();
        double average = student.calculateAverage(total);

        System.out.println("Student Name: " + student.studentName);
        System.out.println("Roll No: " + student.rollNo);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}
```
**Problem Statement: 19-01-2025(saturday)**

**Objective:**

Write a Java program to create a `BankAccount` class that allows users to initialize account details using constructors. This should include an option for default balance initialization. The program should also provide methods to display account details.

**Step-by-Step Approach:**

1. **Define the Class:**
  - Create a class named `BankAccount` to represent the bank account details.

2. **Define Instance Variables:**
  - Declare private variables:
    - `String accountHolderName` to store the name of the account holder.
    - `int accountNumber` to store the account number.
    - `double balance` to store the account balance.

3. **Create Constructors:**
  - Define two constructors:
    - **Full Constructor:** Accepts all account details (`accountHolderName`, `accountNumber`, `balance`) and initializes them.
    - **Default Balance Constructor:** Accepts `accountHolderName` and `accountNumber`, and initializes the `balance` to 0.0. Use `this()` to call the full constructor internally.

4. **Add a Display Method:**
  - Define a method `displayDetails()` to display:
    - Account holder name
    - Account number
    - Account balance

5. **Create the Main Class:**
  - Define the `Main` class with the `main` method.
  - Create a `BankAccount` object using the constructor that initializes the account with a default balance.
  - Call the `displayDetails()` method to print the account information.

**Pseudocode:**

Class BankAccount:

Private members:

- String accountHolderName
- int accountNumber
- double balance

Constructor(String name, int number, double initialBalance):
- Set accountHolderName to name
- Set accountNumber to number
- Set balance to initialBalance

Constructor(String name, int number):
- Call Constructor(name, number, 0.0) using 'this' keyword

Method displayDetails():
- Print accountHolderName
- Print accountNumber
- Print balance

Class Main:
In main method:
- Create a BankAccount object using the constructor with default balance (balance = 0.0)
- Call the displayDetails() method of the created object