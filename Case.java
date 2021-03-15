public class Case{

	static int x=32; 

	static String toggleCase(char[] c) 
	{ 
		for (int i=0; i<c.length; i++) 
			{ 
				c[i]^=32; 
			} 
		return new String(c); 
	} 
	
	public static void main(String[] args) 
	{ 
		String str = "InDiA"; 
		System.out.print("Toggle case: "); 
		str = toggleCase(str.toCharArray()); 
		System.out.println(str); 
		
		System.out.print("Original string: "); 
		str = toggleCase(str.toCharArray()); 
		System.out.println(str);	 
	} 
} 

	
