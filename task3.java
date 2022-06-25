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
public class task3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num = ");
        int digit = sc.nextInt();
        sc.close();
        System.out.println("Sum of digits: " + sumDigit(digit));
    }
    public static int sumDigit(int number) {
        int sum = 0, d;
        while (number > 0) {
            // calculate last digit
            d = number % 10;
            // adds last digit to the variable sum
            sum = sum + d;
            // removes the last digit from the number
            number = number / 10;
        }
        return sum;
    }
    
}
