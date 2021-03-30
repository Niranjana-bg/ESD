/*22.Check whether the number is a palindrome number or not.*/

import java.util.Scanner;
public class Palindrome {

    public static boolean checkpal(int a)
    {
        int x,y,z=0;
        x=a;
        while(a!=0)
        {
            y = a % 10;
            z = z * 10 + y;
            a  /= 10;

        }
        if(x==z)
        {
            return(true);
        }
        else
        {
            return(false);
        }


    }

    public static void main(String[] args) 
    {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check wether the number is Palindrome or not");
        num=sc.nextInt();
        if(checkpal(num))
        {
            System.out.println("Number "+num+" is Palindrome");
        }
        else
        {
            System.out.println("Number "+num+" is not a Palindrome");
        }



    }
} 