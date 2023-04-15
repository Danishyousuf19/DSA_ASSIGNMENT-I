
public class H1 {
	public static void main(String[] args) {
	   int a[][]= {{4, 2, 7},{4, 2, 7}};
	   int b[][]= {{4, 2, 7},{4, 2, 7}};
	 
	    {
	      int x= a.length;
	      int y= a[0].length;
	        int c[][]=new int [x][y];
	        for(int i=0;i<  a.length;i++){
	            for(int j=0;j<a[i].length;j++){
	                c[i][j]= a[i][j]+ b[i][j];
	            }
	        }for(int i=0;i<c.length;i++){
	            for(int j=0;j< c[i].length;j++){
	                System.out.print(c[i][j]+" ");
	                
	            } System.out.println();
	        }
	        
	    }
	}
}
