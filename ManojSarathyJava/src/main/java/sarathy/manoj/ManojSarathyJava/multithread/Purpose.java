package sarathy.manoj.ManojSarathyJava.multithread;

import java.util.Scanner;

public class Purpose
{
	public static void main(String[] args) 
	{
		Manage manage=new Manage();
		//manage.search("surya");
		Thread t1=new Thread(manage,"Sarathy");
		
		Thread t2=new Thread(manage,"Manoj");
		
		Thread t3=new Thread(manage,"Kumar");
		
		Thread t4=new Thread(manage,"Vijay");
		
		t1.start();t2.start();t3.start();t4.start();
		//t1.run();t2.run();t3.run();t4.run();
	}
}

class Manage implements Runnable//extends Thread
{
	private String[] crew= {"Venkat","Suresh","Praveen","Yuvan","STR","Surya","Richard"};
	private Scanner scan=new Scanner(System.in);
	public void search(String name)
	{
		for(int index=0;index<crew.length;index++)
		{
			if(crew[index].equalsIgnoreCase(name)) {
				System.out.println(name+" available @ "+index);
				return;
			}
		}
		System.out.println(name+" doesn't found anywhere");
	}
	
	@Override
	synchronized public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" Tell us name to find in crew: ");
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		search(scan.next());
	}
	
}