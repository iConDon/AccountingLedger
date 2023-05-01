package org.yup.accountingledger;
import java.time.LocalDate;
import java.time.LocalTime;

public class Transactions {

    //properties of a transaction
    LocalDate date;
    LocalTime time;
    private String description;
    private String vendor;
    private int amount;


    //Method constructor for creating transactions

    public Transactions(LocalDate date, LocalTime time, String description, String vendor, int amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

