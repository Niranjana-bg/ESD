/*27.Java program to check two numbers are Amicable numbers or not.*/

/*Two numbers are said to be amicable if each number is the sum of the proper divisors of the other. 
A proper divisor of a number is any divisor of the number except the number itself. 
For example, the proper divisor of 12 are 1, 2, 3, 4, and 6*/

import java.io.*;
import java.util.Scanner;

class Amicable
{

    static int divSum(int n)
    {

        int result = 0;


        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            // if 'i' is divisor of 'n'
            if (n % i == 0)
            {
                // if both divisors are same
                // then add it once else add
                // both
                if (i == (n / i))
                    result += i;
                else
                    result += (i + n / i);
            }
        }

        // Add 1 and n to result as above loop
        // considers proper divisors greater 
        // than 1.
        return (result + 1);
    }

    // Returns true if x and y are Amicable
    // else false.
    static boolean areAmicable(int x, int y)
    {
        if (divSum(x) != y)
        return false;

        return (divSum(y) == x);
    }

    public static void main (String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int x=sc.nextInt();

        System.out.println("Enter the second number");
        int y=sc.nextInt();

        if (areAmicable(x, y))
        System.out.println(x+" and "+y + " are Amicable numbers");
        else
        System.out.println(x+" and "+y + " are not Amicable numbers");

    }
}