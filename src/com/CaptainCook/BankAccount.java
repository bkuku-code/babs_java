package com.CaptainCook;

import java.util.*;

public class BankAccount {
    static Scanner input = new Scanner(System.in);
    String name;
    String accounttype;
    int accountNo;
    int balance;
    int amt;
    int withdrawl;
     int transfer;



    BankAccount(String name, int accNo, String actype, int bal , int withdrawl, int transfer) {
        this.name = name;
        this.accountNo = accNo;
        this.accounttype = actype;
        this.balance = bal;
        this.withdrawl = withdrawl;
        this.transfer = transfer;

    }

    public BankAccount(String nn, int num, String type, int bal) {

    }
    int Withdrawl() {
        System.out.println("Your Balance=" + balance);
        System.out.print("Enter amount to Withdrawl:");
        amt = input.nextInt();
        if (balance < amt) {
            System.out.println("Not sufficient balance.");
            return 1;
        }
        if (amt < 0) {
            System.out.println("Invalid Amount");
            return 1;
        }
        balance = balance - amt;
        return 0;


    }

    int deposit() {
        System.out.print("Enter amount to deposit:");
        amt = input.nextInt();
        if (amt < 0) {
            System.out.println("Invalid Amount");
            return 1;
        }
        balance = balance + amt;
        return 0;
    }

    int transfer() {
        System.out.println("Your Balance=" + balance);
        System.out.print("Enter amount to transfer:");
        amt = input.nextInt();
        if (transfer < amt) {
            System.out.println("Not sufficient balance.");
            return 1;
        }
        if (amt < 0) {
            System.out.println("Invalid Amount");
            return 1;
        }
        balance = balance - amt;
        return 0;
    }


    void display() {
        System.out.println("Name:" + name);
        System.out.println("Account No:" + accountNo);
        System.out.println("Balance:" + balance);

    }

    void dbal() {
        System.out.println("Balance:" + balance);
    }

    public static void main(String args[]) {
        System.out.println("Enter your Name: ");
        String nn = input.nextLine();
        System.out.println("Enter Account Number: ");
        int num = input.nextInt();
        System.out.println("Enter Account Type: ");
        String type = input.next();
        System.out.println("Enter Initial Balance: ");
        int bal = input.nextInt();
        BankAccount b1 = new BankAccount(nn, num, type, bal);
        int menu;
        System.out.println("Menu");
        System.out.println("1. Deposit Amount");
        System.out.println("2. Transfer Amount");
        System.out.println("3. Withdrawl Amount");
        System.out.println("4. Display Information");
        System.out.println("5. Exit");
        boolean quit = false;
        do {
            System.out.print("Please enter your choice: ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    b1.deposit();
                    break;

                case 2:
                    b1.transfer();
                    break;

                case 3:
                    b1.withdrawl();
                    break;

                case 4:
                    b1.display();
                    break;

                case 5:
                    quit = true;
                    break;
                default:

            }
        } while (!quit);
    }

    private void withdrawl() {
    }


}