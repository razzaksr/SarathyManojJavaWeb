package sarathy.manoj.ManojSarathyJava.collectionframework;

import java.util.LinkedList;

/*
 * LinkedList:
 * add/addLast
 * addFirst
 * add(index,object)
 * 
 * remove/removeFirst
 * removeLast
 * remove(index)
 * remove(object)
 * 
 * get(index)
 * getFirst
 * getLast
 * 
 * set(index,object)// update
 * 
 * indexOf(object)
 * clear()
 */

public class DemoLinkedList 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> link1=new LinkedList<Integer>();
		link1.add(34);link1.add(12);link1.add(98);link1.add(34);
		link1.add(11);link1.add(92);link1.add(34);link1.add(78);
		link1.add(64);link1.addFirst(435);link1.add(3,14);
		
		System.out.println(link1);
		
		link1.remove();
		link1.remove(2);
		link1.removeLast();
		
		System.out.println(link1);
		
		System.out.println(link1.contains(64));
		
		System.out.println(link1.indexOf(435));
		
		System.out.println(link1.getLast());
		System.out.println(link1.getFirst());
		
		link1.set(3, 111111111);
		
		System.out.println(link1);
		
		System.out.println(link1.get(5));
		
		link1.clear();
		
		System.out.println(link1.isEmpty());
	}
}
