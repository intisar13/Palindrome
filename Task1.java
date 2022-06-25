
package lab03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of N= ");
        int n=input.nextInt();
        int i=1,count=0;
        
        while(n>i){
            if(n%i==0)
                count++;
            i++;
            
            
        }
        System.out.println(n + " has total " + count + " factors.");
            
        
        
       
    }
    
}
