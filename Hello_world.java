import java.util.Scanner;



class Hello_world{

	public static void main(String[] args)
	{


	int a;
	float b;
	String s;

	Scanner in = new Scanner(System.in);

	System.out.println("Enter a String");
	s= in.nextLine();
	System.out.println("You entered the String " +s);

	System.out.println("Enter an Integer");
	a=in.nextInt();
	System.out.println("You entered the Integer " +a);

	System.out.println("\n\nHello World!");

	}
};