/* 2. Write a Java Program to demonstrate the working of a banking-system
      Instance variables: name, account_no, amount
      Instance methods:  deposit(), withdraw(), checkBalance(), insert() and display().
      Here we can deposit and withdraw amount from our account using deposit() and withdraw() methods respectively.
      The insert() method is to initialize state and display() method is to display state values.
*/


package com.company;
import java.util.Scanner;

public class Account {
    String name;
    int acc_no;
    int amount;

    void insert(String name, int acc_no, int amount)
    {
        this.name = name;
        this.acc_no = acc_no;
        this.amount = amount;
    }

    void deposit(int deposited_amount)
    {
        amount = amount + deposited_amount;
        System.out.println("Amount Deposited Successfully");
    }

    void withdraw(int withdraw_amount)
    {
        if(withdraw_amount > amount)
            System.out.println("Insufficient Balance in your Account");
        else
            amount = amount - withdraw_amount;
            System.out.println("Amount Withdraw Successfully");
    }

    void checkBalance()
    {
        System.out.println("Total Amount present in your Account is : " + amount);
    }

    void display()
    {
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number : " + acc_no);
        System.out.println("Amount present : " + amount);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Holder's Name : ");
        String name = sc.nextLine();

        System.out.print("Enter your Account Number : ");
        int acc_no = sc.nextInt();

        System.out.print("Enter your Amount : ");
        int amount = sc.nextInt();

        Account obj = new Account();
        obj.insert(name , acc_no , amount);

        System.out.println("\nEnter the action which you want to do :- ");
        System.out.println(" 1. Deposit\n 2. Withdraw\n 3. Check Balance\n 4. Display\n 5. Exit");
        int choice;
        
        do {
            System.out.print("\nEnter your Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter the amount which you want to deposit : ");
                    int deposited_amount = sc.nextInt();
                    obj.deposit(deposited_amount);
                    break;

                case 2:
                    System.out.print("Enter the amount which you want to withdraw : ");
                    int withdraw_amount = sc.nextInt();
                    obj.withdraw(withdraw_amount);
                    break;

                case 3:
                    obj.checkBalance();
                    break;

                case 4:
                    obj.display();
                    break;

                case 5:
                    System.out.println("Exiting the Program!!!");
            }
        }while(choice != 5);
    }
}


