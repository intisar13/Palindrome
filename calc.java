
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class calc {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double a,b,r;
        System.out.println("Enter an operator from +, -, *, / ");
        char op = input.next().charAt(0);
        System.out.println("Enter first operand");
        a=input.nextDouble();
        System.out.println("Enter second operand");
        b=input.nextDouble();
        
        switch (op){
        case '+':
        r=a+b;
        System.out.println("Addition= "+r);
        break;
        
        case '-':
        r=a-b;
        System.out.println("Subtraction= "+r);
        break;
        
        case '*':
        r=a*b;
        System.out.println("Multiplication= "+r);
        break;
        
        case '/':
        r=a/b;
        System.out.println("Division= "+r);
        break;
        
        
        default:
        System.out.println("Invalid operator!");
        break;
    }
        
        


        
        
        
        
    }

   
}
