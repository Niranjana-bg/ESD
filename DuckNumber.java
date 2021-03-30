/*26.Java program to check whether a number is a Duck Number or not*/

/* A Duck number is a positive number which has zeroes present in it, 
For example 3210, 8050896, 70709 are all Duck numbers.
 Please note that a numbers with only leading 0s is not considered as Duck Number. 
 For example, numbers like 035 or 0012 are not considered as Duck Numbers*/



import java.io.*;
import java.util.*;
class DuckNumber 
{

    static boolean check_duck(String num)
    {

        int i = 0, n = num.length();
        while (i < n && num.charAt(i) == '0')
            i++;


        while (i < n) {
            if (num.charAt(i) == '0')
                return true;
            i++;
        }

        return false;
    }


    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check as DuckNumber or not");
        String num = sc.nextLine();
        if (check_duck(num))
            System.out.println(num+" = It is a duck number");
        else
            System.out.println(num+" = It is not a duck number");
    }
} 