package com.pip.PIP4;
import java.util.Scanner;

public class PIP4_6 {
    public static void main(String[] args) {

    System.out.print("Podaj liczbę:  ");
    Scanner scan = new Scanner(System.in);
    double d = scan.nextDouble();
    System.out.print("Wartość funkcji signum  "+d+" to "+znakLiczby(d));

    }
    public static int znakLiczby(double d){
        if (d>0)
            return 1;
        else if (d==0)
            return 0;
            return -1;}

}
