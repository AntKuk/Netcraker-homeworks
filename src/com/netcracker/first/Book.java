package com.netcracker.first;

import com.netcracker.first.Author;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        String subStr = Arrays.toString(authors);
        subStr = subStr.substring(1, subStr.length()-1); //Authors info string without outer brackets []
        String bookStr = new String("Book[name=" + name + ",authors={" + subStr + "},price=" + price + ",qty=" + qty);
        return bookStr;
    }

    public String getAuthorNames() {
        String str = new String();

        for(int i = 0; i <= authors.length-1; i++) {
            if (i<authors.length-1) {
                str += authors[i].getName() + ",";
                continue;
            }
            str += authors[i].getName();
        }
        return str;
    }

    @Override

    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof Book)) {
            return false;
        }

        Book book = (Book) obj;

        boolean result = book.name.equals(this.name) & Arrays.equals(book.authors, this.authors) & book.price == this.price & book.qty == this.qty;
        return result;
    }

    @Override
    public int hashCode() {
        int result = 17;
        long longPrice = Double.doubleToLongBits(price);

        result = 31 * result + name.hashCode();

        for(Author a : authors) {
            result = 31 * result + a.hashCode();
        }

        result = 31 * result + (int)(longPrice ^ (longPrice >>> 32));
        result = 31 * result + qty;

        return result;
    }

}
