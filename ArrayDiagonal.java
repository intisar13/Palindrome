
package com.mycompany.basicjavaa;

import java.util.Scanner;

public class ArrayDiagonal {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int[][] A = new int[3][3];
       int sD=0,sU=0,sL=0;
       
        System.out.println("Enter the matrix: ");
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                A[row][col]=input.nextInt();
            }
                
        }
        System.out.println("A= ");
       for(int row=0;row<3;row++){
           for(int colm=0;colm<3;colm++){
               System.out.print(" "+A[row][colm]);
           }
           System.out.println();
           
       }
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row==col){
                    sD=sD+A[row][col];
                }
            }
        }
        
                for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row<col){
                    sU=sU+A[row][col];
                }
            }
        }
                        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                if(row>col){
                    sL=sL+A[row][col];
                }
            }
        }
        System.out.println("Sum of Diagonals= "+sD);
        System.out.println("Sum of U= "+sU); 
        System.out.println("Sum of L= "+sL); 
    
}
}
