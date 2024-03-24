package org.example;

public class ForeignArtisticBook extends Books {
    public String name;
    public String author;

    public ForeignArtisticBook(String name, String author) {
        this.name=name;
        this.author=author;
    }

    public String getName() {
        return "Иностранная художественная"+" "+name+" "+author;
    }

}