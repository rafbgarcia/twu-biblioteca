package com.twu.biblioteca.main;

import com.twu.biblioteca.classes.Menu;
import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.models.Book;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        insertTestData();


        int option;
        Scanner sc = new Scanner(System.in);

        System.out.println(getWelcomeMessage());

        do {
            System.out.println(Menu.getOptions());

            option = sc.nextInt();
            sc.nextLine();

            if (Menu.isValidOption(option))
                Menu.handleOption(option);
            else
                System.out.println(Menu.getInvalidOptionMessage());

        } while (!Menu.isQuitOption(option));
    }

    public static String getWelcomeMessage() {
        return "Welcome!\n\n";
    }

    private static void insertTestData() {
        Persistence.addBook(new Book("Programming Languages"));
        Persistence.addBook(new Book("How to code"));
        Persistence.addBook(new Book("How to do nothing, easy steps"));
    }
}