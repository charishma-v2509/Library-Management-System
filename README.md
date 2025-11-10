# Library-Management-System
A simple **console-based Java application** demonstrating key Object-Oriented Programming (OOP) concepts like **Encapsulation, Inheritance, Abstraction, and Polymorphism**.

##Features
- Add, Remove, and View Books (Admin)
- Borrow and Return Books (Student/Teacher)
- Book Availability Tracking
- Menu-driven Interface using Scanner
- Uses `ArrayList` for dynamic storage

##Concepts Used
- **Abstraction** – Abstract `User` class with `borrowBook()` method
- **Inheritance** – `Student` and `Teacher` extend `User`
- **Encapsulation** – Private attributes with getters/setters
- **Polymorphism** – Overridden `borrowBook()` for different user types

## How to Run
1. Clone or download the repository  
2. Open terminal in project directory  
3. Compile and run:
   ```bash
   javac LibraryManagementSystem.java
   java LibraryManagementSystem
