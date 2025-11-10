class Admin {
    private String name;
    private int id;

    public Admin(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void addBook(List<Book> books, Book b) {
        books.add(b);
        System.out.println("Book added: " + b.getTitle());
    }

    public void removeBook(List<Book> books, int isbn) {
        for (Book b : books) {
            if (b.getIsbn() == isbn) {
                books.remove(b);
                System.out.println("Book removed: " + b.getTitle());
                return;
            }
        }
        System.out.println("Book not found with ISBN: " + isbn);
    }
}
