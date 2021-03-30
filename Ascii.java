class Ascii{

	static void printAscii1()
	{
		char a1;
		int a2;
		for(a1='A';a1<='Z';a1++)
		{
			a2=(int)a1;
			System.out.println("ASCII value of "+a1+"="+a2);
		}

	}

	static void printAscii2()
	{
		char a1;
		int a2;
		System.out.println();
		for(a1='a';a1<='z';a1++)
		{
			a2=(int)a1;
			System.out.println("ASCII value of "+a1+"="+a2);
		}

	}

	static void printAscii3()
	{
		char a1;
		int a2;
		System.out.println();
		for(a1='0';a1<='9';a1++)
		{

			a2=(int)a1;
			System.out.println("ASCII value of "+a1+"="+a2);
		}

	}
	public static void main(String[] args) {
		printAscii1();/*prints ascii values of A-Z*/
		printAscii2();/*prints ascii values of a-z*/
		printAscii3();/*prints ascii values of 0-9*/
	}

}