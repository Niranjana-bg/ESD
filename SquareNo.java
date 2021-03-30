import java.util.Scanner;
class SquareNo{

	static int SquareNo(int a)
	{
		return (a*a);
	}
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find its square");
		a=sc.nextInt();
		System.out.println("The Square of number "+a+"="+SquareNo(a));
	}
}