
import java.util.*;
import java.lang.Math;

class Problem1 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int n, j=0, i=0;
		double sx=0, sxx=0, sxy=0, sy=0, z=0, y=0, dc=0, dc1=0;
		
		double[] a = new double[10];
		double[] b = new double[10];

		System.out.println("How many data points do you want to process?");
		n = in.nextInt();

		System.out.println("Enter data  a[]: Distance in micro-meter and \nb[]: Radioactivity");

		for(i=0; i < n; i++)
		{
	        System.out.println("Enter a[" + i + "]");
	        a[i] = in.nextDouble();

	        System.out.println("Enter b[" + i + "]");
	        b[i] = in.nextDouble();
		}
		for (i=0; i<n; i++)
		{
			z=a[i]*a[i];
			sx=sx+z;
			sxx=sxx+z*z;
			y=Math.log(b[i]);
			sy=sy+y;
			sxy=sxy+z*y;
		}

		dc1=((n*sxy)-(sx*sy))/((n*sxx)-(sx*sx)); 
		dc= -1/(4*24*3600*dc1); // 24 hours

		System.out.println("\nEntered data\n");

		for (i=0; i<n; i++)
		{
			System.out.print("a[" + i + "]= \t" + a[i]);
			System.out.println("b[" + i + "]= \t" + b[i]);
		}

		System.out.println("\nCoefficient of diffusion = " + dc + " sq.micrometer/ sec\n\n");


	}
}