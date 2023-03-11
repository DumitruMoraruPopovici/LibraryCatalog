package org.example;

/**
 * The blueprint for books with name of book, number of pages, and type of book
 */
public class Book {

    public String name;
    public int numOfPages;
    public String typeOfBook;

    /**
     * Book constructor (the basic one)
     */
    public Book() {

    }

    public Book(String name, int numOfPages) {
        this.name = name;
        this.numOfPages = numOfPages;
        System.out.println(name + " has " + numOfPages + " pages");

    }
}

