package org.example;

import java.util.ArrayList;

/**
 * This is our library with the list of books, here we can add, delete or list the books from our library
 */
public class LibraryCatalog {
    public static ArrayList<String> books = new ArrayList<>();

    /**
     * Add book method to our library
     */

    public static void addBook(String Book) {

        books.add(Book);

    }

    /**
     * Delete book method to our library
     */

    public static void deleteBook(String Book) {
        books.remove(Book);
    }

    /**
     * List book method from our Library
     *
     * @param Book
     */
    public static void listBook(String Book) {
        for (String book : books) {
            System.out.println(book);
        }
    }


}
