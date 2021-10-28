package sarathy.manoj.ManojSarathyJava.array;

import java.util.Scanner;

public class Multidimen 
{
	static Scanner scan=new Scanner(System.in);
	public static void insertion(String[][] hai)
	{
		for(int floor=0;floor<hai.length;floor++)
		{
			for(int house=0;house<hai[floor].length;house++)
			{
				System.out.println("Tell us Tenant name @ "+floor+" "+house);
				hai[floor][house]=scan.next();
			}
		}
	}
	
	public static void list(String[][] yet)
	{
		for(String[] floor:yet)
		{
			for(String each:floor)
			{
				System.out.print(each+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		String[][] term=new String[2][4];
		Multidimen.insertion(term);
		Multidimen.list(term);
		
		String[][] hey= {{"Razak","Sabari"},{"Annamalai","Vinoth","Victor"},{"Parasuram"}};
		Multidimen.list(hey);
	}
}
