
package com.mycompany.basicjavaa;

import java.util.Scanner;


public class TwodArray {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       
       int [][] A = new int[2][3];
       int [][] B = new int[2][3];
       
        System.out.println("Enter elements of A: ");
       for(int row=0;row<2;row++){
           for(int colm=0;colm<3;colm++){
               System.out.printf("A[%d][%d]=",row,colm);
           A[row][colm]=input.nextInt();
           }
           
           
       }
       
        System.out.println("Enter elements of B: ");
       for(int row=0;row<2;row++){
           for(int colm=0;colm<3;colm++){
               System.out.printf("B[%d][%d]=",row,colm);
           B[row][colm]=input.nextInt();
           }
           
           
       }
       System.out.println("A= ");
       for(int row=0;row<2;row++){
           for(int colm=0;colm<3;colm++){
               System.out.print(" "+A[row][colm]);
           }
           System.out.println();
           
       }
       
       
       
              System.out.println("B= ");
       for(int row=0;row<2;row++){
           for(int colm=0;colm<3;colm++){
               System.out.print(" "+B[row][colm]);
           }
           System.out.println();
           
       }
       
        System.out.println("A+B= ");
        for(int row=0;row<2;row++){
           for(int colm=0;colm<3;colm++){
               System.out.print("\t " + (A[row][colm]+B[row][colm]));
           }
           System.out.println();
       
    }
    }
}
    

