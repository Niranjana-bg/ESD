import java.util.Scanner;

public class Armstrong
{
	public static void main (String  args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number\n");
		int data = sc.nextInt();

		int remainder, result =0;
		int number = data;
		while(data !=0)
		{
			remainder = data % 10;
            result += Math.pow(remainder, 3);
            data /= 10;
		}

		if(result == number)
		{
			System.out.println(number + " is an armstrong number");
		}
		else
		{
			System.out.println(number +" is not an armstrong number");
		}
	}
}