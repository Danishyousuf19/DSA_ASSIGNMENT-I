/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a b = c.” ∗/
public class H1 {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter 3 no.s");
int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
if(a+b==c) {
	System.out.println("a+b=c can be used");
}
else if(b-c==a) {
	System.out.println("b-c=a can be used");
}
else if(a*b==c) {
	System.out.println("a*b=c can be used");
}
	}
}
