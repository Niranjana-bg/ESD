/*40. Implement a Java program to compute body mass index (BMI).*/

class BodyMassIndex{
	public static void main(String args[]){
		double weight = 65; //weight in kgs
		double height = 1.75; //height in meters
		double bmi = weight/(height * height);
		System.out.println("BMI : "+bmi);
	}
}