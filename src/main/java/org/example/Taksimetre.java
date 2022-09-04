package org.example;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double startPrice = 10;
        double forKm  = 2.20;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("KM : ");
        km = input.nextInt();

        total = startPrice + (km * forKm);
        total = (total < 20) ? 20 : total;
        System.out.println("pay : " + total);
    }

}
