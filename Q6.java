import java.util.Scanner;

//Question-6: 
// 
//Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
//method can't use the multiplication, modulus, or division operators, The method signature is 
//as follows.
//public static boolean isOdd(int n)
//Sample Run:
//Enter a number 37
//37 is odd: true
public class Q6 {
	public static boolean isOdd(int n) {
	    if ((n & 1) == 1) {
	        return true;
	    } else {
	        return false;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number");
	  int x=s.nextInt();
	  if(isOdd(x)) {
	  System.out.println("yes it is odd");
	}
	else {
		System.out.println("no it is not");
	}
	}
}
