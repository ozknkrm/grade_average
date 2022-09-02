package org.example;
import java.util.Scanner;
public class GradeAverage {
    public static void main(String[] args) {
        //let's create our variables
        int math,physics,chemistry,turkish,history,music;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math note :");
        math = input.nextInt();

        System.out.print("Enter your physics note :");
        physics = input.nextInt();

        System.out.print("Enter your chemistry note :");
        chemistry = input.nextInt();

        System.out.print("Enter your turkish note :");
        turkish = input.nextInt();

        System.out.print("Enter your history note :");
        history = input.nextInt();

        System.out.print("Enter your music note :");
        music = input.nextInt();


        int sum = (math + physics + chemistry + turkish + history + music);
        int result = sum / 6;

        System.out.println("Your grade point average: "+ result);

        switch (result) {
            case 3 -> System.out.println("You have to study more");
            case 4 -> System.out.println("Not good enough");
            case 5 -> System.out.println("More or less");
            case 6 -> System.out.println("it can be better");
            case 7 -> System.out.println("good enough");
            case 8 -> System.out.println("well");
            case 9 -> System.out.println("very well");
            default -> System.out.println("GOOD LUCK NEXT YEAR");
        }

    }
}
