
import java.util.Scanner;

class Square extends Triangle
{

	public static float s, area, diag;
	Square()
	{
		s=10;
		System.out.println("Constructor called");
	}

	void calculateAreaDiag()
	{
		area=s*s;
		diag=s*1.414f; 
		System.out.println("Area and Diagonal calculated");
	}

	public static void main(String[] args) {

		float a;
		Square sqObj = new Square();

		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Side length of the Square");
		sqObj.s= in.nextFloat();

		sqObj.calculateAreaDiag();

		System.out.println("Area = " + sqObj.area + " and Diagonal Length = " + diag);


	}
}