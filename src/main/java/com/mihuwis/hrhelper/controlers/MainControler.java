package com.mihuwis.hrhelper.controlers;

import com.mihuwis.hrhelper.View.InputCollector;
import com.mihuwis.hrhelper.View.MassagePrinter;

public class MainControler {

    MassagePrinter massagePrinter;
    InputCollector inputCollector;


    public MainControler() {
        this.massagePrinter = new MassagePrinter();
        this.inputCollector = new InputCollector();
    }

    public void runMenu(){

        while(true){

            massagePrinter.printMenuOptions();
            int menuChoice = inputCollector.readNumberFromInput();

            switch (menuChoice) {
                case 1:

                    break;
                case 2:
                    System.out.println("find user by  name");
                    break;
                case 3:
                    System.out.println("find user by email");

                    break;
                case 4:
                    System.out.println("remove done :) ");

                    break;
                case 0:
                    massagePrinter.sayGoodBy();
                    System.exit(0);
                default:

            }
        }



    }

}
