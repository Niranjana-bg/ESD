/*51. Find the hexadecimal equivalent for a given 4-digit binary number.*/
//input from command line args

class BinToHex{
	char binToHex(int num){
		int bit;
		char hexNo;
		int i = 0;
		int sum = 0;
		while(num > 0){
			bit = num % 10;
			num = num / 10;
			sum = sum + (int)(bit*(Math.pow(2, i)));
			i++;
		}
		if(sum >= 0 && sum < 10){
			return (char)(48 + sum);
		}
		else{
			switch(sum){
				case 10 : return 'A';
				case 11 : return 'B';
				case 12 : return 'C';
				case 13 : return 'D';
				case 14 : return 'E';
				case 15 : return 'F';
			}
		}
		return 'Z';
	}

	public static void main(String args[]){
		int binNum = Integer.parseInt(args[0]);
		BinToHex_51 obj = new BinToHex_51();
		System.out.println(obj.binToHex(binNum));
	}
}