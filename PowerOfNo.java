  
/*18.Find the power of the number without using existing methods.*/

import java.util.Scanner;
public class PowerOfNo {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the base Value");
        int base = sc.nextInt();
        System.out.println("Enter the exponent Value");
        int exponent = sc.nextInt();



        long result = 1;

        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }

        System.out.println("Answer = " + result);
    }
} 