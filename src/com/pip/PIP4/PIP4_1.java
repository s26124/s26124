package com.pip.PIP4;
import java.util.Scanner;

public class PIP4_1 {
    public static void main(String[] args) {

    System.out.println("Program służy do obliczenia pola figur: ");

        String[] Figura = new String[7];
            Figura[0] = "prostokąta";
            Figura[1] = "kwadratu";
            Figura[2] = "trójkąta";
            Figura[3] = "rombu";
            Figura[4] = "równoległoboku";
            Figura[5] = "trapezu";
            Figura[6] = "nieokreślone";

        double a,b,h,pole;

        int i=1;

        while (i<7) {
            System.out.println("    "+i+" - "+Figura[i-1]);
            i+=1;
        }

        System.out.print("Wpisz numer figury, która Cię interesuje (1-6): ");
        Scanner scan = new Scanner(System.in);
        int NrFigury = scan.nextInt();



        String napis = "Wybrałeś ";

        switch (NrFigury) {
            case 1 -> {
                napis += "prostokąt";
                System.out.println(napis);
                System.out.print("Podaj dł.boku a: ");
                a = scan.nextDouble();
                System.out.print("Podaj dł.boku b: ");
                b = scan.nextDouble();
                pole = poleprostokat(a, b);
            }
            case 2 -> {
                napis += "kwadrat";
                System.out.println(napis);
                System.out.print("Podaj dł.boku a: ");
                a = scan.nextDouble();
                pole = poleprostokat(a, a);
            }
            case 3 -> {
                napis += "trójkąt";
                System.out.println(napis);
                System.out.print("Podaj dł.boku a: ");
                a = scan.nextDouble();
                System.out.print("Podaj wys. h: ");
                h = scan.nextDouble();
                pole = poletrojkat(a, h);
            }
            case 4 -> {
                napis += "romb";
                System.out.println(napis);
                System.out.print("Podaj dł.boku a: ");
                a = scan.nextDouble();
                System.out.print("Podaj wys. h: ");
                h = scan.nextDouble();
                pole = poleprostokat(a, h);
            }
            case 5 -> {
                napis += "równoległobok";
                System.out.println(napis);
                System.out.print("Podaj dł.boku a: ");
                a = scan.nextDouble();
                System.out.print("Podaj wys. h: ");
                h = scan.nextDouble();
                pole = poleprostokat(a, h);
            }
            case 6 -> {
                napis += "równoległobok";
                System.out.println(napis);
                System.out.print("Podaj dł.podstawy dolnej: ");
                a = scan.nextDouble();
                System.out.print("Podaj dł. podstawy górnej: ");
                b = scan.nextDouble();
                System.out.print("Podaj wys. h: ");
                h = scan.nextDouble();
                pole = poletrapez(a, b, h);
            }
            default -> {
                pole = 0;
                napis = "Nie wybrałeś figury";
                System.out.print(napis);
            }
        }

        if (NrFigury<7)
        {System.out.print("Pole "+Figura[NrFigury-1]+ " wynosi: "+pole);}

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


