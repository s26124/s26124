package com.pip.PIP4;

import java.util.Scanner;

public class PIP4_4 {
    public static void main(String[] args) {



        System.out.print("Podaj numer miesiąca: ");
        Scanner scan = new Scanner(System.in);
        int NrMiesiac = scan.nextInt();


        String napis = "Wspomniałeś ";
        switch (NrMiesiac){
            case 1 : {napis+="styczeń"; System.out.print(napis);} break;
            case 2 : {napis+="luty"; System.out.print(napis);} break;
            case 3 : {napis+="marzec"; System.out.print(napis);} break;
            case 4 : {napis+="kwiecień"; System.out.print(napis);} break;
            case 5 : {napis+="maj"; System.out.print(napis);} break;
            case 6 : {napis+="czerwiec"; System.out.print(napis);} break;
            case 7 : {napis+="lipiec"; System.out.print(napis);} break;
            case 8 : {napis+="sierpień"; System.out.print(napis);} break;
            case 9 : {napis+="wrzesień"; System.out.print(napis);} break;
            case 10 : {napis+="październik"; System.out.print(napis);} break;
            case 11 : {napis+="listopad"; System.out.print(napis);} break;
            case 12 : {napis+="grudzień"; System.out.print(napis);} break;
            default : napis="Nie wspomniałeś żadnego miesiąca"; System.out.print(napis);
}

       // System.out.print("Wspomniałeś "+ napis);

        }
    }



