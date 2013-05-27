package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.Book;
import com.twu.biblioteca.models.Movie;
import com.twu.biblioteca.models.User;

import java.util.ArrayList;

public class Persistence {
    private static ArrayList<Book> books = new ArrayList<Book>();
    private static ArrayList<Movie> movies = new ArrayList<Movie>();
    private static ArrayList<User> users = new ArrayList<User>();

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void addBook(Book book) {
        Persistence.books.add(book);
    }

    public static Book getBookAt(int index) throws IndexOutOfBoundsException {
        return Persistence.getBooks().get(index);
    }

    public static ArrayList<Movie> getMovies() {
        return movies;
    }

    public static void addMovie(Movie movie) {
        movies.add(movie);
    }

    public static void addUser(User user) {
        users.add(user);
    }

    public static User getUser(String login) {
        for(User u : users)
            if(u.getLogin().equals(login))
                return u;

        return null;
    }

    public static void clearMovies() {
        movies.clear();
    }
}
