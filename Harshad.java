/*23.Java program to check whether a number is a Harshad Number or not   */


/*A number is said to be the Harshad number if it is divisible by the sum of its digit.
 For example, if number is 156, then sum of its digit will be 1 + 5 + 6 = 12. 
 Since 156 is divisible by 12. So, 156 is a Harshad number*/

 
import java.util.*;

class Harshad
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int c = n, d, sum = 0;
         
        //finding sum of digits
        while(c>0)
        {
            d = c%10;
            sum = sum + d;
            c = c/10;
        }
         
        if(n%sum == 0)
            System.out.println(n+" is a Harshad Number.");
        else
            System.out.println(n+" is not a Harshad Number.");      
    }
}