package sarathy.manoj.ManojSarathyJava.multithread;

import java.util.Random;
import java.util.Scanner;

public class InterThread 
{
	public static void main(String[] args) 
	{
		Theatres the=new Theatres();
		Snow snow=new Snow(the);
		Thread t1=new Thread(snow,"Sarathy");
		Thread t2=new Thread(the,"Manoj");
		t1.start();t2.start();
	}
}
class Snow implements Runnable
{
	public Snow() {}
	Theatres obj;
	public Snow(Theatres temp) 
	{
		obj=temp;
	}
	@Override
	public void run() 
	{
		synchronized (obj.scan) 
		{
			System.out.println(Thread.currentThread().getName()+" is going check for help");
			if(obj.amt<obj.calc)
			{
				int t=obj.calc-obj.amt;
				System.out.println(t+" amount will be given by "+Thread.currentThread().getName()+" as help");
				obj.scan.notify();
			}
		}
		int points=0;
		System.out.println("Welcome to INOX snow games "+Thread.currentThread().getName());
		Random ran=new Random();
		for(int attempts=1;attempts<=5;attempts++)
		{
			points+=ran.nextInt(10);
		}
		System.out.println(Thread.currentThread().getName()+" total score is "+points);
	}	
}
class Theatres implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int amt,seats,calc;
	@Override
	public void run() 
	{
		synchronized (scan) 
		{
			System.out.println("Tell us how many tickets needed: "+Thread.currentThread().getName());
						seats=scan.nextInt();
						calc=seats*190;
						System.out.println("Tell us amount to pay: ");
						amt=scan.nextInt();
						if(amt<calc)
						{
							System.out.println("Insufficient amount");
							try {
								scan.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println(seats+" are booked by "+Thread.currentThread().getName());
		}
	}	
}