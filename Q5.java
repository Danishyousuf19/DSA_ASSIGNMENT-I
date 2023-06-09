import java.util.Scanner;

//Write a java method to calculate the sum of digits of a given number until the number is a 
//single digit. The method signature is as follows.
//public static int sum_Of_Digits(int n)
//Example:
// Let n = 9294
// Sum = 9 + 2 + 9 + 4 = 24
// Sum = 2 + 4 = 6
class belowzero extends Exception{
	public String toString () {
		return "Error inputted negative number";
	}
		
}
public class Q5 {
public static int onedigitsum(int x)throws belowzero {
	if(x<0) {
		throw new belowzero();
	}
	int sum=0;
	while(x>9) {
		while(x>0) {
			sum+=x%10;
			x/=10;
		}
		x=sum;
		sum=0;
	}
	return x;
}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number");
	  int x=s.nextInt();
	  try {
		System.out.println( onedigitsum(x));
	} catch (belowzero e) {
		System.err.println(e);
	}

	}

}
