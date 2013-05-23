package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.User;

import java.util.ArrayList;

public class Session {
    private static ArrayList<User> session = new ArrayList<User>();

    public static void register(User user) {
        session.add(user);
    }

    public static User get(User user) {
        for(User u : session) {
            if(u.getLogin().equals(user.getLogin()))
                return u;
        }
        return null;
    }

}
