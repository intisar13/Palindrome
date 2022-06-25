/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basicjavaa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Pattern1 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of N: ");
        n=input.nextInt();
        
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++)
                System.out.print(" "+col);
            System.out.println();
    }
        
    
}
}
