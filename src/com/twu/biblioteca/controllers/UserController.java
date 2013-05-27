package com.twu.biblioteca.controllers;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.classes.Session;
import com.twu.biblioteca.models.User;

import java.util.Scanner;

public class UserController {

    public static boolean autenticate(String login, String password) {
        User u = Persistence.getUser(login);

        if(u instanceof User) {
            if(u.getPassword().equals(password)) {
                Session.register(u);
                return true;
            }
        }
        return false;
    }

    public static void login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert your login: ");
        String login = sc.nextLine();

        System.out.print("Insert your password: ");
        String password = sc.nextLine();

        if(UserController.autenticate(login, password))
            System.out.println("- Login successful");
        else
            System.out.println("- Incorrect login or password");
    }

    public static void logout() {
        Session.logout();
        System.out.println("Bye!");
    }
}
