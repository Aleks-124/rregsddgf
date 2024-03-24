package org.example;

public class RussianScintificBook extends Books {
    public String name;
    public String nameDiscipline;
    public String type;
    public String author;
    public RussianScintificBook(String name, String nameDiscipline, String type, String author) {
        this.nameDiscipline= nameDiscipline;
        this.type=type;
        this.name=name;
        this.author=author;
    }
    public String getName() {
        return "Российская Научная"+" "+type+" "+nameDiscipline+" "+author;
    }

}
