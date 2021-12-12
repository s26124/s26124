package com.pip.PIP5;
public class PIP5 {

    public static void main(String[] args) {
    }

// ZAD_1
    public static int[] revert(int[] arr){
        int[] tab = new int[arr.length];
        for (int i=0; i<arr.length; i++)
            tab[arr.length -i-1] = arr[i];
        return tab;
    }

 // ZAD_2
    public static String arraytoString(int[] arr) {

        int imax = arr.length - 1;
        if (imax == -1)
            return "[]";

        String arraystring = "\"";
        for (int i = 0; ; i++) {
            arraystring+=(arr[i]);
            if (i == imax)
            {arraystring+="\"";
                //System.out.print(arraystring);
                return arraystring;}
            arraystring+=(", ");
        }

    }

// ZAD_3

    public static int[] even(int[] arr) {
        int[] tab = new int[arr.length];
        int evenCount = 0;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                tab[evenCount] = arr[i];
                evenCount++;
            }

        }

        int[] evenTab = new int[evenCount];

        for (int j=0; j<evenCount;j++)
        {
            evenTab[j]=tab[j];
           // System.out.print(evenTab[j]);
        }
        return evenTab;
    }

// ZAD_4
    public static boolean arrayEquals(int[] arr, int[] arr2)
    {
        boolean b=true;
        if (arr.length!=arr2.length)
        {
            b = false;
        }

        else
            for (int i=0;i<arr.length;i++)
            {
                if (arr[i]!=arr2[i])
                {
                    b=false;
                    break;
                }
            }
        return b;
    }

// ZAD_5
    public static void printArray(int[] arr)
    {
        for (int i=0; i<arr.length;i++)
        {
            if (i != 0)
                System.out.print(",");
            System.out.print(arr[i]);
        }
    }
}


