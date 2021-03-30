import java.lang.Math; 
import java.util.Scanner;
class MathSquare{
	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to findout the Squareroot");
		num=sc.nextInt();
		System.out.println("Squareroot of "+num+" = "+Math.sqrt(num));

	}

}