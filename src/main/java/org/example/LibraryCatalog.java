package org.example;

import java.util.ArrayList;

/**
 * This is our library with the list of books, here we can add, delete or list the books from our library
 */
public class LibraryCatalog {
    public static ArrayList<Book> books = new ArrayList<>();

    /**
     * Add book method to our library
     */

    public static void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("We already have this book");
            return;

        }
        books.add(book);

    }

    /**
     * Delete book method to our library
     */

    public static void deleteBook(Book book) {
        books.remove(book);
    }

    /**
     * List book method from our Library
     */
    public static void listBook() {
        for (Book book : books) {
            System.out.println(book);
        }
    }


}
