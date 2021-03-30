/*25.Java program check whether a number is an Automorphic number or not.*/

/* automorphic number is a number whose square "ends" in the same digits as the number itself. 
For example, 52 = 25, 62 = 36, 762 = 5776, and 8906252 = 793212890625, so 5, 6, 76 and 890625
 are all automorphic numbers.*/

import java.util.Scanner;

public class Automorphic {

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();

        int c=0, sqr = num*num;
        int temp =num;  


        while(temp>0){
            c++;
            temp=temp/10;
        }

        int lastSquareDigits = (int) (sqr%(Math.pow(10,c)));

        if(num == lastSquareDigits)
            System.out.println("Automorphic number");
        else
            System.out.println("Not an Automorphic number");
    }
} 