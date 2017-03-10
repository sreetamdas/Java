
import java.util.Scanner;

class Math
{
	int checkPrime(int x)
	{
		int i=2;
		if((x%i)==0)
			{return 0;}
		else
		{
			i++;
			for (i=2;i<x;i++) 
			{
				if((x%i)==0)
					{return 0;}
				return 1;	
			}
		}
		return 1;
	}

	public static void main(String[] args) 
	{
		Scanner in =  new Scanner(System.in);
		int n,j;
		Math m = new Math();
		System.out.println("Enter the number");
		n = in.nextInt();
		j = m.checkPrime(n);
		if(j!=0)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");
	}
}