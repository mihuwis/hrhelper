package com.mihuwis.hrhelper.View;

public class MassagePrinter {

    public void printMenuOptions() {
        System.out.println("Menu: \n\t" +
                "1. Print all Users of one type:\n\t" +
                "2. Find user by Name or Last Name:\n\t" +
                "3. Find user by email alias:\n\t" +
                "4. Remove user by Id number\n\t" +
                "0. Exit application");
    }

    public void askForUserType(){
        System.out.println("Which user you want to list: \n\t" +
                "1. Mentors\n\t" +
                "2. Applicants");
    }

    public void askUserForNumber() {
        System.out.println("\nEnter menu number: ");
    }

    public void sayGoodBy() {
        System.out.println("Thank you for using HR Helper!\n\t_______BYE________");
    }

    public void wrongNumberMassage(){
        System.out.println("Please enter correct number");
    }
}
