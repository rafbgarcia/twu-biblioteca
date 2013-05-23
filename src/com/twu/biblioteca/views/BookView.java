package com.twu.biblioteca.views;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.models.Book;

public class BookView {

    public static void showBooks() {
        System.out.println("=== All Books ===");
        for(Book b : Persistence.getBooks()) {
            System.out.println(b.getName());
        }
        System.out.println("=== END ===\n");
    }

    public static void showBooksWithIndexes() {
        int length = Persistence.getBooks().size();

        System.out.println("=== All Books ===");
        for(int i = 0; i < length; i++) {
            System.out.println(i + " -> " + Persistence.getBooks().get(i).getName());
        }
        System.out.println("=== END ===\n");
    }

}
