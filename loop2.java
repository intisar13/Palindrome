
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class loop2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0,n;
        System.out.println("Enter the value of n= ");
        n=input.nextInt();
        
        for (int i=1;i<=n;i++){
            sum=sum + i*i;
            System.out.println(i + "x" +i );
            
            
        }
        System.out.println("Sum = "+sum);
        
    }
    
}
