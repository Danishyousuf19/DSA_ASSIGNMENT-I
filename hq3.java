//Write a Java code that would represent Distance object (meters, centimetres) using classes. The class 
//definition include a parameterized constructor, display ( ) to display the instance variables, sum 
//(Distance, Distance) to add two distances. Now write a main function that creates a couple of Distance 
//objects and demonstrates the addition of two distances. 

class distance{
	int meter;int centimeters;
	distance(int meter,int centimeters){
		this.centimeters=centimeters;
		this.meter=meter;
	}
	void display() {
		System.out.println("meters = "+meter+"\ncentimeters = "+centimeters);
		
	}
	public distance  sum (distance a,distance b) {
		distance c=new distance(0,0);
		c.meter=a.meter+b.meter;
		c.centimeters=a.centimeters+b.centimeters;
		return c;
		
	}
}

public class hq3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		distance x=new distance (1, 1);
		x.display();
		distance x1=new distance (1, 1);
		x1.display();
		distance x2=new distance (0,0);
		System.out.print("sum of two distances = ");
		
		x2=x2.sum(x1, x);
		
		x2.display();
		

	}

}
