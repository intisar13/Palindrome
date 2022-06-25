/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicjavaa.lab04;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class task2 {
    public static void main(String[] args) {
       
    
            System.out.println("Enter a string or number: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        if (isPalindrome(str))
            System.out.println(str + " is a palindrome!");
        else
            System.out.println(str + " is not a palindrome!");
    }
    public static boolean isPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            int j = input.length() - i - 1;
            if (input.charAt(i) != input.charAt(j))
                return false;
        }
        return true;
    }
    
}
