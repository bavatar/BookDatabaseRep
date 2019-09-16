package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Create a class that contains a method that takes one parameter, the SKU, and returns a corresponding book object.
    // Use If Statements to populate the instance variables of the Book class and return the populated Book class.
    public static void main(String[] args) {
        //Book book = new Book();
        List<Book> books = new ArrayList<>();
        boolean testBool = false;

        Book book = new Book("Java1001", "Head First Java", "Kathy Sierra and Bert Bates","Easy to read Java Workbook", 47.50, true);
        if (testBool){
            book.setInStock(false);
        }
        books.add(book);
        System.out.println("SKU: " + book.getSku() + " Title: " + book.getTitle());
    }
}
