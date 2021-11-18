package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Scanner;

public class FiniteChances 
{
	public static void main(String[] args) 
	{
		Elements ele=new Elements();
		System.out.println(ele.getOne(1));
	}
}


class Elements
{
	private double[] items= {0.45,1.89,2.34,6.89,11.4,23.9,24.6,45.9,78.4,89.34,120.8};
	Scanner scan=new Scanner(System.in);

	public double[] getItems() {
		return items;
	}

	public void setItems(double[] items) {
		this.items = items;
	}
	public double getOne(int chances)
	{
		System.out.println("Enter the index to get data: ");
		int index=scan.nextInt();
		try
		{
			return items[index];
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			if(chances<3)
			{
				chances++;
				return getOne(chances);
			}
			else
				return 0.0;
		}
	}
}