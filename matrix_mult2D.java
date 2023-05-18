import java.util.Scanner;

//simple mult\\\
class simplemult{
	void simple (int k,int given[][],int x,int y){
		
		int arr[][]=new int [x][y];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {	
		arr[i][j]=k*given[i][j];
  System.out.print(arr[i][j]+" ");
	}System.out.println();
}

	}
	
}


public class matrix_mult2D {

	public static void main(String[] args) {
		//matrix multi;
		//matrix  1
		Scanner s=new Scanner (System.in);
		System.out.println("enter a no of rowsof matrix 1 and columns of matrix 1 and 2  ");
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println("enter columns of matrix  2");
		int z=s.nextInt();
		int arr[][]=new int [x][y];
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.println("enter a element");
		arr[i][j]=s.nextInt();
	}
}
//display
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}

//matrix 2

int arr2[][]=new int [y][z];
for(int i=0;i<arr2.length;i++) {
for(int j=0;j<arr2[i].length;j++) {
System.out.println("enter a element");
arr2[i][j]=s.nextInt();
}
}
//display
for(int i=0;i<arr2.length;i++) {
	for(int j=0;j<arr2[i].length;j++) {
		System.out.print(arr2[i][j]+" ");
	}
	System.out.println();
}
//matrix mult

     int res[][]=new int [x][z];
for(int i=0;i<arr.length;i++) {
	
   for(int j=0;j<arr2[i].length;j++) {
	   
	  for(int k=0;k<arr[i].length;k++) {
		res[i][j]+=arr[i][k]*arr2[k][j];
	}
	  System.out.print(res[i][j]+" ");
   }System.out.println();
 }

//simple

simplemult obj=new simplemult();
System.out.println("enter pre mult");
int k=s.nextInt();
obj.simple(k,arr,x,y);


	}

}
// enter a no of rowsof matrix 1 and columns of matrix 1 and 2  
// 2
// 2
// enter columns of matrix  2
// 2
// enter a element
// 6
// enter a element
// 8
// enter a element
// 3
// enter a element
// 6
// display
// 6 8 
// 3 6 
// enter a element
// 7
// enter a element
// 9
// enter a element
// 4
// enter a element
// 3
// display
// 7 9 
// 4 3 
// mateix multiplication
// 74 78 
// 45 45 
// enter pre mult
// 0
// simple multiply of matrix 1
// 0 0 
// 0 0 

