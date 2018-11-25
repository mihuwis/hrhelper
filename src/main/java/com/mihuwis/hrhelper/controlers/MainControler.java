package com.mihuwis.hrhelper.controlers;

import com.mihuwis.hrhelper.View.MassagePrinter;

public class MainControler {

    MassagePrinter massagePrinter;


    public MainControler() {
        this.massagePrinter = new MassagePrinter();
    }

    public void runMenu(){
        massagePrinter.printMenuOptions();
    }

}
