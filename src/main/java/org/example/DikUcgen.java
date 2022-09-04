package org.example;
import java.util.Scanner;
public class DikUcgen {
    public static void main(String[] args) {
        //variables
        int a, b;
        double c;

        Scanner input = new Scanner(System.in);
        System.out.print("a kenari : ");
        a = input.nextInt();
        System.out.print("b kenari : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("C : " + c);
    }

}