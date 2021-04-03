/*42.If the total ages of Iqbal and Shikhar is 12 years more than the total age of Shikhar and Charu. Charu is how many years younger than Iqbal? Provide a JAVA program to get input and find the age. */

class Age{

	void age(int i, int s)
	{
		int c = i+s-s-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu's age is "+c);
	}

	public static void main(String[] args) {
		
		Age_42 obj = new Age_42();
		obj.age(14,11);
	}
}