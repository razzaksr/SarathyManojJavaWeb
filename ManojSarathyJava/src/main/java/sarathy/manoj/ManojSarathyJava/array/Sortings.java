package sarathy.manoj.ManojSarathyJava.array;

import java.util.Arrays;

public class Sortings 
{
	public void bubble(int[] hey)
	{
		int third=0;
		for(int time=0;time<hey.length-1;time++)
		{
			for(int point=0;point<hey.length-time-1;point++)
			{
				if(hey[point]>hey[point+1])
				{
					/*
					 * hey[point]+=hey[point+1]; hey[point+1]=hey[point]-hey[point+1];
					 * hey[point]-=hey[point+1];
					 */
					/*
					 * hey[point]^=hey[point+1]; hey[point+1]^=hey[point]; hey[point]^=hey[point+1];
					 */
					third=hey[point];
					hey[point]=hey[point+1];
					hey[point+1]=third;
				}
			}
		}
	}
	
	public void selection(int[] hai)
	{
		for(int select=0;select<hai.length;select++)
		{
			for(int com=0;com<hai.length;com++)
			{
				if(hai[select]>hai[com])
				{
					hai[select]^=hai[com];
					hai[com]^=hai[select];
					hai[select]^=hai[com];
				}
			}
		}
	}
	
	public int sortQuick(int[] each,int start,int end)
	{
		int pivotalData=each[end];
		int pos=start-1;
		
		for(int index=start;index<end;index++)
		{
			if(each[index]<pivotalData)
			{
				pos++;
				int third=each[pos];
				each[pos]=each[index];
				each[index]=third;
			}
		}
		
		int third=each[pos+1];
		each[pos+1]=each[end];
		each[end]=third;
		
		return pos+1;
	}
	
	public void quick(int[] one,int start,int end)
	{
		if(start<end)
		{
			int pivotal=sortQuick(one, start, end);
			quick(one, start, pivotal-1);
			quick(one, pivotal+1, end);
		}
	}
	
	public static void main(String[] args) 
	{
		Sortings sort=new Sortings();
		int[] saySome= {89,12,45,13,44,87,57,65,43,45,90,120};
		System.out.println(Arrays.toString(saySome));
		//sort.bubble(saySome);
		//sort.selection(saySome);
		sort.quick(saySome, 0, saySome.length-1);
		System.out.println("After bubble\n"+Arrays.toString(saySome));
	}
}
