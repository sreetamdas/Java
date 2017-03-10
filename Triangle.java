
import java.util.Scanner;

class Triangle extends Circle
{
	float a, b, c;
	
	void setData(float s1, float s2, float s3)
	{
				a=s1;
				b=s2;
				c=s3;
	}

	void checkTriangle()
	{
		if ((a==b)||(b==c)||(a==c))
		{
			if((a==b)&&(b==c))
				System.out.println("Equilateral Triangle");
			else
				System.out.println("Isosceles Triangle");
		}
		else
			System.out.println("Scalene Triangle");
		if ((c*c)==((a*a)+(b*b)))
			System.out.println("Right Angled Triangle");
	} 
	
	float findPerimeter()
	{
		float peri;
		peri=a+b+c;
		return peri;
	}

	public static void main(String[] args) 
	{
		float x,y,z;
		float perimeter;
		Triangle triObj = new Triangle();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the 3 sides of the Triangle in order");
		x=in.nextFloat();
		y=in.nextFloat();
		z=in.nextFloat();

		triObj.setData(x,y,z);
		triObj.checkTriangle();
		perimeter=triObj.findPerimeter();

		System.out.println("Perimeter of the Triangle is " + perimeter);

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