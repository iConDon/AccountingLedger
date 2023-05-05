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



        while (appRunning) {

            String homeScreenChoice = Screens.homeScreen();

            switch (homeScreenChoice) {

                //View possible input
                case "D" -> {
                    int addDeposit = Screens.addDeposit();
                    String addDescription = Screens.addDescription();
                    String addVendor = Screens.addVendor();
                    Transactions transaction = new Transactions(LocalDate.now(), LocalTime.now(), addDescription, addVendor, addDeposit);
                    writeTransactionToFile(transaction);

                }
                case "P" -> {
                    int makePayment = Screens.makePayment();
                    String addDescription = Screens.addDescription();
                    String addVendor = Screens.addVendor();
                    Transactions transaction = new Transactions(LocalDate.now(), LocalTime.now(), addDescription, addVendor, makePayment *= -1);
                    writeTransactionToFile(transaction);

                }
                case "L" -> {
                    String showLedger = Screens.Ledger();
                }
                case "X" -> {
                    appRunning = false;
                }
                default -> System.out.println("No selection made");
            }
        }

    }

        public static void writeTransactionToFile(Transactions transaction ) {

            try {
                FileWriter fileWriter = new FileWriter("Transaction.csv", true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(String.format("%s|%s|%s|%s|%.2f\n", transaction.getDate().toString(), transaction.getTime().toString(), transaction.getDescription(), transaction.getVendor(), transaction.getAmount()));
                bufferedWriter.close();
                fileWriter.close();



            } catch (IOException e) {
                System.out.println("Couldn't load file");
            }
        }
    }



