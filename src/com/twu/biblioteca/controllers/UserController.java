package com.twu.biblioteca.controllers;

import com.twu.biblioteca.classes.Persistence;
import com.twu.biblioteca.classes.Session;
import com.twu.biblioteca.models.User;

public class UserController {

    public static boolean autenticate(User user) {
        User u = Persistence.getUser(user.getLogin());

        if(u instanceof User) {
            if(u.getPassword().equals(user.getPassword())) {
                Session.register(u);
                return true;
            }
        }
        return false;
    }
}
