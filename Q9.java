import java.util.Scanner;
//Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
//values using the following header:
//public static double sumMajorDiagonal(double[][] m)
//Write a java program that reads a 4-by-4 matrix and displays the sum of all its elements on the
//major diagonal. 

public class Q9 {

	static double arrsum(double arr[][]) {double sum=0;
		double s=0;			      
	for(int i=0;i<arr.length;i++) {
		int n=arr.length;
		 for(int j=0;j<arr[i].length;j++) {
		if(i==j)	 sum+=arr[i][j];
		if(i+j==n){
			s+=arr[i][j];
		 }
	}
		if(s>sum)
		return s;
return sum
	}

		public static void main(String[] args) {
			Scanner s=new Scanner (System.in);
			System.out.println("enter  number of rows and columns");
	    int a=s.nextInt(),b=s.nextInt();
	 
	  double arr[][]=new double[a][b];
	    for(int i=0;i<arr.length;i++) {
	    	 for(int j=0;j<arr[i].length;j++) {	
	    	 System.out.println(" enter element of row "+(i+1)+" and column "+(j+1));
	    	 arr[i][j]=s.nextDouble();
	    }
	}
	    System.out.println("sum of elements of given array : "+arrsum(arr));
	}

}
