package org.example;

/**
 * Blueprint for novel wich extends Book class with type(sci-fi, mystery, etc)
 */
public class Novel extends Book {

    public String type;

    /**
     * constructor for novel provided by us
     */

    public Novel(String name, int numOfPages, String type) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.type = type;
        System.out.println(name + " has " + numOfPages + " pages and is a " + type + " Book");
    }
}
