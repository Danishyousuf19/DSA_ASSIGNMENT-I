import java.util.Scanner;

public class transpose2D {

	public static void main(String[] args) {
		// TRANSPOSE
		Scanner s=new Scanner (System.in);
		System.out.println("enter a no of rows and columns");
		int x=s.nextInt();
		int y=s.nextInt();
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
////transpose
//for(int i=0;i<arr.length;i++) {
//	for(int j=0;j<arr[i].length;j++) {
////	int temp=	arr[j][i];
//		arr[i][j]=arr[j][i];
////		arr[i][j]=temp;
//			}
//}
int transpose[][]=new int [x][y];
for(int i=0;i<arr.length;i++) {
for(int j=0;j<arr[i].length;j++) {

	transpose[i][j]=arr[j][i];

		}
}
//display
System.out.println("transpose");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		System.out.print(transpose[i][j]+" ");
	}
	System.out.println();
}

	}

}
// enter a no of rows and columns
// 3
// 3
// enter a element
// 1
// enter a element
// 2
// enter a element
// 3
// enter a element
// 4
// enter a element
// 5
// enter a element
// 6
// enter a element
// 7
// enter a element
// 8
// enter a element
// 9
// 1 2 3 
// 4 5 6 
// 7 8 9 
// transpose
// 1 4 7 
// 2 5 8 
// 3 6 9 
