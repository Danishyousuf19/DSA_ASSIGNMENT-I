public class Q4 {
    
    public static void main(String[] args) {
        String input = "car";
        generateStrings("", input);
    }
    
    private static void generateStrings(String prefix, String remaining) {
        int n = remaining.length();System.err.println(n);System.err.println(remaining);
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
