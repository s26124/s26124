package com.pip.PIP4;

import java.util.Scanner;

public class PIP4_5 {
    public static void main(String[] args) {

        System.out.print("Podaj numer miesiąca: ");
        Scanner scan = new Scanner(System.in);
        int NrMiesiac = scan.nextInt();

        String napis0;
        if (NrMiesiac>0 && NrMiesiac<12) {napis0 = "Do końca roku czekają Cię jeszcze: ";} else {napis0 = "";}
        System.out.print(napis0);
        String napis ="";
        switch (NrMiesiac){
            case 1 : {napis="styczeń, "; System.out.print(napis);}
            case 2 : {napis="luty, "; System.out.print(napis);}
            case 3 : {napis="marzec, "; System.out.print(napis);}
            case 4 : {napis="kwiecień, "; System.out.print(napis);}
            case 5 : {napis="maj, "; System.out.print(napis);}
            case 6 : {napis="czerwiec, "; System.out.print(napis);}
            case 7 : {napis="lipiec, "; System.out.print(napis);}
            case 8 : {napis="sierpień, "; System.out.print(napis);}
            case 9 : {napis="wrzesień, "; System.out.print(napis);}
            case 10 : {napis="październik, "; System.out.print(napis);}
            case 11 : {napis="listopad, grudzień"; System.out.print(napis);} break;
            case 12 : {System.out.print("Hura, to już koniec roku.");} break;
            default : {System.out.print("Nie wybrałeś prawidłowego numeru miesiąca");}

    }

}}
