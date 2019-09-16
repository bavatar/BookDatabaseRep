package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Book {
    private String sku = "";
    private String title = "";
    private String author = "";
    private String description = "";
    private double price = 0.0;
    private boolean isInStock = false;

    public Book() {
    }

    public Book(String sku, String title, String author, String description, double price, boolean isInStock) {
        this.sku = sku;
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }

    @Override
    public String toString (){
        return "Author: " + author + " Title: "  + title + "\n" + "Description: " + description;
    }


    public void print (){
        //String a = toString();
        System.out.println(this);

    }

    public static double getPriceOfBooks1(ArrayList<String> bookList, ArrayList<Book> bArrayList){
        //ArrayList<Double> outArray = new ArrayList<>();
        double price = 0;
        double totalPrice = 0;
        int randomInStock = 0;
        Random rnd = new Random();
        boolean isInStock = false;

        for (Book b:bArrayList){
            if (bookList.contains(b.getTitle())){
                randomInStock = rnd.nextInt(100);
                if (b.isInStock) {
                    price = b.getPrice();
                    totalPrice += price;
                }
            }
        }
        return totalPrice;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
//    public void getDisplayText(){}    {
//        String auth = author;
//        String titl = title;
//        String descr = getDescription();
//        System.out.println("Author: " + author + "  Title: " + titl + "\n" + "Description: " + descr);
//    }
}