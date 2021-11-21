package com.pip.PIP3;
import java.util.*;

public class PIP3_1 {
    public static void main(String[] args) {
    String imie, nazwisko, plec;
        System.out.print("Podaj imię: ");
    Scanner scan = new Scanner(System.in);
    imie = scan.next();
        System.out.print("Podaj nazwisko: ");
    nazwisko = scan.next();
        System.out.print("Podaj płeć (mężczyzna/kobieta): ");
    plec = scan.next();
    wypisz(imie,nazwisko,plec);

    //String w = "Witaj ";
    // String scan = w + imie.nextLine();
    // System.out.println();

}

    public static void wypisz(String imie, String nazwisko, String plec)
    {
        String napis="";
        if (plec.equals("mężczyzna")) { napis += "Student: ";}
        else {
            if (plec.equals("kobieta")) { napis += "Studentka: ";}
            else {
                napis += "Student/ka: ";
            }
        }


        napis=napis+imie+" "+ nazwisko;
        System.out.println(napis);
    }
}
