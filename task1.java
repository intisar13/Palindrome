package com.mycompany.basicjavaa.lab04;

import java.util.Scanner;


public class task1 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        sc.close();
        System.out.println("Vowels : " + countVowels(str));
    }
    public static int countVowels(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++)
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e'
                    || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o'
                    || sentence.charAt(i) == 'u')
                count++;
        return count;
    }
    
}
