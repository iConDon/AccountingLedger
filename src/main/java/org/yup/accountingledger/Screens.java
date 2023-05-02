package org.yup.accountingledger;

import java.util.Scanner;

public class Screens {

    public static String homeScreen(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("D: Add Deposit");
        System.out.println("P: Make Payment");
        System.out.println("L: Display Ledger screen");
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

    public static int addDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deposit amount");

        return scanner.nextInt();
    }

    public static int makePayment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter debit information");

        return scanner.nextInt();
    }

    public static int Ledger() {
        return 0;
    }

    public static int Reports(){
        return 0;
    }


    }

