import java.util.Scanner;

//Enter number of Row and Columns of 2D-Array: 3 3
//Enter elements of 2D-Array: 1 2 3 2 3 4 3 4 5
//The elements of 2D array are:
//1 2 3
//2 3 4
//3 4 5
//The sum of elements of the 2D-Array is 27

public class Q8 {
static int arrsum(int arr[][]) {int sum=0;
for(int i=0;i<arr.length;i++) {
	 for(int j=0;j<arr[i].length;j++) {
		 sum+=arr[i][j];
		 
	 }
}
	return sum;
}
public static void returnarr(int arr[][]) {
	for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
			 
		 }System.out.println();
	}
}

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter  number of rows and columns");
    int a=s.nextInt(),b=s.nextInt();
 
    int arr[][]=new int[a][b];
    for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[i].length;j++) {	
    	 System.out.println(" enter element of row "+(i+1)+" and column "+(j+1));
    	 arr[i][j]=s.nextInt();
    }
}
    returnarr(arr);
    System.out.println("sum of elements of given array : "+arrsum(arr));
	}

}
