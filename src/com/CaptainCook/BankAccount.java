package com.CaptainCook;

import java.util.*;

public class BankAccount {
    static Scanner input = new Scanner(System.in);
    private  int topUp;
    String name;
    int deposite;
    int balance;
    int amount;
    int withdrawl;
     int transfer;
    private String staffLogin;
    private String customeLogin;
    private Object DeleteCustomerProfile;


    BankAccount(String staffLogin,String customeLogin, int deposite , int topUp, int bal , int withdrawl, int transfer) {
        this.staffLogin = staffLogin;
        this.customeLogin = customeLogin;
        this.deposite = deposite;
        this.balance = balance;
        this.withdrawl = withdrawl;
        this.transfer = transfer;
        this.topUp = topUp;

    }

    public BankAccount(String staffLogin,String customeLogin, int number, String type, int balance) {

    }

    public BankAccount(String name, int number, String type, int balance) {

    }

    int Withdrawl() {
        System.out.println("Your Balance=" + balance);
        System.out.print("Enter amount to Withdrawl:");
        amount = input.nextInt();
        if (balance < amount) {
            System.out.println("Not sufficient balance.");
            return 1;
        }
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return 1;
        }
        balance = balance - amount;
        return 0;


    }

    int transfer() {
        System.out.println("Your Balance=" + balance);
        System.out.print("Enter amount to transfer:");
        amount = input.nextInt();
        if (transfer > amount) {
            System.out.println("Not sufficient balance.");
            return 1;
        }
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return 1;
        }
        balance = balance - amount;
        return 0;
    }

    int Deposite(){
        System.out.println("Your Balance = + balance");
        System.out.println("Enter amount to Deposite:");
        amount = input.nextInt();
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return 1;
        }
        balance = balance + amount;
        return 0;
    }

    


   public void display() {
        System.out.println("Staff login:" + staffLogin);
        System.out.println("Customer login:" + customeLogin);
        System.out.println("Balance:" + balance);

    }

    public void dbal() {
        System.out.println("Balance:" + balance);
    }

    public static void main(String args[]) {
        System.out.println("Staff Login: ");
        String name = input.nextLine();
        System.out.println("Enter OTTP code : ");
        int number = input.nextInt();
        System.out.println("Customer Login: ");
        String type = input.next();
        System.out.println("Enter Initial Balance: ");
        int balance = input.nextInt();
        System.out.println("Delete customer profile :");
        String customerProfile = input.nextLine();
        BankAccount kata = new BankAccount(name, number, type, balance);

        int menu;
        System.out.println("Menu");
        System.out.println("1. Transfer Amount");
        System.out.println("2. Withdrawl Amount");
        System.out.println("3. Display Information");
        System.out.println("4, Delete customer profile");
        System.out.println("5, Deposit");
        System.out.println("6, TopUp");
        System.out.println("7. Exit");
        boolean quit = false;
        do {
            System.out.print("Please enter your choice: ");
            menu = input.nextInt();
            switch (menu) {
               
                case 1:
                    kata.transfer();
                    break;

                case 2:
                    kata.withdrawl();
                    break;

                case 3:
                    kata.display();
                    break;
                    
                case 4:
                    kata.DeleteCustomerProfile();
                    break;
                    
                case 5:
                    kata.deposite();
                    break;
                    
                case 6: 
                    kata.topUp();
                    break;


                case 67:
                    quit = true;
                    break;
                default:

            }
        } while (!quit);
    }

    private void topUp() {
    }

    private void deposite() {
    }

    private void DeleteCustomerProfile() {
    }

    private void withdrawl() {
    }


}