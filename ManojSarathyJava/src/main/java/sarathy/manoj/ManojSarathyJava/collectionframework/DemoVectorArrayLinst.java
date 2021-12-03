package sarathy.manoj.ManojSarathyJava.collectionframework;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/*
 * ArrayList	>> asynchronized> 10,15
 * Vector		>> synchronized >> 10,20,30
 * 
 * add
 * addAll
 * add(index,object)
 * 
 * remove(index)
 * remove(object)
 * 
 * contains
 * 
 * get(index)
 * 
 * indexOf(object)
 * 
 * removeAll
 * retainAll
 * 
 */

public class DemoVectorArrayLinst 
{
	public static void main(String[] args) 
	{
		Vector<Double> list1=new Vector<Double>();
		ArrayList<Double> list2=new ArrayList<Double>();
		
		list1.add(4.5);list1.add(14.5);list1.add(9.2);list1.add(89.4);
		list1.add(11.4);list1.add(1,56.7);list1.add(4,34.3);list1.add(11.45);list1.add(71.3);
		
		System.out.println("Vector: "+list1);
		list2.addAll(list1);
		System.out.println("ArrayList: "+list2);
		
		list1.remove(3);
		list2.set(4, 98.5);
		
		System.out.println("Vector: "+list1);
		System.out.println("ArrayList: "+list2);
		
		list2.removeAll(list1);
		
		System.out.println("Vector: "+list1);
		System.out.println("ArrayList: "+list2);
		
		list1.retainAll(list2);
		
		System.out.println("Vector: "+list1);
		System.out.println("ArrayList: "+list2);
	}
}
