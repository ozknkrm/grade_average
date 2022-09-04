package org.example;
import java.util.Scanner;
public class KdvHesapla {
    public static void main(String[] args) {
        double tutar;
        double kdvOran = 0.18;
        double kdvTutar;
        double kdvliTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ucret tutarini giriniz : ");

        tutar = input.nextDouble();
        System.out.println(tutar);
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar :" + tutar);
        System.out.println("KDV orani :" + kdvOran);
        System.out.println("KDV tutari :"+ kdvTutar);
        System.out.println("KDV'li tutari :"+ kdvliTutar);
    }
}
