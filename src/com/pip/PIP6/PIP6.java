package com.pip.PIP6;

public class PIP6 {
    public static void main(String[] args) {}

    // Zadanie 1: Dwie tablice
        public static int[] mergeArrays(int[] arr1, int[] arr2)
        {
            int[] arr3 = new int[arr1.length+arr2.length];
            for (int i=0;i<arr1.length;i++){
                arr3[i]=arr1[i];
            }
            for (int i=arr1.length;i<arr3.length;i++){
                arr3[i]=arr2[i-arr1.length];
            }
            return arr3;
        }

    // Zadanie 2: Fibonacci
        public static int getFibonacci(int n){
            int f0=0;
            int f1=1;
            int fn=0;
            if (n<2)
                return n;
            else
                for (int i=2; i<=n;i++){
                    fn=f0+f1;
                    f0=f1;
                    f1=fn;
                }
            return fn;

    }

    // Zadanie 3: Anagram
        public static boolean areAnagram(String str1, String str2) {
            boolean result;
            result = str1.length() == str2.length();
            if (!result)
                return result;
            for (int i = 0; i<str1.length(); i++){
                result = countChar(str1,str1.charAt(i)) == countChar(str2,str1.charAt(i));
                if (!result)
                    return result;
            }
            return result;
        }

        public static int countChar(String s, char c) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)==c)
                    sum++;
            }
            return sum;
        }

    // Zadanie 4: Palindrom
        public static boolean isPalindrom(String word){
            boolean result = true;
            int l = word.length();

            for (int i=0;i<l;i++){
                result = word.charAt(i)==word.charAt(l-1-i);
                if (!result)
                    return result;
            }
            return result;
        }

    // Zadanie 5: Ilość elementów podzielnych
       public static int dividers(int[] tab1, int n) {
           int count = 0;
           for (int i = 0; i < tab1.length; i++) {
               if (tab1[i] % n == 0) {
                   count++;
               }
           }
           return count;
       }
}