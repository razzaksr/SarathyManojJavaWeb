package sarathy.manoj.ManojSarathyJava.oops;

public class CallFactor extends Factor
{
	public static void main(String[] args) 
	{
		//CallFactor call=new CallFactor();
		Factor call=new CallFactor();
		call.list();
		System.out.println(call.search(892, 0, call.hai.length));
		
	}

	public int search(int data,int start,int end) {
		// TODO Auto-generated method stub
		if(start<end)
		{
			int mid=(end+start)/2;
			if(hai[mid]==data)
				return mid;
			else if(hai[mid]>data)
				return search(data, start, mid);
			else if(hai[mid]<data)
				return search(data, mid+1, end);
		}
		return -1;
	}
}
