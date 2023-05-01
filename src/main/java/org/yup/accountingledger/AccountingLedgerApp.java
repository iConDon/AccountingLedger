package org.yup.accountingledger;

import java.time.LocalDate;
import java.time.LocalTime;

public class AccountingLedgerApp {

    public static void main(String[] args){

        System.out.println("Welcome to Conscious Bank,");
        System.out.println("What would you like to do?\n ");



        Screens screens = new Screens();
        screens.homeScreen();
        screens.Ledger();
        Screens.Reports();

        LocalTime.now();
        LocalDate.now();



    }
}
