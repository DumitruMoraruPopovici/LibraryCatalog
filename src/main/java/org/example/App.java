package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.LibraryCatalog.books;

/**
 * the main class of our library. Here we are gonna call the methods created in the other classes like : constructors,
 * add books, delete books, list books.
 */
public class App {
    public static void main(String[] args) {
        /**
         * constructing books
         */
        Book book1 = new Book("Capra cu trei iezi", 45);
        Book book2 = new Novel("Jules Verne", 234, "Sci-fi");
        Book book3 = new ArtAlbum("Ciresarii", 345, "High");
        Book book4 = new Novel("Contele de Monte-Cristo", 543, "Adventure");
/**
 * adding books to the library
 */
        LibraryCatalog.addBook(book4.name);
        LibraryCatalog.addBook(book2.name);
        LibraryCatalog.addBook(book3.name);
        LibraryCatalog.addBook(book1.name);

        System.out.println(books);
/**
 * deleting a book from the library
 */
        LibraryCatalog.deleteBook(book1.name);

        System.out.println(books);
        /**
         * listing the books from the library
         */
        LibraryCatalog.listBook(String.valueOf(books));


    }
}
