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
public class PaindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num,tem,r,sum=0;
        System.out.println("Enter any number: ");
        num=input.nextInt();
        tem=num;
        
        while(tem!=0){
            r=tem%10;
            sum=sum*10+r;
            tem=tem/10;
            
        }
        System.out.println("Reversed Number= "+sum);
        
        if(sum==num)
            System.out.println("The number is palindrome");
        else
            System.out.println("Not palindrome");
        
        
       
    }
    
}

    

