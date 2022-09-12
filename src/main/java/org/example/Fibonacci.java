package org.example;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Fibonacci : 0 ,1,1,2,3,5,8,13,21,34,55

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int total;
        System.out.print(num + "Fibonacci of this number :");

        for(int i =1; i <= num; i++) {
            System.out.print(a + " , ");
            total = a + b;
            a = b;
            b = total;
        }
    }
}
