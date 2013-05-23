package com.twu.biblioteca.models;

public class Book {
    private boolean isReserved;
    private String name;


    public Book(String name) {
        this.name = name;
        this.isReserved = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

}
