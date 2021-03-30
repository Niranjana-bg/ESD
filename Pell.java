/*35.Java program to print the first 15 numbers of the Pell series.*/

/*the Pell numbers are an infinite sequence of integers. 
The sequence of Pell numbers starts with 0 and 1, and 
then each Pell number is the sum of twice the previous Pell number and the Pell number before that.
: thus, 70 is the companion to 29, and 70 = 2 × 29 + 12 = 58 + 12*/

import java.util.Scanner;
public class Pell  {

    public static void main(String args[])
    {
	int n,a=1,b=0,c;
    System.out.println("First 20 Pell numbers: ");
    for(n=1; n<=20; n++)
     {
      c= a + 2*b;
      System.out.print(c+" ");
      a = b;
      b = c;
     }
   }
 }