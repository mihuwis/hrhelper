package com.mihuwis.hrhelper.View;

import com.mihuwis.hrhelper.model.User;

import java.util.List;

public class OutputPrinter {

    public void printListOfUsers(List<User> listToPrint){
        for(User user:listToPrint){
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }
    }
}
