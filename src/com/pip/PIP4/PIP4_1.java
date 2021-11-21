package com.pip.PIP4;
import java.util.Scanner;

public class PIP4_1 {
    public static void main(String[] args) {

    double a,b,h,pole;
        System.out.println("Program służy do obliczenia pola figur: ");
        System.out.println("    1 – prostokąta");
        System.out.println("    2 – kwadratu");
        System.out.println("    3 – trójkąta");
        System.out.println("    4 – rombu");
        System.out.println("    5 – równoległoboku");
        System.out.println("    6 – trapezu");
        System.out.println("Powiedz proszę, jaka figura Cię interesuje (1-6): ");
        Scanner scan = new Scanner(System.in);
        int NrFigury = scan.nextInt();
        String napis = "Wybrałeś ";

        a=1;
        b=2;
        h=3;

        switch (NrFigury) {
            case 1:     napis+="prostokąt"; System.out.println(napis);
                        System.out.print("Podaj dł.boku a: ");
                        a = scan.nextDouble();
                        System.out.print("Podaj dł.boku b: ");
                        b = scan.nextDouble();
                        pole=poleprostokat(a,b);
                        break;

            case 2:     napis+="kwadrat"; System.out.println(napis);
                        System.out.print("Podaj dł.boku a: ");
                        a = scan.nextDouble();
                        pole=poleprostokat(a,a);
                        break;
                case 3: napis+="trójkąt"; System.out.println(napis);
                        System.out.print("Podaj dł.boku a: ");
                        a = scan.nextDouble();
                        System.out.print("Podaj wys. h: ");
                        b = scan.nextDouble();
                        pole=poletrojkat(a,b);
                        break;
            case 4: pole=poleprostokat(a,h);
            case 5: pole=poleprostokat(a,h);

                        break;
            case 6: pole=poletrapez(a,b,h);
                        break;
            default: pole=0; napis="Nie wybrałeś figury";
        }
        System.out.print("Pole prostokąta wynosi: "+pole);

                /*
        Powiedz proszę, jaka figura Ciebie interesuje: 6
        Wybrałeś trapez.
        Podaj długość podstawy dolnej: 2.25
        Podaj długość podstawy górnej: 7.75
        Podaj długość wysokości: 4
        Pole jest równe 20
*/





    }

    public static double poletrapez(double a, double b , double h){
        return 0.5*(a+b)*h;

    }

    public static double poleprostokat(double a, double b ) {
        return poletrapez(a, a, b);
    }

    public static double poletrojkat(double a, double b ) {
        return poletrapez(a, 0, b);
    }



    }


