package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CashierProgram {
    public static void main(String[] args){
        double applePerKg,bananaPerKg,tomatoPerKg,eggplantPerKg,cucumberPerKg,apple,banana,tomato,eggplant,cucumber,total;
        Scanner input = new Scanner(System.in);

        System.out.print("how many kgs apple you want : ");
        applePerKg = input.nextDouble();

        System.out.print("how many kgs banana you want : ");
        bananaPerKg = input.nextDouble();

        System.out.print("how many kgs tomato you want : ");
        tomatoPerKg = input.nextDouble();

        System.out.print("how many kgs eggplant you want : ");
        eggplantPerKg = input.nextDouble();

        System.out.print("how many kgs cucumber you want : ");
        cucumberPerKg = input.nextDouble();

        apple=applePerKg*2.14;
        banana=bananaPerKg*3.67;
        tomato=tomatoPerKg*2.68;
        eggplant=eggplantPerKg*5.36;
        cucumber=cucumberPerKg*4.25;

        total=apple+banana+tomato+eggplant+cucumber;
        System.out.println("You have to pay : " + total + "$");

    }
}
