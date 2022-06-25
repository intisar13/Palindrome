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
public class ArrayFindSum {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double sum=0;
       double[] number=new double[5];
       
       
       System.out.println("Enter 5 numbers: ");
       
       for(int i=0;i<5;i++){
           number[i]=input.nextDouble();
       }
       for(int i=0;i<5;i++){
           sum=sum+number[i];
       }
        System.out.println("Sum= "+sum );
        System.out.println("Average= "+sum/5);
        
        double max=number[0];
        double min=number[0];
        
        for(int i=1;i<5;i++){
            if(max<number[i])
                max=number[i];
            
        }
        for(int i=1;i<5;i++){
            if(min>number[i])
                min=number[i];
            
        }
        System.out.println("Maximum= "+max);
        System.out.println("Minimum= "+min);
        
        
       
       
    }
    
}
