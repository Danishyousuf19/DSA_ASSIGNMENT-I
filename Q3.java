import java.util.Scanner;

//Write a java program to check whether a number is a spy number or not. 
//Example:
//N = 132
//Sum of digit of N = 1 + 3 + 2 = 6
//Product of digit of N = 1 × 3 × 2 = 6
//So, 132 is a spy number.
class zero extends Exception{
	public String toString () {
		return "yes it is a spy number";
	}
		
}
public class Q3 {
	
public static void spy(int x)throws zero {
	if (x==0) {
		throw new zero();
	}
	int sum=0,mult =1;
	boolean b=false;
	while(x>0) {
	sum+=x%10;
	mult*=x%10;	
	x/=10;
	}
	if(sum==mult) {
	b= true;
	}
	else {
		b=false;
	}
	if(b) {
		System.out.println("yes it is a spy numbre");
	}
	else {
		System.out.println("no it is not a spy number");
}	
}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number");
	  int y=s.nextInt();
		try {
			spy(y);
		}
		catch(zero e) {
			System.out.println(e.toString());
		}

	}

}
