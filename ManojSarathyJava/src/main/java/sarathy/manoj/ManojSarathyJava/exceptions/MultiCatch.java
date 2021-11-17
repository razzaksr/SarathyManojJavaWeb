package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch 
{
	public static void bubble(int[] yet)
	{
		for(int index=0;index<yet.length-1;index++)
		{
			for(int pos=0;pos<yet.length-index-1;pos++)
			{
				if(yet[pos]>yet[pos+1])
				{
					yet[pos+1]^=yet[pos];
					yet[pos]^=yet[pos+1];
					yet[pos+1]^=yet[pos];
				}
			}
		}
	}
	public static void selection(int[] hai)
	{
		for(int hold=0;hold<hai.length;hold++)
		{
			for(int com=hold+1;com<hai.length;com++)
			{
				if(hai[hold]>hai[com])
				{
					hai[hold]^=hai[com];
					hai[com]^=hai[hold];
					hai[hold]^=hai[com];
				}
			}
		}
	}
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
		
		
		/*
		 * System.out.println("Tell us sorting algorithm: "); String alg=scan.next();
		 * if(alg.equalsIgnoreCase("bubble")) { MultiCatch.bubble(items); } else
		 * if(alg.equalsIgnoreCase("selection")) { MultiCatch.selection(items); }
		 * System.out.println(Arrays.toString(items));
		 */
		
		
		scan.close();
	}
}
