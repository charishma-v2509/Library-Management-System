public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        Admin admin = new Admin("Librarian", 101);
        Student student = new Student("Alice", 201, 0);
        Teacher teacher = new Teacher("Mr. Bob", 301, 0);

        admin.addBook(books, new Book("Java Basics", "James Gosling", 101));
        admin.addBook(books, new Book("OOP Principles", "Grady Booch", 102));
        admin.addBook(books, new Book("Data Structures", "Robert Lafore", 103));
        admin.addBook(books, new Book("Algorithms", "Cormen", 104));

        System.out.println("LIBRARY MANAGEMENT SYSTEM");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. View All Books");
            System.out.println("2. Borrow Book (Student)");
            System.out.println("3. Borrow Book (Teacher)");
            System.out.println("4. Return Book (Student)");
            System.out.println("5. Return Book (Teacher)");
            System.out.println("6. Add Book (Admin)");
            System.out.println("7. Remove Book (Admin)");
            System.out.println("8. View User Details");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (Book b : books) b.showBookDetails();
                    break;

                case 2:
                    System.out.print("Enter ISBN to borrow: ");
                    int sIsbn = sc.nextInt();
                    Book sBook = findBookByIsbn(books, sIsbn);
                    if (sBook != null) student.borrowBook(sBook);
                    else System.out.println("Book not found!");
                    break;

                case 3:
                    System.out.print("Enter ISBN to borrow: ");
                    int tIsbn = sc.nextInt();
                    Book tBook = findBookByIsbn(books, tIsbn);
                    if (tBook != null) teacher.borrowBook(tBook);
                    else System.out.println("Book not found!");
                    break;

                case 4:
                    System.out.print("Enter ISBN to return: ");
                    int sReturn = sc.nextInt();
                    Book sRBook = findBookByIsbn(books, sReturn);
                    if (sRBook != null) student.returnBook(sRBook);
                    else System.out.println("Book not found!");
                    break;

                case 5:
                    System.out.print("Enter ISBN to return: ");
                    int tReturn = sc.nextInt();
                    Book tRBook = findBookByIsbn(books, tReturn);
                    if (tRBook != null) teacher.returnBook(tRBook);
                    else System.out.println("Book not found!");
                    break;

                case 6:
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    int isbn = sc.nextInt();
                    admin.addBook(books, new Book(title, author, isbn));
                    break;

                case 7:
                    System.out.print("Enter ISBN to remove: ");
                    int rem = sc.nextInt();
                    admin.removeBook(books, rem);
                    break;

                case 8:
                    System.out.println("\n--- Student Details ---");
                    student.showUserDetails();
                    System.out.println("\n--- Teacher Details ---");
                    teacher.showUserDetails();
                    break;

                case 9:
                    System.out.println("Exiting Library Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    private static Book findBookByIsbn(List<Book> books, int isbn) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) return b;
        }
        return null;
    }
}
