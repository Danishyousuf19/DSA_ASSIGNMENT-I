public class Q4 {
    //generate all possible combinations of chracters +++++ car
    public static void main(String[] args) {
        String input = "car";
       // generateStrings("", input);
        easway(inputed);
    }
     public  static void easway(String d) {
    	
    	for(int i=0;i<3;i++) {
    		for(int j=0;j<3;j++) {
    			for(int k=0;k<3;k++) {
    				if(i!=j&&i!=k&&k!=j) {
    					System.out.println(d.charAt(i)+""+d.charAt(j)+""+d.charAt(k));
    				}	
    			}
    		}
    		
    	}
    private static void generateStrings(String prefix, String remaining) {
        int n = remaining.length();
        //System.err.println(n);System.err.println(remaining);
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generateStrings(prefix + remaining.charAt(i), 
                                remaining.substring(0, i) + remaining.substring(i+1, n));
            }
        }
    }
}
