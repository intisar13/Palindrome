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
public class loopMultipilcation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int m,n;
        System.out.println("Enter the initial value of m= ");
        m=input.nextInt();
        System.out.println("Enter the final value of n= ");
        n=input.nextInt();
        
        for(int i=m;i<=n;i++){
            for(int j=1;j<=10;j++)
            System.out.println(i+"X"+j+"="+j*i);
            
            
            
            
        
        
            
        }
        
        
        
        
    }
    
}
