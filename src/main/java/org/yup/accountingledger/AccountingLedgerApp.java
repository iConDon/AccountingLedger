package org.yup.accountingledger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class AccountingLedgerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to Conscious Bank,");
        System.out.println("What would you like to do?\n ");

        Scanner scanner = new Scanner(System.in);


        Screens screens = new Screens();
        screens.Ledger();
        Screens.Reports();

        LocalTime.now();
        LocalDate.now();


        boolean appRunning = true;

        String homeScreenChoice = Screens.homeScreen();
   //     int i = 0;
    //    while( i == 1) {

            switch (homeScreenChoice) {

                //View possible input
                case "D" -> {
                    int addDeposit = Screens.addDeposit();
                    String addDescription = Screens.addDescription();
                    String addVendor = Screens.addVendor();
                    Transactions transactions = new Transactions(LocalDate.now(), LocalTime.now(), addDescription, addVendor, addDeposit);
                }
                case "P" -> {
                    int makePayment = Screens.makePayment();
                }
                case "L" -> {
                    int showLedger = Screens.Ledger();
                }
                case "X" -> {
                    String exit = "Thank you for your business!";
                }
                default -> System.out.println("No selection made");
            }
        }

  //  }

    public static void writeTransactionToFile() {

        try {
            FileWriter fileWriter = new FileWriter("Transactions.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String theLine;
        } catch (IOException e) {
            System.out.println("Couldn't create file");
        }
    }
}


