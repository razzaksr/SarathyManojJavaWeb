package sarathy.manoj.ManojSarathyJava.collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class Purpose 
{
	public static void main(String[] args) 
	{
		Stack hai=new Stack();// generic
		hai.push("Manoj");hai.push(false);
		hai.push('R');hai.push(12);hai.push(5.6);
		hai.push(8765456789L);
		
		System.out.println(hai);
		
		Iterator it=hai.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(hai.empty());
		
		System.out.println(hai.pop());
		hai.pop();
		
		System.out.println("Top element: "+hai.peek());
		
		System.out.println(hai.search("Manoj"));
		
		Stack<String> hey=new Stack<String>();// non generic
		hey.push("90");
		System.out.println(hey);
	}
}
