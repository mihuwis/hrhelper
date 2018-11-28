package com.mihuwis.hrhelper.controlers;

import com.mihuwis.hrhelper.UsersDAO.ApplicantsDAO;
import com.mihuwis.hrhelper.UsersDAO.MentorsDAO;
import com.mihuwis.hrhelper.UsersDAO.UsersDAO;
import com.mihuwis.hrhelper.View.InputCollector;
import com.mihuwis.hrhelper.View.MassagePrinter;
import com.mihuwis.hrhelper.View.OutputPrinter;
import com.mihuwis.hrhelper.controlers.queries.QueryBulider;

public class MainControler {

    MassagePrinter massagePrinter;
    InputCollector inputCollector;
    UsersDAO mentorDAO;
    UsersDAO applicantDAO;
    QueryBulider queryBulider;
    OutputPrinter outputPrinter;


    public MainControler() {
        this.massagePrinter = new MassagePrinter();
        this.inputCollector = new InputCollector();
        this.queryBulider = new QueryBulider();
        this.outputPrinter = new OutputPrinter();
        this.mentorDAO = new MentorsDAO();
        this.applicantDAO = new ApplicantsDAO();
    }

    public void runMenu(){

        while(true){

            massagePrinter.printMenuOptions();
            int menuChoice = inputCollector.readNumberFromInput();

            switch (menuChoice) {
                case 1:
                    getUserTypeSubMenu();
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
                    massagePrinter.wrongNumberMassage();
            }
        }
    }

    private void getUserTypeSubMenu(){

        boolean runSubMenu = true;

        while(runSubMenu){
            massagePrinter.askForUserType();
            int submenuChoice = inputCollector.readNumberFromInput();

            switch (submenuChoice){
                case 1:
                    outputPrinter.printListOfUsers(
                            mentorDAO.createUserList(
                                    queryBulider.queryForAllUsersOfGivenType("mentors")));
                    runSubMenu = false;
                    break;
                case 2:
                    outputPrinter.printListOfUsers(
                            applicantDAO.createUserList(
                                    queryBulider.queryForAllUsersOfGivenType("applicants")));
                    runSubMenu = false;
                    break;
                case 0:
                    runSubMenu = false;
                    break;
                default:
                    massagePrinter.wrongNumberMassage();

            }
        }
    }

}
