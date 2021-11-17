package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Scanner;

public class InFiniteChances 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int yet=0,yets=0;
		try
		{
			System.out.println("Enter the two numbers: ");
			yet=scan.nextInt();
			yets=scan.nextInt();
			System.out.println(yet+" "+yets);
			System.out.println(yet/yets);
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"\nEnter except 0");
			InFiniteChances.main(args);
		}
	}
}
