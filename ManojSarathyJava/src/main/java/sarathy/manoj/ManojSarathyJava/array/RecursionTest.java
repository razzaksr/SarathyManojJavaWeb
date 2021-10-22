package sarathy.manoj.ManojSarathyJava.array;

public class RecursionTest 
{
	public void heyThere(int data)
	{
		if(data<=10)
		{
			System.out.println("Function get called "+data);
			data++;
			heyThere(data);
		}
		return;
	}
	public static void main(String[] args) 
	{
		RecursionTest test=new RecursionTest();
		test.heyThere(1);
	}
}
