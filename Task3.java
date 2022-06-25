
package lab03;

import java.util.Scanner;

public class Task3 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inputs : ");
        double N;
        double sum = 0;
        do {
            N = sc.nextDouble();
            if (N > 0)
                sum =sum + N;
        } while (N > 0);
        sc.close();
        System.out.printf("Summation : %.2f\n", sum);
    }
    
}
