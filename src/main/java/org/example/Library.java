package org.example;

import java.util.ArrayList;

public class Library {
    ArrayList<Books> books = new ArrayList<>();
    public Library() {
        ScintificBookFabric scintificBookFabric = new ScintificBookFabric();
        ArtisticBookFabric artisticBookFabric = new ArtisticBookFabric();
        for(int i = 0; i < 200; i++) {
            books.add(scintificBookFabric.createForeignBook());
            books.add(scintificBookFabric.createRussianBook());
            books.add(artisticBookFabric.createForeignBook());
            books.add(artisticBookFabric.createRussianBook());
        }
    }
    public ArrayList getBooks() {
        return books;
    }

}
