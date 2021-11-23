package com.pip.PIP4;
import java.util.Scanner;

public class PIP4_3 {
    public static void main(String[] args) {
        double liczba;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        liczba = scan.nextDouble();

        if (liczba/10<1) {System.out.println("Liczba jest jednocyfrowa");}
            else if (liczba/100<1) {System.out.println("Liczba jest dwucyfrowa");}
            else if (liczba/1000<1) {System.out.println("Liczba jest trzycyfrowa");}
        {System.out.println("Liczba "+liczba+" ma więcej cyfr niż 3");}
    }
}
