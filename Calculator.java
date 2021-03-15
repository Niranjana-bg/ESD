class Calculator{

	public static int cal(int a, int b, String c1)
	{
		int c;
		switch (c1)
		{
			case "+":c=a+b;
				break;

			case "-":c=a-b;
				break;

			case "x":c=a*b;
				break;

			case "/":c=a/b;
				break;

			default:
			return 0;

			
		}
		return c;



	}

	public static void main(String[] args) 
	{
		int result=0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String c=args[2];

		result=cal(a,b,c);

		System.out.print("result="+result);

	}
	
}