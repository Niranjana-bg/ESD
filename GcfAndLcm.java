import java.util.Scanner;
public class GcfAndLcm
{ 
	public static int LCM(int a, int b) 
	{ 
		return (a * b) / GCF(a, b); 
	} 
	public static int GCF(int a, int b) 
	{ if (b == 0) 
		{ 
			return a; 
		} 
		else 
		{ 
			return (GCF(b, a % b)); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		System.out.println("Welcome to Java Program to calculate LCM and GCF of two numbers"); 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first number: "); 
		int n1 = sc.nextInt(); 
		System.out.println("Enter second number: "); 
		int n2 = sc.nextInt(); 
		int gcf = GCF(n1, n2); 
		int lcm = LCM(n1, n2); 
		System.out.println("The Greatest common divisor (GCF) of two numbers are: " + gcf); 
		System.out .println("The Lowest common multiplier (LCM) of two numbers are: " + lcm); 
		sc.close(); 
	} 

}
