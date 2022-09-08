package org.example;
import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;
        double bodyIndex;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight : ");
        weight = input.nextDouble();
        System.out.print("Enter your height : ");
        height = input.nextDouble();

        bodyIndex = weight / (height * height);
        System.out.println("Your body mass index is : " + bodyIndex);
        if (bodyIndex > 25) {
            System.out.println("You should start to do some exercise to loose weight.");
        }
    }
}
