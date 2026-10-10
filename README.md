# Employee Management System

**Student name:** Replace with your full name  
**Student ID:** Replace with your student ID

## Description
A basic Java example demonstrating an employee model with monthly, hourly, and commission-based salary calculations, plus departments and a `Gender` enum.

## Project structure
- `src/model/Employee.java` — abstract base class
- `src/model/MonthlyEmployee.java` — fixed monthly salary
- `src/model/HourlyEmployee.java` — salary based on hours and hourly rate
- `src/model/CommissionEmployee.java` — salary based on sales and commission rate
- `src/model/Department.java` — department model
- `src/model/Gender.java` — enum values
- `src/test/MainTest.java` — demonstration program
- `Main.java` — entry point

## Run
Requires Java 11 or later.

From the project root, compile:
```bash
javac -d out Main.java src/model/*.java src/test/MainTest.java
```

Then run:
```bash
java -cp out Main
```

## Important
This is a starter implementation based on the class names in the assignment text. Compare attributes, methods, visibility, and relationships with the instructor's UML diagram and adjust them to match it exactly before submitting.
