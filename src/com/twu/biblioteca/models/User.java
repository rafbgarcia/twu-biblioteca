package com.twu.biblioteca.models;

public class User {
    private String name;
    private String email;
    private String login;
    private String password;
    private String phone;
    private static int userCount = 1111111;

    public User(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phoneNumber;
        this.login = generateUserLogin();
    }

    public static String generateUserLogin() {
        String login = String.valueOf(userCount);
        login = login.substring(0, 3) + "-" + login.substring(3, 7);

        userCount++;
        return login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
