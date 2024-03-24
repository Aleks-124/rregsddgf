package org.example;

public class ForeignScintificBook extends Books {
    public String nameDiscipline;
    public Boolean isMagistr;
    public String author;
    public String university;
    public String title;
    public ForeignScintificBook(String title,Boolean isMagistr ,String nameDiscipline, String university, String author) {
        this.nameDiscipline= nameDiscipline;
        this.isMagistr=isMagistr;
        this.title=title;
        this.author=author;
        this.university=university;
    }
    public String getName() {
        return "Иностранная Научная"+" "+nameDiscipline+" "+author+" "+university;
    }

}
