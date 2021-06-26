package com.CaptainCook;

import java.util.*;

public class bkukuBank {
    static Scanner input = new Scanner(System.in);
    String name;
    String accounttype;
    int accountNo;
    int balance;
    int amt;
    int withdrawl;
     int transfer;
    private String staffLogin;
    private String customeLogin;
    private Object DeleteCustomerProfile;


    bkukuBank(String staffLogin,String customeLogin, int accNo, String actype, int bal , int withdrawl, int transfer) {
        this.staffLogin = staffLogin;
        this.customeLogin = customeLogin;
        this.accounttype = actype;
        this.balance = bal;
        this.withdrawl = withdrawl;
        this.transfer = transfer;

    }

    public bkukuBank(String nn, int num, String type, int bal) {

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

    

    int transfer() {
        System.out.println("Your Balance=" + balance);
        System.out.print("Enter amount to transfer:");
        amt = input.nextInt();
        if (transfer > amt) {
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
        System.out.println("Staff login:" + staffLogin);
        System.out.println("Customer login:" + customeLogin);
        System.out.println("Balance:" + balance);

    }

    void dbal() {
        System.out.println("Balance:" + balance);
    }

    public static void main(String args[]) {
        System.out.println("Staff Login: ");
        String nn = input.nextLine();
        System.out.println("Enter OTTP code : ");
        int num = input.nextInt();
        System.out.println("Customer Login: ");
        String type = input.next();
        System.out.println("Enter Initial Balance: ");
        int bal = input.nextInt();
        System.out.println("Delete customer profile :");
        String customerProfile = input.nextLine();
        bkukuBank b1 = new bkukuBank(nn, num, type, bal);

        int menu;
        System.out.println("Menu");
        System.out.println("1. Transfer Amount");
        System.out.println("2. Withdrawl Amount");
        System.out.println("3. Display Information");
        System.out.println("4, Delete customer profile");
        System.out.println("5. Exit");
        boolean quit = false;
        do {
            System.out.print("Please enter your choice: ");
            menu = input.nextInt();
            switch (menu) {
               
                case 1:
                    b1.transfer();
                    break;

                case 2:
                    b1.withdrawl();
                    break;

                case 3:
                    b1.display();
                    break;
                    
                case 4:
                    b1.DeleteCustomerProfile();
                    break;


                case 5:
                    quit = true;
                    break;
                default:

            }
        } while (!quit);
    }

    private void DeleteCustomerProfile() {
    }

    private void withdrawl() {
    }


}