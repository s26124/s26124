package com.pip.PIP4;
import java.util.Scanner;

public class PIP4_2 {
    public static void main(String[] args) {

        boolean flag = false;
        int liczba;

        System.out.print("Podaj liczbę całkowitą: ");
        Scanner scan = new Scanner(System.in);
        liczba = scan.nextInt();

        if (liczba%2==0){flag=true; System.out.println("Liczba "+liczba+" jest podzielna przez 2");}
        if (liczba%3==0){flag=true; System.out.println("Liczba "+liczba+" jest podzielna przez 3");}
        if (liczba%5==0){flag=true; System.out.println("Liczba "+liczba+" jest podzielna przez 5");}

        //if (liczba%2 !=0 && liczba%3!=0 && liczba%5!=0){System.out.println("Liczba "+liczba+" nie jest podzielna przez 2, 3 lub 5");}
        if (!flag){System.out.println("Liczba "+liczba+" nie jest podzielna przez 2, 3 lub 5");}
}
}
