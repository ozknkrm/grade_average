package org.example;
import java.util.Scanner;

public class ProposeEvent {
    public static void main(String[] args) {
        //how is the weather?
        //if weather is more than 30º swim
        //if weather is between 5º and 30º go to cine
        //if weather is rainy stay at home and watch a movie
        Scanner input = new Scanner(System.in);
        int weather;
        System.out.print("What degree is the weather today ? : ");
        weather = input.nextInt();
        if(weather > 30){
            System.out.println("Today is so warming, you can go to swim!!");
        }else if(weather<30 && weather>=5){
            System.out.println("Good day to go to cine");
        }else{
            System.out.println("Stay at home, and watch a movie.");
        }
    }
}
