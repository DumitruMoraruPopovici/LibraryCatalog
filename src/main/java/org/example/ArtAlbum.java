package org.example;

/**
 * Blueprint for Art Albums wich extends Book class with quality of paper
 */
public class ArtAlbum extends Book {
    public String paperQuality;

    /**
     * Constructor for ArtAlbums with name, number of pages and quality paper and the return should be an ArtAlbum
     */

    public ArtAlbum(String name, int numOfPages, String paperQuality) {
        this.name = name;
        this.numOfPages = numOfPages;
        this.paperQuality = paperQuality;
        System.out.println(name + " has " + numOfPages + " pages and is a " + paperQuality + " Book");
    }
}
