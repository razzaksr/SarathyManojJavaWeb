package sarathy.manoj.ManojSarathyJava.array;

import java.util.Arrays;

public class OperateMulti 
{
	
	public static void list(double[][] hey)
	{
		for(int index=0;index<hey.length;index++)
		{
			for(int pos=0;pos<hey[index].length;pos++)
			{
				System.out.print(hey[index][pos]+" ");
			}
			System.out.println();
		}
	}
	
	public static int search(double[] say,int start,int end,double users)
	{
		//System.out.println(Arrays.toString(say));
		if(end>start)
		{
			int mid=(end+start)/2;
			if(say[mid]==users)
				return mid;
			else if(say[mid]>users)
				return search(say, start, mid, users);
			else
				return search(say, mid+1, end, users);
		}
		else
			return -1;
	}
	
	public static void recur(double[][] yet,int row,double data)
	{
		if(row<yet.length)
		{
			Arrays.sort(yet[row]);
			int pos=OperateMulti.search(yet[row], 0, yet[row].length, data);
			if(pos!=-1)
			{
				System.out.println(data+" found @ row "+row+" index "+pos);
				return;
			}
			else
			{
				row++;
				OperateMulti.recur(yet, row, data);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		double[][] flats= new double[3][];
		flats[0]= new double[] {9.2,4.5,12.5,1.9};
		flats[1]= new double[] {8.9,3.4,12.5,9.2,5.6,8.1};
		flats[2]= new double[] {4.5,7.2,6.3,19.6,4.5};
		//OperateMulti.list(flats);
		OperateMulti.recur(flats, 0, 9.2);
	}
}
