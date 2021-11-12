package com.pip;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Podaj numer miesiąca: ");
        Scanner scan = new Scanner(System.in);
        int miesiac = scan.nextInt();

        System.out.print("Podaj rok: ");
        int rok = scan.nextInt();
        kwartal(miesiac,rok);

    }

    public static void kwartal(Integer miesiac, Integer rok) {

        String tekst = miesiac + "." + rok + " to ";
        int mies = miesiac;
        mies /= 4;
        if (mies == 0) {tekst += "I";} else {
            if (mies == 1) {tekst += "II";}
                else if (mies==2) {tekst+="III";}
                    else {tekst+="IV";}
            }
        System.out.print(tekst +" kwartał "+rok+" roku");
        }

}
