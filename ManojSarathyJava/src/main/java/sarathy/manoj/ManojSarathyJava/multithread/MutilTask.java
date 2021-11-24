package sarathy.manoj.ManojSarathyJava.multithread;

import java.util.Random;
import java.util.Scanner;

public class MutilTask 
{
	public static void main(String[] args) 
	{
		Counter counter=new Counter();
		SnowGames snow=new SnowGames();
		Thread t1=new Thread(snow,"Sarathy");
		Thread t2=new Thread(counter,"Manoj");
		Thread t3=new Thread(snow,"Mohamed");
		Thread t4=new Thread(counter,"Annamalai");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Counter implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int fare;
	@Override
	public void run()
	{
		System.out.println("Welcome to INOX "+Thread.currentThread().getName());
		// TODO Auto-generated method stub
		synchronized (scan) {
			System.out.println("Enter the amount: "+Thread.currentThread().getName());
			fare=scan.nextInt();
			if(fare>=200)
			{
				System.out.println(Thread.currentThread().getName()+" got a ticket");
			}
			else {
				Thread.currentThread().stop();
			}
		}
		System.out.println("Enjoy the movie");
	}
}

class SnowGames implements Runnable
{
	Random ran=new Random();
	@Override
	public void run() 
	{
		int points=0;
		System.out.println("Welcome to INOX snow games "+Thread.currentThread().getName());
		for(int attempts=1;attempts<=5;attempts++)
		{
			points+=ran.nextInt(10);
		}
		System.out.println(Thread.currentThread().getName()+" total score is "+points);
	}
}