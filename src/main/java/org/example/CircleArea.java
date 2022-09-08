package org.example;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Insert the half diameter of the circle : ");
        r = input.nextInt();
        double area = pi * r * r;
        double perimeter = 2 * pi * r;
        System.out.println("Area of the circle is : " + area);
        System.out.println("Perimeter of the circle is : " + perimeter);
    }
}
