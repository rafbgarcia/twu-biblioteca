package com.twu.biblioteca.main;

import com.twu.biblioteca.classes.Menu;
import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Movie;
import com.twu.biblioteca.models.User;

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
        // Books
        Persistence.addBook(new Book("Programming Languages"));
        Persistence.addBook(new Book("How to code"));
        Persistence.addBook(new Book("How to do nothing, easy steps"));

        // Movies
        Persistence.addMovie(new Movie("Fast and Furious", "Director 1", 2005));
        Persistence.addMovie(new Movie("Fast and Furious 2", "Director 1", 2007));
        Persistence.addMovie(new Movie("Fast and Furious 3", "Director 1", 2008));
        Persistence.addMovie(new Movie("Harry Potter", "Director 2", 2005));
        Persistence.addMovie(new Movie("Harry Potter 2", "Director 2", 2008));
        Persistence.addMovie(new Movie("Harry Potter 3", "Director 2", 2010));
        Persistence.addMovie(new Movie("Harry Potter 4", "Director 2", 2011));
        Persistence.addMovie(new Movie("Ghost", "Director 3", 1990));
        Persistence.addMovie(new Movie("Ghost 2", "Director 4", 1990));
        Persistence.addMovie(new Movie("Ghost 3", "Director 4", 1990));
        Persistence.addMovie(new Movie("Avengers", "Director 5", 2012));
        Persistence.addMovie(new Movie("Spider-man", "Director 6", 2008));
        Persistence.addMovie(new Movie("Spider-man 2", "Director 6", 2010));
        Persistence.addMovie(new Movie("Spider-man 3", "Director 6", 2012));
        Persistence.addMovie(new Movie("New Spider-man", "Director 7", 2013));

        // Users
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
        Persistence.addUser(new User("Name", "email@email.com", "123456", "84 8888-8888"));
    }
}