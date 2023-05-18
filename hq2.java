import java.util.Scanner;

/*Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to 
initialize the instance variables of the class. Another instance method display ( ) to display the book 
information. A person purchase 5 different books. Display the book details which has the maximum 
price*/

class book{
	String name;
	int price;
	int edition;
	void bname() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book name");
	  name=sc.next();
	}
	void bprice() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book price");
	  price=sc.nextInt();
	}
	void bedition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book edition");
	  edition=sc.nextInt();
	}
	void display()
	{
		System.out.println("book name = "+name);
		System.out.println("book edition = "+edition);
		System.out.println("book price = "+price);
	}
	
}
public class hq2 {

	public static void main(String[] args) {
		book b[]=new book[5];
		int max=-1;
		int flag=-1;
		for (int i=0;i<5;i++) {
			b[i]=new book();
			b[i].bname();
			b[i].bedition();
			b[i].bprice();
			if(b[i].price>=max) {
				max=b[i].price;
				flag=i;
			}
		}
		System.out.println("imformation of book with highest price is below ");
		b[flag].display();

	}

}
