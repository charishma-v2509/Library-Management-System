class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean isAvailable = true;
    public Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public String getTitle() {
        return title;
    }
    public int getIsbn() {
        return isbn;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
    public void showBookDetails() {
        System.out.println("📘 Book Name   : " + title);
        System.out.println("✍️  Author      : " + author);
        System.out.println("🔢 ISBN        : " + isbn);
        System.out.println("📖 Availability : " + (isAvailable ? "Available" : "Not Available"));
    }
}
