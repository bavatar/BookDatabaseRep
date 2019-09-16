package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object.
    // Use If Statements to populate the instance variables of the Book class and return the populated Book class.

    // Create a constructor  in the BookDB  class that takes an SKU and populates the private member variables.
    // The constructor by default will return the appropriate BookDB object when it is called.
    // You do not need to include a return statement.
    //
    // Next, create a method in your Book class called getDisplayText().
    // It takes no parameters.
    // When called it returns a string containing the author, title and description.
    // Do not use System.out.print() in your class.
    // Simply return the string and let the calling class handle the print statements.
    // You can use this method to print your book information to the console or a file or a web page.

    public static void main(String[] args) {
        Book book = new Book();
        List<Book> books = new ArrayList<>();
        boolean testBool = false;

        book = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates","Easy to read Java Workbook", 47.50, true);
        if (testBool){
            book.setInStock(false);
        }
        books.add(book);
        System.out.println("SKU: " + book.getSku() + " Title: " + book.getTitle());

        String displayStr = book.getDisplayText();   //string containing the author, title and description
        System.out.println("Using Book.getDisplayText The Displayed Info: " + displayStr);

        //BookDatabase bookDB = new BookDatabase("Orc11003");

        BookDatabase bookDB = new BookDatabase();
        books = bookDB.getBooks();

        for (Book b: books){
            System.out.print("Title: " + b.getTitle() + "   SKU: " + b.getSku() + "  ");
            System.out.println("Price: " + b.getPrice() + " In Stock? " + b.isInStock());
        }

        book = bookDB.getBook("Orc1100");
        if (book != null) {
            System.out.println("SKU: " + book.getSku());
        }else{
            System.out.println("Book with SKU: Orc11003" + " was not found in the Book Database.");
        }

    }
}
