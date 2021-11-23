package sarathy.manoj.ManojSarathyJava.multithread;

import java.util.Scanner;

public class LifeCycle 
{
	public static void main(String[] args) 
	{
		Theatre the=new Theatre();
		Thread t1=new Thread(the,"Sarathy");
		Thread t2=new Thread(the,"Manoj");
		Thread t3=new Thread(the,"Mohamed");
		Thread t4=new Thread(the,"Annamalai");
		t1.start();t2.start();t3.start();t4.start();
	}
}

class Theatre implements Runnable
{
	int seats=75, fare=120, userCount, userAmount;
	Scanner scan=new Scanner(System.in);
	
	public void book()
	{
		if(seats>0&&userCount>0)
		{
			if(userCount<=seats)
			{
				int payable=userCount*fare;
				System.out.println(Thread.currentThread().getName()+" please enter amoun to complete: ");
				userAmount=scan.nextInt();
				if(userAmount>=payable)
				{
					seats-=userCount;
					userAmount-=payable;
					if(userAmount>0)
					{
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println(userCount+" tickets booked by "+Thread.currentThread().getName()+" with balance of "+userAmount);
				}
				else
				{
					System.out.println(Thread.currentThread().getName()+" insufficient "+userAmount+" to book tickets for the count of "+userCount);
				}
			}
			else
			{
				System.out.println(Thread.currentThread().getName()+" can book only "+seats);
			}
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+" can't book tickets");
		}
	}
	
	@Override
	public void run() 
	{
		System.out.println("Welcome......."+Thread.currentThread().getName()+" to INOX Salem");
		synchronized (scan) {
			System.out.println("Tell us how many tickets you wish: "+Thread.currentThread().getName());
			userCount=scan.nextInt();
			if(seats>0)
			{
				book();
			}
			else {
				System.out.println("House Full");
				Thread.currentThread().stop();
			}
			System.out.println("Thanks for coming INOX Salem");
		}
		System.out.println("Fare amount is "+fare+" response to "+Thread.currentThread().getName()+" in INOX Salem");
	}	
}