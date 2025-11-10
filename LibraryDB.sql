CREATE DATABASE LibraryDB;
USE LibraryDB;

CREATE TABLE Books (
    BookID INT PRIMARY KEY AUTO_INCREMENT,
    Title VARCHAR(100),
    Author VARCHAR(100),
    ISBN INT UNIQUE,
    IsAvailable BOOLEAN DEFAULT TRUE
);

CREATE TABLE Users (
    UserID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    UserType ENUM('Student', 'Teacher'),
    NoOfBooks INT DEFAULT 0
);

CREATE TABLE BorrowRecords (
    RecordID INT PRIMARY KEY AUTO_INCREMENT,
    UserID INT,
    BookID INT,
    BorrowDate DATE,
    ReturnDate DATE,
    FOREIGN KEY (UserID) REFERENCES Users(UserID),
    FOREIGN KEY (BookID) REFERENCES Books(BookID)
);

INSERT INTO Books (Title, Author, ISBN) VALUES
('Java Basics', 'James Gosling', 101),
('OOP Principles', 'Grady Booch', 102),
('Data Structures', 'Robert Lafore', 103);

INSERT INTO Users (Name, UserType) VALUES
('Alice', 'Student'),
('Mr. Bob', 'Teacher');
