package com.pip.PIP3;
import java.util.*;


public class PIP3_5 {

    public static void main(String[] args){

        int l=2;
        int duration = 0;
        ArrayList<Utwor> u = new ArrayList<>();
        for (int a=1;a<l;a+=1){
                Song();
                //u.add(new Song());
                //duration+=Song().d;
            }

        long mm = duration / 60;
        duration %= 60;
        long ss = duration;

        System.out.println("UTWORY:");

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
/*
    public static long Duration(String mm, String ss) {
        long duration = 60*Long.parseLong(mm)+Long.parseLong(ss);
        return duration;
    }
*/
    public static Utwor Song() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj tytuł utworu: ");
        String tytul = scan.next();
        System.out.print("Podaj czas trwania utworu (minuty): ");
        String mm = scan.next();
        System.out.print("Podaj czas trwania utworu (sekundy): ");
        String ss = scan.next();
        long d = Long.parseLong(ss)+(Long.parseLong(mm)*60);
        return new Utwor(tytul,mm,ss,d);
    }

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
        return Long.compare(u1.d, u2.d);
    }
}


