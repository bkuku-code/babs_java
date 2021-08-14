package com.CaptainCook;

public class Account {
    private String firstName;
    private String lastName;
    private String accountName;
    private  int phoneNumber;
    private  int idNumber;
    private  double balance;


    public Account(String firstName, String surname) {
        this.firstName = firstName;
        lastName = surname;
        accountName = this.firstName = "" + lastName;
        phoneNumber = -10;

    }
    public Account(String fullName){

        String[] names = new String[0];
        firstName = names[0];
        lastName = names[1];
        accountName = this.firstName + "" + lastName;
        phoneNumber = -10;
        this.balance = balance;

    }
    public Account(String fullName, double balance){
    }
    public Account(String firstName, String lastName, double balance){

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getBalance() {
        return balance;
    }
}
