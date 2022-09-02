package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir deger giriniz: ");
        String str = input.nextLine();
        System.out.println(str);
    }
}