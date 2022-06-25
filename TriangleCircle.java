package com.mycompany.basicjavaa;

import java.util.Scanner;

public class TriangleCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double base, height, radius, area;
        
        System.out.print("Enter base: ");
        base=input.nextDouble();
        
        System.out.print("Enter height: ");
        height=input.nextDouble();
        
        System.out.print("Enter radius: ");
        radius=input.nextDouble();
        
        area = 0.5 * base * height;
        System.out.println("Area of triangle is: "+area);
        
        area = 3.14 * radius * radius;
        System.out.print("Area of Circle is: "+area);
        
        
        
        
        
    }
    
}
