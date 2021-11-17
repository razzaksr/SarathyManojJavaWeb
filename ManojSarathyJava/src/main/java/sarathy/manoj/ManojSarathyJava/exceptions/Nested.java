package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int[] ratings= {1,2,3,4,5,6,7,8,9,0};
		
		double current=0.0,increment=0;int pos=0;
		try
		{
			System.out.println("Tell us current salary: ");
			current=scan.nextDouble();
			System.out.println("Select rating: ");
			pos=scan.nextInt();
			increment=(current*ratings[pos])/100;
			current+=increment;
			System.out.println(current+" is your updated salary");
		}
		catch(InputMismatchException ins)
		{
			Scanner scans=new Scanner(System.in);
			try
			{
				System.out.println(ins+"\nEnter only numerics");
				System.out.println("Tell us current salary: ");
				current=scans.nextDouble();
				System.out.println("Select rating: ");
				pos=scans.nextInt();
				increment=(current*ratings[pos])/100;
				current+=increment;
				System.out.println(current+" is your updated salary");
			}
			catch(ArrayIndexOutOfBoundsException ar)
			{
				System.out.println(ar+"\nratings value between 0 and "+(ratings.length-1));
				System.out.println("Select rating: ");
				pos=scans.nextInt();
				increment=(current*ratings[pos])/100;
				current+=increment;
				System.out.println(current+" is your updated salary");
			}
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(ar+"\nratings value between 0 and "+(ratings.length-1));
			System.out.println("Select rating: ");
			pos=scan.nextInt();
			increment=(current*ratings[pos])/100;
			current+=increment;
			System.out.println(current+" is your updated salary");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Have a happy Hike");
		}
	}
}
