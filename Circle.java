
import java.util.Scanner;

class Circle{
	
	float pi= 3.14f;
	float radius;
	void setData(float rad)
	{
		radius=rad;
	}
	float calculateArea()
	{

			float area = pi*radius*radius;
			return area;
	}
	float calculateCirc()
	{
		float circ = 2*pi*radius;
		return circ;
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		float area1, r, circ1;
		Circle circleobj= new Circle();

		System.out.print("Enter the Radius of the Circle ");
		r = in.nextFloat();
		
		circleobj.setData(r);
		area1=circleobj.calculateArea();
		circ1=circleobj.calculateCirc();
		System.out.println("Area1 = " + area1);
		System.out.println("Circumference = " + circ1);
	}

}