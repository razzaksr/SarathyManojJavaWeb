package sarathy.manoj.ManojSarathyJava.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
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
		
		List<String> obj=new ArrayList<String>();
		obj.add("Dwayne");obj.add("Jhonson");obj.add("Scarlet");
		obj.add("Evans");obj.add("Hiddlson");obj.add("Holland");
		obj.add("Holland");obj.add("Jhonson");obj.add("Pratt");
		obj.add("Jhonson");
		
		System.out.println(obj);
		
		Collections.reverse(obj);
		
		System.out.println(obj);
		
		Collections.sort(obj);
		
		System.out.println(obj);
		
		Collections.replaceAll(obj, "Jhonson", "Dwayne");
		
		System.out.println(obj);
		
		System.out.println(Collections.min(obj));
		
		System.out.println(Collections.max(obj));
	}
}
