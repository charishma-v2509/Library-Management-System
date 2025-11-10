abstract class User {
    protected String name;
    protected int userId;
    protected int noOfBooks = 0;

    public User(String name, int userId, int noOfBooks) {
        this.name = name;
        this.userId = userId;
        this.noOfBooks = noOfBooks;
    }

    public abstract void borrowBook(Book b);

    public void returnBook(Book b) {
        System.out.println("Book returned: " + b.getTitle());
        b.setAvailable(true);
        noOfBooks--;
    }

    public abstract void showUserDetails();
}
