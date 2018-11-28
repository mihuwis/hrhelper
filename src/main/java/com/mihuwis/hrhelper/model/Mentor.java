package com.mihuwis.hrhelper.model;

public class Mentor extends User {

    private String nickName;
    private String city;
    private int favouriteNumber;

    public Mentor(int id, String firstName, String lastName,
                  String telNumber, String email, String nickName, String city, int favouriteNumber) {
        super(id, firstName, lastName, telNumber, email);
        this.nickName = nickName;
        this.city = city;
        this.favouriteNumber = favouriteNumber;
    }

    public String getNickName() {
        return nickName;
    }

    public String getCity() {
        return city;
    }

    public int getFavouriteNumber() {
        return favouriteNumber;
    }
}
