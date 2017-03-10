
import java.util.Scanner;

class Shapes extends Square
{
	
	public static void main(String[] args) 
	{
		
	Scanner in = new Scanner(System.in);

	char choice= 'y';

	do
	{

	String s;
	System.out.println("Circle\nTriangle\nSquare");
	s=in.nextLine();

	switch(s)
	{
		case "Circle":
			float area1, r, circ1;
			Circle circleobj= new Circle();

			System.out.print("Enter the Radius of the Circle ");
			r = in.nextFloat();
			
			circleobj.setData(r);
			area1=circleobj.calculateArea();
			circ1=circleobj.calculateCirc();
			System.out.println("Area1 = " + area1);
			System.out.println("Circumference = " + circ1);
			break;

			case "Triangle":
			float x,y,z;
			float perimeter;
			Triangle triObj = new Triangle();
			
			System.out.println("Enter the 3 sides of the Triangle in order");
			x=in.nextFloat();
			y=in.nextFloat();
			z=in.nextFloat();

			triObj.setData(x,y,z);
			triObj.checkTriangle();
			perimeter=triObj.findPerimeter();

			System.out.println("Perimeter of the Triangle is " + perimeter);
			break;

		case "Square":
			float a;
			Square sqObj = new Square();

			System.out.println("Enter the Side length of the Square");
			sqObj.s= in.nextFloat();

			sqObj.calculateAreaDiag();

			System.out.println("Area = " + sqObj.area + " and Diagonal Length = " + diag);
			break;
		default:
			break;
		}
		System.out.println("Do you want to Continue?");
		choice= in.next().charAt(0);

		System.out.println("choice = " +choice);
	}while((choice=='y')||(choice=='Y'));
}
}