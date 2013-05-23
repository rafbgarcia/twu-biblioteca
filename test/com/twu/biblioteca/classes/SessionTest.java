package com.twu.biblioteca.classes;

import com.twu.biblioteca.models.User;
import junit.framework.Assert;
import org.junit.Test;

public class SessionTest {

    @Test
    public void registerAUser() {
        User u = new User("t", "t", "123456", "t");
        Session.register(u);
        Assert.assertTrue(Session.get(u) instanceof User);
    }



}
