class Student extends User {
    private int maxBooks = 3;

    public Student(String name, int userId, int noOfBooks) {
        super(name, userId, noOfBooks);
    }

    @Override
    public void borrowBook(Book b) {
        if (noOfBooks >= maxBooks) {
            System.out.println("Limit reached! You can’t borrow more than " + maxBooks + " books.");
        } else if (!b.isAvailable()) {
            System.out.println("Sorry, this book is currently unavailable.");
        } else {
            noOfBooks++;
            System.out.println("Book borrowed successfully: " + b.getTitle());
            b.setAvailable(false);
        }
    }

    @Override
    public void showUserDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID   : " + userId);
        System.out.println("Books Taken  : " + noOfBooks);
    }
}
