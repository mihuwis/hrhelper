package com.mihuwis.hrhelper.model;

public class Applicant extends User {
    private int applicationNumber;

    public Applicant(int id, String firstName, String lastName, String telNumber, String email, int applicationNumber) {
        super(id, firstName, lastName, telNumber, email);
        this.applicationNumber = applicationNumber;
    }

    public int getApplicationNumber() {
        return applicationNumber;
    }
}
