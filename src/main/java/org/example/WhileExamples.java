package org.example;

import java.util.Scanner;

public class WhileExamples {
    public static void main(String[] args){
        //example 1
       /* int num = 1;
        while (num <= 100) {
            if (num % 2 ==0) {
                System.out.println(num);
            }
            num++;
        }*/

    //example 2
        /*
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int input;
        while(true){
            System.out.print("Please enter a number : ");
            input = scan.nextInt();

            if(input<0){
                System.out.println("You entered a negative number, program is off!! ");
                break;
            }
            if(input % 2 == 1) {
                //total = total + input
                total += input;
            }
        }
        System.out.println("total input is : " + total); */
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int input = scan.nextInt();
        int k = 1;
        while(k <= input){
            System.out.println(k);
            k = k * 2;
        }
    }
}
