
import java.util.Scanner;
import java.util.Random;
import java.lang.*;

class Game
{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		TicTacToe game = new TicTacToe();

		game.gameplay();

	}
}

class TicTacToe
{

	Scanner in = new Scanner(System.in);

	int[][] tic = new int[3][3];

	Random rand = new Random();
	TicTacToe()
	{
		System.out.println("Initialised");
		for(int i=0;i<3;i++)
	 		for(int j=0;j<3;j++)
	 			tic[i][j] = 0;
	}

int check1()
{ 
	 int sum1, sum2, sum3, sum4;
	 sum1 = sum2 = sum3 = sum4 = 0;
	 int a,b,c,d,i,j,k;
	for (i = 0; i < 3; i++)
	{
		sum1 = sum2 = 0;
		for (j = 0; j < 3; j++)
		{
			sum1 += tic[i][j];		//row sum
			sum2 += tic[j][i];		//Column sum
            if(i == j)
           		sum3 += tic[i][j];
            if((i+j) == 2)
            	sum4 += tic[i][j];
            	

	 	}
		
		if(check2(sum1) == 3)
		{
			System.out.println("You WIN!!! :P");
			System.exit(0);	// "a", 		WIN
		}

		if(check2(sum2) == -3)
	    {
	    	System.out.println("You LOST, Sucker!");
	    	System.exit(0);		// "b", 		WIN
	    }

	    if(check2(sum1) == -3)
		{
			System.out.println("You LOST, Sucker!");
			System.exit(0);		// "a", 		WIN
		}

		if(check2(sum2) == 3)
	    {
	    	System.out.println("You WIN!!! :P");
	    	System.exit(0);		// "b", 		WIN
	    }

		if(check2(sum1) == 2)
			return i;					//Row
	  
	    if (check2(sum2) == -2)
			return (i+3);	
		
		if(check2(sum1) == -2)
			return i;					//Row
	    
	    if (check2(sum2) == 2)
			return (i+3);	 			//Column
 		 		
	}
	
	if(check2(sum3) == 3)
	{
		System.out.println("You WIN!!! :P");
		System.exit(0);		// "a", 		WIN
	}

	if(check2(sum4) == -3)
	{
		System.out.println("You LOST, Sucker!");
	   	System.exit(0);		// "b", 		WIN
	}

	if(check2(sum3) == -3)
	{
		System.out.println("You LOST, Sucker!");
		System.exit(0);		// "a", 		WIN
	}

	if(check2(sum4) == 3)
	{
		System.out.println("You WIN!!! :P");
	   	System.exit(0);		// "b", 		WIN
	}

	if(check2(sum3) == 2)
	{
		int n = 8;
		return n;					//Row
	}
	
	if (check2(sum4) == -2)
	{
		int n = 9;
		return n;
	}
	
	if(check2(sum3) == -2)
	{
		int n = 8;
		return n;					//Row
	}
	
	if (check2(sum4) == 2)
	{
		int n = 9;
		return n;
	}

	int n = -1;
	return n;						//random
}

int check2(int x)
{
	if(x == 2)
		return 2;
	else if(x == 3)
		return 3;
	else if(x == -2)
		return -2;
	else if(x == -3)
		return -3;
	else
		return 0;

}

void fill(int m, int n)			
{
	switch(m)
	{
		case 7: tic[0][0] = n; break;
		case 8: tic[0][1] = n; break;
		case 9: tic[0][2] = n; break;
		case 4: tic[1][0] = n; break;
		case 5: tic[1][1] = n; break;
		case 6: tic[1][2] = n; break;
		case 1: tic[2][0] = n; break;
		case 2: tic[2][1] = n; break;
		case 3: tic[2][2] = n; break;
		default: break;
	}

}

void player()			
{
	int m;
	System.out.println("Enter your move");

	m = in.nextInt();
	fill(m, 1);
	display();
	int win = check1();
}

void AI_Turn()		
{
	int x, y;

	int m = check1();

	System.out.print(m);

	//again: {

	do
	{

	if(m >= 0)
	{
		if((m > 2) && (m < 8))
		{
			y = m-3;
			x = rand.nextInt(3);			
		}
		else if(m <= 2)
		{
			x = m;
			y = rand.nextInt(3);
		}
		else if(m == 8)
		{
			x = rand.nextInt(3);
			y = x; 
		}
		else
		{
			x = rand.nextInt(3);
			y = 2 - x;
		}
	}
	else
	{
		x = rand.nextInt(3);
		y = rand.nextInt(3);
	}
	}while(tic[x][y] != 0);


	if(tic[x][y] == 0)
	{
		System.out.println(" " + x + " " + y);
		fill( (7-(3*x) + y), -1);
	}

	//else
	
	
	display();
	int win = check1();

	
}

void display()
{
	 for( int i = 0; i< 3;i++)
	 	{
	 		System.out.println("\t\t");
		 for (int j= 0; j < 3; ++j)
	 	{
	 		if( tic[i][j] == 1)		System.out.print("X");
	 		else if(tic[i][j] == -1)	System.out.print("O");
	 		else System.out.print(" ");
	 		if(j != 2)
	 		System.out.print(" | ");

	 	}
	 	System.out.println("");
	 	if(i != 2)
	 	System.out.println("---------");
	 }
	 System.out.print("\n\n\t----------------------------\n\n\n");
}

void gameplay()
{
	for (int i = 0; i < 9; ++i)
	{
		player();
		AI_Turn();
	}
}





}