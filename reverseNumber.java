
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class reverseNumber {
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
        
       
    }
    
}
