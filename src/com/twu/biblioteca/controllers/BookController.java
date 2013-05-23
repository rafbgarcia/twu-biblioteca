package com.twu.biblioteca.controllers;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.views.BookView;

import java.util.Scanner;

public class BookController {

    public static void reserveBook() {
        BookView.showBooksWithIndexes();
        System.out.println("- Please, choose the number of the book you want to reserve");

        Scanner sc = new Scanner(System.in);
        int bookIndex = sc.nextInt();
        sc.nextLine();

        try {
            if (isBookReserved(bookIndex)) {
                System.out.println("- Sorry we don't have that book yet.\n");
            } else {
                System.out.println("- Thank You! Enjoy the book.\n");
                reserve(bookIndex);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Book " + bookIndex + " does not exists");
        }

    }

    public static void reserve(int bookIndex) {
        Persistence.getBookAt(bookIndex).setReserved(true);
    }

    public static boolean isBookReserved(int bookIndex) {
        return Persistence.getBookAt(bookIndex).isReserved();
    }

}
