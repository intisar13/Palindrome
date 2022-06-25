/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Task2 {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of N= ");
        double n=input.nextInt();
        double sum=0;
        
        for(double i=1;i<=n;i++){
            sum=sum+(1/i);
            
        }
        
        System.out.println("Sum= "+sum);
        
        
       
    }
    
}
