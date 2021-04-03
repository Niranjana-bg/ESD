/*48. Implement a java program to find the memory size in bytes given the input as address length. */

class MemorySize{
	public static void main(String args[]){
		int StartAddr = 23788;
		int EndAddr = 23898;
		int bytes = (EndAddr - StartAddr)/8;
		System.out.println("Memory size in bytes : "+bytes);
	}
}