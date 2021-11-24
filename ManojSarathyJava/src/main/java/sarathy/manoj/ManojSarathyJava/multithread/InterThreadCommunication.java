package sarathy.manoj.ManojSarathyJava.multithread;

import java.util.Random;
import java.util.Scanner;

public class InterThreadCommunication 
{
	public static void main(String[] args) 
	{
		Counters counter=new Counters();
		Snows snow=new Snows(counter);
		Thread t1=new Thread(snow,"Sarathy");
		Thread t2=new Thread(counter,"Manoj");
		t1.start();t2.start();
	}
}
class Snows implements Runnable
{
	public Snows() {}
	Counters obj;
	public Snows(Counters count)
	{
		obj=count;
	}
	Random ran=new Random();
	@Override
	public void run() 
	{
		synchronized (obj.scan) 
		{
			System.out.println(Thread.currentThread().getName()+" gonna helps ");
			if(obj.fare<200)
			{
				obj.fare=200;
				System.out.println(Thread.currentThread().getName()+" helps to watch movie");
				obj.scan.notify();
			}
		}
		int points=0;
		System.out.println("Welcome to INOX snow games "+Thread.currentThread().getName());
		for(int attempts=1;attempts<=5;attempts++)
		{
			points+=ran.nextInt(10);
		}
		System.out.println(Thread.currentThread().getName()+" total score is "+points);
	}
}
class Counters implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int fare;
	@Override
	public void run()
	{
		System.out.println("Welcome to INOX Screen "+Thread.currentThread().getName());
		// TODO Auto-generated method stub
		synchronized (scan) {
			System.out.println("Enter the amount: "+Thread.currentThread().getName());
			fare=scan.nextInt();
			if(fare<200)
			{
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+" got a ticket");
		}
		System.out.println("Enjoy the movie");
	}
}

