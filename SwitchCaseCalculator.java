
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class SwitchCaseCalculator {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       char ch;
       System.out.println("Enter + or - or * or / ");
       ch = input.next().charAt(0);
       
       int x;
       System.out.println("Enter first operand: ");
       int a = input.nextInt();
       System.out.println("Enter second operand: ");
       int b = input.nextInt();
       
       switch (ch){
        case '+':
            x=a+b;
            System.out.println("Sum =  "+x);
            break;
        
        case '-':
            x=a-b;
            System.out.println("Sub= "+x);
            break;
        
        case '*':
            x=a*b;
            System.out.println("Mul= "+x);
            break;
        
        case '/':
            x=a/b;
            System.out.println("div= "+x);
            break;
        
        default:
            System.out.println("Please, Enter a valid operator.");
            break;
            
        
        
    }
        
        
        
        
    }
       
       
       
       
    }
    

