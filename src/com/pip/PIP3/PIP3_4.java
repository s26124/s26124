package com.pip.PIP3;
import java.util.Scanner;

public class PIP3_4 {

    public static void main(String[] args) {

        System.out.print("Podaj liczbę sztuk zakupionego towaru: ");
        Scanner scan = new Scanner(System.in);
        int Ilosc = scan.nextInt();
        double CenaPocz=10;
        double CenaPoRabacie;

        System.out.print("Czy jest promocja: (TAK/NIE)");
        String Promocja = scan.next();

        if (Promocja.equals("TAK") && Ilosc>10) {CenaPoRabacie=CenaPocz/2; //System.out.println("Uwzględniono rabat 50%: " );
        }
            else {if (Promocja.equals("TAK") && Ilosc<10) {CenaPoRabacie=CenaPocz;}
                else {CenaPoRabacie=CenaPocz*1.1;}}

// W diagramie nie ma informacji o wypisaniu wartości ani cen przed/po rabacie.
       //System.out.println("Wartość zakupu: "+ CenaPocz*Ilosc);
       //System.out.println("Wartość po uwzględnieniu rabatu: "+ CenaPoRabacie*Ilosc);
       // System.out.println(Promocja + " "+CenaPocz+" po rabacie: "+CenaPoRabacie);
    }

}
