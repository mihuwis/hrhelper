package com.mihuwis.hrhelper.View;

import java.util.Scanner;

public class InputCollector {

    MassagePrinter massagePrinter = new MassagePrinter();

    public Integer readNumberFromInput() {
        Scanner sc = new Scanner(System.in);
        massagePrinter.askUserForNumber();

        while(!sc.hasNextInt()) {
            massagePrinter.askUserForNumber();
            sc.next();
        }
        int number = sc.nextInt();

        return number;
    }

    public String readStringFromUSer(){
        Scanner sc = new Scanner(System.in);

        return null;
    }
}
