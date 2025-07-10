


# Student Information System (SIS) - CLI

![Java](https://img.shields.io/badge/Java-21%2B-blue)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

A command-line Java application for managing student records, course registration, and academic information. 

This Project was part of the Data Structures course in the sophomore year of the B.Sc
in Software Engineering Study.

## Features
- **Student Management**
  - Add/edit/delete student profiles (ID, name, gender, email)
  - Input validation for all fields
- **Course Registration**
  - Register/drop courses with section numbers
  - Pre-defined course catalog with credits
- **Data Viewing**
  - Print detailed student information
  - View all registered students in table format
- **Interactive Menu System**
  - Intuitive CLI interface with numbered options
  - Context-sensitive navigation (0 always returns home)

## Example Courses
| Code       | Course Name                     | Credits |
|------------|---------------------------------|---------|
| ITCS214    | Data Structures                 | 3       |
| ENGL219    | Technical Report Writing        | 3       |
| STAT273    | Probability and Statistics      | 3       |
| ITSE201    | Intro. to Software Engineering  | 3       |
| PHYCS102   | General Physics II              | 4       |
| MATHS102   | Calculus II                     | 3       |

## How to Run
1. Compile the project:
   ```bash
   javac Registration.java
   ```
2. Execute the program:
   ```bash
   java Registration
   ```
3. Follow the menu prompts to manage student records.

## Sample Workflow
```text
Welcome to the student registration system home:
(1) Add new student.
(2) Edit existing student.
(3) Print student's details.
(4) View all students.

> 1
Enter student's ID number: 2023001
Enter student's information: (Gender M/F) (Firstname) (Lastname) (Email)
M John Doe john.doe@uni.edu

Student added. Choose next action:
(1) Add courses
(0) Home
```

## Technology Stack
- Core Java (JDK 17+)
- OOP principles (Encapsulation, Composition)
- Java Collections Framework
- Input validation and error handling

## Project Structure
```
SIS/
├── Registration.java       # Main driver class
├── Student.java            # Student entity model
├── Course.java             # Course entity model
└── Roster.java             # Student roster manager
```

## Contributors
- [@Sand630](https://github.com/Sand630)
- [@KnightOfGlory](https://github.com/KnightOfGlory)


This file content is mostly AI-generated.

