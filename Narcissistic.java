/*34.Java program to find all the narcissistic numbers between 1 and 1000.*/

/*Narcissistic Numbers are defined as follows: An n digit number is narcissistic 
if the sum of its digits to the nth power equal the original number. 
For example with 2 digits, say I choose the number 36: 32 + 62 = 45*/


import java.util.LinkedList;
public class Narcissistic  {

    public static void main(String args[])
    {
        for (int i = 1; i < 1000; i++) {
            int n = i;
            LinkedList<Integer> data = new LinkedList<>();
            while (n > 0) {
                data.push( n % 10 );
                n = n / 10;
            }
            int n1 = 0;
            for(Integer num : data) {
                n1 += Math.pow(num, data.size());
            }
            if(i == n1) {
                System.out.println(i);
            }
        }
    }
}