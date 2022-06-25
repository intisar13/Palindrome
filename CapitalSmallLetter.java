
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class CapitalSmallLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c;
        System.out.println("Enter any letter: ");
        c = input.next().charAt(0);
        
        if(c>= 'a' && c<= 'z'){
            System.out.println("The letter is small");
            
        }
        
        else if(c>= 'A' && c<= 'Z'){
            System.out.println("The letter is capital");
        
    }
        else
            System.out.println("invalid letter");
    
}
}
