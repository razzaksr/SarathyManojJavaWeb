package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Scanner;

public class CommandLineArgument 
{
	public static void main(String[] args) 
	{
		System.out.println(args.length);
		Scanner scan=new Scanner(System.in);
		int yet=0,yets=0;
		try
		{
			yet=Integer.parseInt(args[0]);
			yets=Integer.parseInt(args[1]);
			System.out.println(yet+" "+yets);
			System.out.println(yet/yets);
		}
		catch(NumberFormatException nums)
		{
			try
			{
				System.out.println(nums+"\nOnly numerics");
				yet=scan.nextInt();
				yets=scan.nextInt();
				System.out.println(yet+" "+yets);
				System.out.println(yet/yets);
			}
			catch(ArithmeticException am)
			{
				System.out.println(am+"\ndivident except 0");
				yets=scan.nextInt();
				System.out.println(yet+" "+yets);
				System.out.println(yet/yets);
			}
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"\ndivident except 0");
			yets=scan.nextInt();
			System.out.println(yet+" "+yets);
			System.out.println(yet/yets);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		scan.close();
	}
}
