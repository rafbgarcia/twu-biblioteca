package com.twu.biblioteca.classes;

import com.twu.biblioteca.controllers.BookController;
import com.twu.biblioteca.controllers.MovieController;
import com.twu.biblioteca.controllers.UserController;

public class Menu {

    public static String getOptions() {
        StringBuilder sb = new StringBuilder();
        sb.append("Please, choose one of the options below:\n");
        sb.append("1 - List of books\n");
        sb.append("2 - List of movies\n");

        if(Session.hasUserLoggedIn()) {
            sb.append("3 - Reserve a book\n");
            sb.append("4 - Membership details\n");
            sb.append("5 - Logout\n");
        } else {
            sb.append("5 - Login\n");
        }

        sb.append("9 - Quit\n");

        return sb.toString();
    }

    public static String handleOption(int option) {
        switch (option) {
            case 1:
                BookController.showBooks();
                break;
            case 2:
                MovieController.showMovies();
                break;
            case 3:
                if(Session.hasUserLoggedIn())
                    BookController.reserveBook();
                break;
            case 4:
                if(Session.hasUserLoggedIn())
                    System.out.println("- Please talk to a Librarian. Thank you. \n");
                break;
            case 5:
                if(Session.hasUserLoggedIn())
                    UserController.logout();
                else
                    UserController.login();
                break;
            case 9:
                System.exit(0);
                break;
            default:
                return getInvalidOptionMessage();
        }
        return null;
    }

    public static boolean isValidOption(int option) {
        return (option > 0 && option < 6) || option == 9;
    }

    public static String getInvalidOptionMessage() {
        return "Select a valid option!!";
    }

    public static boolean isQuitOption(int option) {
        return option == 9;
    }
}
