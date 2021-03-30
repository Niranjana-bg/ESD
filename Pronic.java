/*24.Java program to check whether a number is a Pronic Number or Heteromecic Number or not.*/


/*A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1). 
The first few pronic numbers are: 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462*/


import java.util.Scanner;
class Pronic
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        int flag=0;
        for(int i=1; i<n ; i++)
        {
            if(i*(i+1)==n)
            {
                flag=1;
                break;
            }
        }

        if(flag==1)
            System.out.println(n + " is a pronic number");
        else
            System.out.println(n + " is not a pronic number");
    }
} 