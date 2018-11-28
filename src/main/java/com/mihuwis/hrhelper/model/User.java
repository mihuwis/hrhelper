package com.mihuwis.hrhelper.model;

public abstract class User {

    private int id;
    private String firstName;
    private String lastName;
    private String telNumber;
    private String email;

    public User(int id, String firstName, String lastName, String telNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEmail() {
        return email;
    }
}
