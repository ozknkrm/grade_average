package org.example;
import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int km,age,type;
        System.out.print("How many kms you will flight : ");
        km = input.nextInt();
        System.out.print("How old are you ? : ");
        age = input.nextInt();
        System.out.print("Choose your flight type (1=One way , 2=Round trip) : ");
        type = input.nextInt();

        double regularPrice,ageDiscount, typeDiscount;

        if(km > 0 && age > 0 && (type==1 || type==2)) {
            regularPrice = km * 0.10;
            if(age < 12) {
                ageDiscount = regularPrice * 0.5;
            }else if ( age>=12 && age<=24){
                ageDiscount = regularPrice * 0.10;
            }else if (age >= 65){
                ageDiscount = regularPrice * 0.30;
            }else{
                ageDiscount = 0;
            }
            regularPrice -= ageDiscount;
            if (type == 2){
                typeDiscount = regularPrice * 0.20;
                regularPrice = (regularPrice - typeDiscount) * 2 ;
            }
            System.out.println("Ticket price : " + regularPrice + "$");
        }else {
            System.out.println("Something went wrong, try again please.");
        }

    }
}
