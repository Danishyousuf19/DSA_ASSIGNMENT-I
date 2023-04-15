import java.util.Scanner;

//Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the matrix, 
//and finds the first row and column with the most 1s.
public class H5 {
public static int [][] random (int s,int d){
	int matrix [][]=new int [s][d];
	for(int i=0;i<s;i++) {
		for(int j=0;j<d;j++) {
			matrix[i][j]=(int )(Math.random()*2);
		}
	}
	return matrix;
}
static void maxr (int arr[][]) {
	int max=-1;
	int row=-1;
	
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr[i].length;j++) {
			if(arr[i][j]==1) {
				count++;
				
			}
			if(count>max) {
			max=count;
			row=i;
			}
			}
	}
	System.out.println("row of maximum 1s = "+row);
	

}
static void maxc (int arr[][]) {
	int max=-1;
	int col=-1;
	
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr[i].length;j++) {
			if(arr[j][i]==1) {
				count++;
				
			}
			if(count>max) {
			max=count;
			col=i;
			}
			}
	}
	System.out.println("column of maximum 1s = "+col);
	

}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number of rows and columns");
		int d=s.nextInt(),e=s.nextInt();
		
		int a[][]=random(d,e);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {	

				System.out.print(a[i][j]+" ");
				
		}
			System.out.println();
		}
		maxr(a);
		maxc(a);
	}
}
