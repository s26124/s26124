package com.pip;
import java.util.*;


public class PIP3_5 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj tytuł pierwszego utworu: ");
        String tytul1 = scan.next();
        System.out.print("Podaj czas trwania pierwszego utworu (minuty): ");
        String mm1 = scan.next();
        System.out.print("Podaj czas trwania pierwszego utworu (sekundy): ");
        String ss1 = scan.next();
        long d1 = Integer.parseInt(ss1)+(Integer.parseInt(mm1)*60);

        System.out.print("Podaj tytuł drugiego utworu: ");
        String tytul2 = scan.next();
        System.out.print("Podaj czas trwania drugiego utworu (minuty): ");
        String mm2 = scan.next();
        System.out.print("Podaj czas trwania drugiego utworu (sekundy): ");
        String ss2 = scan.next();
        long d2 = Integer.parseInt(ss2)+(Integer.parseInt(mm2)*60);

        ArrayList<Utwor> u = new ArrayList<Utwor>();
        u.add(new Utwor(tytul1,mm1,ss1,d1));
        u.add(new Utwor(tytul2,mm2,ss2,d2));

        long d=d1+d2;
        long mm = d / 60;
        d %= 60;
        long ss = d;


        System.out.println("UTWORY:");

        // call the sort function
        Collections.sort(u, new DurationComparator());
        int i=1;
        for (Utwor utwor : u) {
            System.out.println(i + ". "+ utwor.name + " "
                    + utwor.mm + ":"
                    + utwor.ss);
            i=i+1;
        }


       System.out.println("ŁĄCZNY CZAS TRWANIA TO: "+format(mm) + ":" + format(ss));



    }
    public static String format(long s) {
        if (s < 10) return "0" + s;
        else return "" + s;
    }

    public static long Duration(String mm, String ss) {
        long duration = 60*Long.parseLong(mm)+Long.parseLong(ss);
        return duration;
    }

 //   public static void

}

class Utwor {
    String name;
    String mm;
    String ss;
    long d;
    Utwor(String name, String mm, String ss, long d)
    {
        this.name = name;
        this.mm = mm;
        this.ss = ss;
        this.d = d;
    }
}

class DurationComparator implements Comparator<Utwor> {
    public int compare(Utwor u1, Utwor u2)
    {
        if (u1.d == u2.d) {
            return 0;
        }
        else if (u1.d > u2.d) {
            return 1;
        }
        else {
            return -1;
        }
    }
}


