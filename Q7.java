import java.util.Scanner;

//Write a java program to find the maximum and minimum and how many times they both occur
//in an array of n elements. Find out the positions where the maximum first occurs and the
//minimum last occurs.
//Sample Run:
//Enter number of elements of Array: 5
//Enter elements of the array: 12 14 12 14 13
//Maximum element of Array is 14 and occurs 2 times.
//Minimum element of Array is 12 and occurs 2 times.
//First occurrence of maximum element is at position 2.
//Last occurrence of minimum element is at position 3.
public class Q7 {
	public static void arraymax(int arr[]) {
		int max =Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int count =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				count++;
			}
			
		}int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				c=i;break;
			}
			
		}
		System.out.println("maximum element = "+max);
		System.out.println("it occurs "+count +" time/s");
		System.out.println("first occurance of this element is at index "+c+" from first");
		}
		public static void arraymin(int arr[]) {
			int min =Integer.MAX_VALUE;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<min) {
					min=arr[i];
				}
			}
			int count =0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==min) {
					count++;
				}
				
			}int c=0;
			for(int i=arr.length-1;i>0;i--) {
				if(arr[i]==min) {
					c=i;break;
				}
				
			}
	System.out.println("minimum element = "+min);
	System.out.println("it occurs "+count +" time/s");
	System.out.println("first occurance of this element is at index "+c+" from last");
}
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter size of array");
		int x=s.nextInt();
		int arr[]=new int[x];
		for (int i=0;i<arr.length;i++) {
			System.out.println("enter element of array");
			arr[i]=s.nextInt();		
		}
		arraymax(arr);
		arraymin(arr);

	}

}
