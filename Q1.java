import java.util.Scanner;

//Question-1:
//Write a Java program that can take a positive integer greater than 2 as input and write out the
//number of times one must repeatedly divide this number by 2 before getting a value less
//than 2.
//Sample Run:
//The positive integer greater than 2 from command line argument 
//is 67.
//The number of times one must repeatedly divide this number by 2 
//before getting a value less than 2 is 5.
class negativeException extends Exception{
	public String toString () {
		return "Error inputted negative number";
	}
			
}
public class Q1 {
public static int divider(int a)throws negativeException  {
	int count =0;
	if(a<0) {
		throw new  negativeException();
	}
	while (a>=2) {
		a/=2;
		count ++;
	}
	System.out.print("number of steps : ");
	return count;
}
	
	
	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter a number");
  int x=s.nextInt();
  try {
	System.out.println(divider(x));
} catch (negativeException e) {
	System.out.println(e);
}
	}

}
