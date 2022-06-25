
package com.mycompany.basicjavaa;

import java.util.Scanner;

public class arithmeitc {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b, result;
        
        System.out.println("Enter a: ");
        a=input.nextInt();
        
        System.out.println("Enter b: ");
        b=input.nextInt();
        
        
     
        
        result = a+b;
        System.out.println("Sum= "+result);
        
        result = a-b;
        System.out.println("Sub= "+result);
        
         result = a*b;
        System.out.println("Product= "+result);
        
         result = a/b;
        System.out.println("Div= "+result);
        
         result = a%b;
        System.out.println("Mod= "+result);
        
        
        
            
        
    }
    
    
}
