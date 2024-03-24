package org.example;

public class RussianArtisticBook extends Books {

    public String name;
    public String author;
    public RussianArtisticBook(String name, String author){
        this.name=name;
        this.author=author;
    }
    public String getName() {
        return "Российская художественная"+" "+name+" "+author;
    }

}