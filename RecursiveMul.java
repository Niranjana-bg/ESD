import java.io.*;
import java.util.*;

class RecursiveMul 
{

    static int product(int x, int y)
    {
        if (x < y)
            return product(y, x);

        else if (y != 0)
            return (x + product(x, y - 1));

        else
            return 0;
    }

    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println("Product of "+x+" and "+y+" = "+product(x, y)); 
    }
}