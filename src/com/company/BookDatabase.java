package com.company;
import java.util.ArrayList;
import java.util.List;

public class BookDatabase {
    private Book book;
    private List<Book> books;

    //Book book = new Book();
//    ArrayList books = new ArrayList<>();
//    book = new Book()
    public BookDatabase(String SKU) {
        this();
        book = getBook(SKU);
    }

    public BookDatabase() {
        books = new ArrayList<>();
        book = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates","Easy to read Java Workbook", 47.50, true);
        books.add(book);

        book = new Book("Java1002", "Thinking in Java", "Bruce Eckel","Details about Java Under the Hood", 20.00, true);
        books.add(book);

        book = new Book("Orc11003", "OCP: Oracle Certified Pro Java SE", "Jeanne Boyarsky","Everything You Need to Know in One Place", 45.00, true);
        books.add(book);

        book = new Book("Python1004", "Automate the Boring Stuff with Python","Al Sweigart", "Fun with Python", 10.50, true);
        books.add(book);

        book = new Book("Zombie1005", "The Maker's Guide to the Zombie Apocalypse","Simon Monk", "Defend your Base with simple Circuits, Arduino, and Raspberry Pi", 16.50, false);
        books.add(book);

        book = new Book("Rasp1006", "Raspberry Pi Projects for the Evil Genius", "Donald Norris","A dozen fiendishly fun projects for the Raspberry Pi!", 14.75, true);
        books.add(book);
    }

    public Book getBook(String SKU) {
        for (Book book : books){
            if (SKU.equalsIgnoreCase(book.getSku())){
                this.book = book;
                return book;
            }
        }
        return null;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
