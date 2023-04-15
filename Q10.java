import java.util.Scanner;

//Write a method that returns the sum of all the elements in a specified column in a matrix 
//using the following header:
//public static double sumColumn(double[][] m, int columnIndex)
//Write a java program that reads a 3-by-4 matrix and displays the sum of each column.
public class Q10 {
	static double sumR(double arr[][],int x) {double sum=0;
	
		 for(int j=0;j<arr[x].length;j++) {
			 sum+=arr[x][j];
			 
		 }
	
		return sum;
	}
	static double sumC(double arr[][],int x) {double sum=0;
	
	 for(int j=0;j<arr.length;j++) {
		 sum+=arr[j][x];
		 
	 }

	return sum;
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
	    System.out.println("enter the specific row ");
	    int x=s.nextInt();x-=1;

	    System.out.println("sum of elements of given array at given row : "+sumR(arr,x));
	    System.out.println("enter the specific column ");
	    int y=s.nextInt();
	    y--;
	    System.out.println("sum of elements of given array at given column : "+sumC(arr,y));
	    
//	    for(int i=0;i<a;i++) {
//	    	System.out.println("sum"+sumR(arr,i));
//	    }
//	    
	    
	}
}
