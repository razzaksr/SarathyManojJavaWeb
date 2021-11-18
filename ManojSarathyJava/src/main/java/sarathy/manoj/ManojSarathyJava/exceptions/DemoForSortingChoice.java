package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class DemoForSortingChoice 
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
		int[] items= {90,45,34,124,78,234,0,24,134,8,24,10,98,38,9,13,34,87,19,7};
		try
		{
			System.out.println("Tell us sorting algorithm: "); 
			String alg=scan.next();
			if(alg.equalsIgnoreCase("bubble")) 
			{ 
				DemoForSortingChoice.bubble(items);
				System.out.println(Arrays.toString(items));
			} 
			else if(alg.equalsIgnoreCase("selection")) 
			{ 
				DemoForSortingChoice.selection(items); 
				System.out.println(Arrays.toString(items));
			}
			else
			{
				throw new SortingException();
			}
		}
		catch(SortingException sort)
		{
			System.out.println(sort);
			DemoForSortingChoice.main(args);
		}
		finally
		{
			scan.close();
		}
		
	}
}
