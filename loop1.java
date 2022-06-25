
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class loop1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the value of m"); //Find the sum of even numbers between m and n
        m = input.nextInt();
        System.out.println("Enter the value of n"); 
        n = input.nextInt();
        int sum=0;
        
        for(int i=m;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
                System.out.println(i);
             
        }  
            
            
        
        }
        System.out.println("Sum = "+sum ); 
        
        
    }
    
}
