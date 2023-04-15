import java.util.Scanner;

//The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
//human body fat in populations. It is computed by taking the individual's weight (mass) in 
//kilograms and dividing it by the square of their height in meters. i.e.
//Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)
//(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
//Write a java program by using conditional statement to show the category for a given BMI.
//Category BMI
//Less than 18.5 Under weight
//18.5 to 24.9 Normal Weight
//25.0 to 29.9 Overweight
//30.0 or more Obese

class negativeweight extends Exception{
	public String toString () {
		return "Error inputted negative weight";
	}
			
}
class maxweight extends Exception{
	public String toString () {
		return "Error inputted maximum weight";
	}
			
}
class maxheight extends Exception{
	public String toString () {
		return "Error inputted maximum height";
	}
			
}
public class Q2 {
static void condition (double m,double h) throws maxweight,maxheight,negativeweight{
	double bmi=m/(h*h);
	if(m<0) {
		throw new negativeweight();
	}

	else if (m>500){
		throw new maxweight();
	}
	else if (h>5){
		throw new maxheight();
	}
	if (bmi<18.5) {
		System.out.println("You are : Under weight");
	}
	else if(bmi<24.9) {
		System.out.println("You are : Normal weight");
	}
	else if(bmi<29.9) {
		System.out.println("You are : Overweight");
	}
	else if(bmi>=24.9) {
		System.out.println("You are : Obese");
	}
}
	public static void main(String[] args){
		Scanner s=new Scanner (System.in);
		System.out.println("enter your weight");
	  double x=s.nextDouble() ;
	  System.out.println("enter your height");
	  double y=s.nextDouble();
	  try {
		condition(x,y);
	} catch (Exception e) {
	System.out.println(e.toString());	
	}
		

	}

}
