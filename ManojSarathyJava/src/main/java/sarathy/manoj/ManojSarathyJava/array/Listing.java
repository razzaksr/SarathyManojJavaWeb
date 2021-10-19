package sarathy.manoj.ManojSarathyJava.array;

import java.util.Arrays;
import java.util.Scanner;

public class Listing 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		double[] tv=new double[10];
		
		// insertion O(n) 
		for(int index=0;index<tv.length;index++)
		{
			System.out.println("Set the tv size for the "+index);
			tv[index]=scan.nextDouble();
		}
		
		//list O(n)
		for(double tmp:tv)
		{
			System.out.println(tmp);
		}
		
		//list O(n)
		for(int point=0;point<tv.length;point++)
		{
			System.out.println(tv[point]);
		}
		
		//list O(1)
		System.out.println(Arrays.toString(tv));
		
		scan.close();
	}
}
