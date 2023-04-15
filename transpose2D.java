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
