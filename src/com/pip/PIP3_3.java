package com.pip;

import java.util.Scanner;

public class PIP3_3 {

    public static void main(String[] args) {
        System.out.print("Podaj rok: ");
        Scanner scan = new Scanner(System.in);
        int rok = scan.nextInt();
        if(!CzyPrzestepny(rok)) {System.out.print("Rok nie jest przestępny");}
            else {System.out.print("Rok jest przestępny");}

    }

    public static boolean CzyPrzestepny(Integer rok) {
        boolean Przestepny = false;
        if ((rok % 4 == 0 && rok / 100 != 0) || (rok % 400 == 0)) {
            Przestepny = true;
        } else {
            Przestepny = false;
        }
        return Przestepny;
    }
}
