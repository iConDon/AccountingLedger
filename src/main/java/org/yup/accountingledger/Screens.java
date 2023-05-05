package org.yup.accountingledger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Screens {

    public static String homeScreen(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("D: Add Deposit");
        System.out.println("P: Make Payment");
        System.out.println("L: Display Ledger");
        System.out.println("X: Exit the App\n");
        System.out.println("Select an option to get started: ");


        return scanner.nextLine().toUpperCase();

    }

    public static String addDescription(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide description");

        return scanner.nextLine();
    }

    public static String addVendor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide vendor");

        return scanner.nextLine();
    }

    public static int addDeposit(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount");

        return scanner.nextInt();
    }

    public static int makePayment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter debit information");

        return scanner.nextInt();
    }

    public static String Ledger(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("A: Display all entries");
        System.out.println("D: Display Only Deposits");
        System.out.println("P: Display Payments ");
        System.out.println("R: Display Reports\n");
        System.out.println("Select an option to get started: ");

        boolean ledgerRunning = true;

        while (ledgerRunning){
            String ledgerScreenChoice = Screens.Ledger();

            //while the ledger is running
            switch (ledgerScreenChoice) {

                //view all the ledger options
                case "A" -> System.out.println("Test");

                case "D" ->
                    System.out.println("Test");

                case "P" -> {
                    System.out.println("Test");
                }

                case "R" -> {
                    System.out.println("Test");
                }
                case "X" -> {
                   ledgerRunning = false; System.exit(0);
                }

                default -> System.out.println("Try again!");
            }
            break;
        }
        return "";
    }
    public static ArrayList<Transactions> loadTransactions() {

        try{
        //reads the file "Transactions.csv"
        FileReader fileReader = new FileReader("Transactions.csv");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        //variable for the lines must be created
        String theLine;

            //reads through each line one by one until fin
            while ((theLine= bufferedReader.readLine()) != null){
                String[] split = theLine.split("\\|");
                 //Transactions transactions = new Transactions

            }
    }catch (IOException e){
        System.out.println("Couldn't create file");
        }
        return loadTransactions();
    }

        public static String Reports () {
            Scanner scanner = new Scanner(System.in);


        return " ";
        }
    }

