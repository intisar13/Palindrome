/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicjavaa.Lab02;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class task4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your anual income: ");
        double income = sc.nextDouble();
        sc.close();
        double tax = (income <= 100000) ? 100000 * 0.1 : (income * 0.1) + ((income - 100000) * 0.2);
        System.out.printf("Eligible tax amount is : %,.4f\n", tax);
    }
}
    

