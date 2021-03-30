class OddNumber{
	static void odd()
	{
		for(int i=0;i<100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
			
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("The odd numbers between 0-100 are");
		odd();
	}
}