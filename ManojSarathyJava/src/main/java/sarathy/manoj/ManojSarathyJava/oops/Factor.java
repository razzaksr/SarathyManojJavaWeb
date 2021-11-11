package sarathy.manoj.ManojSarathyJava.oops;

public abstract class Factor 
{
	public int[] hai= {12,67,90,122,345,892,1122,9898};
	
	public void list()// non abstract method
	{
		for(int tmp:hai) {
			System.out.println(tmp);
		}
	}
	
	public abstract int search(int data,int start,int end);// abstract method
	
}
