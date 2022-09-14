package org.example;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        int balance = 1000, input, amount;
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello welcome to Ozkan Bank ! ");
        System.out.println("Your current balance is : " + balance + "$");

        while (balance > 0) {
            System.out.println();
            System.out.println("1-) Deposit money");
            System.out.println("2-) Withdraw money");
            System.out.println("3-) Show my balance");
            System.out.println("4-) Exit");
            System.out.println("Select the action you want to do : ");
            input = scan.nextInt();

            if (input == 1) {
                System.out.println("Enter the value you want to deposit :");
                amount = scan.nextInt();
                balance += amount;
                System.out.println("Your current value is now :" + balance + "$");
            } else if (input == 2) {
                System.out.println("Enter the value you want to withdraw :");
                amount = scan.nextInt();
                if (amount > balance) {
                    System.out.println("You do not have enough money to withdraw");
                } else {
                    balance -= amount;
                    System.out.println("Your current value is now :" + balance + "$");

                }
            } else if (input == 3) {
                System.out.println("Your current balance is : " + balance + "$");
            } else if (input == 4) {
                System.out.println("Exiting !");
                break;
            }else {
                System.out.println("You entered and invalid action !");
            }
            System.out.println("See you soon !");
        }
    }
}