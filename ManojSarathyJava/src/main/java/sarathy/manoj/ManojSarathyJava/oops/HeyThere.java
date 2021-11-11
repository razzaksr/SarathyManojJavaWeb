package sarathy.manoj.ManojSarathyJava.oops;

import java.util.Arrays;

public class HeyThere 
{
	private double[] hey= {1.2,9.2,89.4,8.1,7.2,12.4,0.01,4.5};
	public void show()
	{
		for(double tmp:hey)
		{
			System.out.println(tmp);
		}
	}
	void search(double data)
	{
		for(int index=0;index<hey.length;index++)
		{
			if(hey[index]==data)
			{
				System.out.println(data+" found @ "+index);
				return;
			}
		}
		System.out.println(data+" isn't found anywhere");
	}
	protected void sort()
	{
		Arrays.sort(hey);
	}
}
