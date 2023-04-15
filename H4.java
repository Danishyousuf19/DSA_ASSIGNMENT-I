import java.util.Scanner;

//Write a method to add two matrices. The header of the method is as follows:
//public static double[][] addMatrix(double[][] a, double[][] b)
//In order to be added, the two matrices must have the same dimensions and the same or
//compatible types of elements
public class H4 {
	public static double [][]addMatrix(double[][] a, double[][] b){
		int x=a.length,y=a[x-1].length;
		double[][] sum=new double[x][y];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number of rows and columns");
		int d=s.nextInt(),e=s.nextInt();
		double a[][]=new double [d][e];
		
		for (int i=0;i<d;i++) {
			for (int j=0;j<e;j++) {
			System.out.println("enter element of array A");
			a[i][j]=s.nextInt();		
		}}
		System.out.println("entering new arry");
		double b[][]=new double [d][e];
		for (int i=0;i<d;i++) {
			for (int j=0;j<e;j++) {
			System.out.println("enter element of array b");
			b[i][j]=s.nextInt();		
		}}
		System.out.println("sum of the matrixs is given below");
		double sum[][]=addMatrix(a,b);
	
		for(int i=0;i<sum.length;i++) {
			for(int j=0;j<sum[i].length;j++) {	

				System.out.print(sum[i][j]+" ");
				
		}
			System.out.println();
		}
	}

}
