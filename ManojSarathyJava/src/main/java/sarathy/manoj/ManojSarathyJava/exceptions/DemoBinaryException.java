package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Scanner;

public class DemoBinaryException
{
	static double[] items= {0.45,1.89,2.34,6.89,11.4,23.9,24.6,45.9,78.4,89.34,120.8};
	static int chances;
	static Scanner scan=new Scanner(System.in);
	public static int binary(double[] arr, int start, int end, double data)
	{
		try
		{
			if(start<end)
			{
				int mid=(end+start)/2;
				if(arr[mid]==data)
					return mid;
				else if(arr[mid]>data)
					return binary(arr, start, mid, data);
				else
					return binary(arr, mid, end, data);
			}
			else
			{
				throw new BinarySearchException();
			}
		}
		catch(BinarySearchException bin)
		{
			if(chances<3)
			{
				chances++;
				System.out.println("Enter another data: ");
				return binary(arr, start, end, scan.nextDouble());
			}
			else
				return -1;
		}
	}
	public static void main(String[] args) 
	{
		chances=1;
		System.out.println(DemoBinaryException.binary(items, 0, items.length, 0.000));
	}
}
