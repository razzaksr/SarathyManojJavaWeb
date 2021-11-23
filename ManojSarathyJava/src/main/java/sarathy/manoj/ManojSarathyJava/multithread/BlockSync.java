package sarathy.manoj.ManojSarathyJava.multithread;

import java.util.Scanner;

public class BlockSync 
{
	public static void main(String[] args) 
	{
		Tellers tel=new Tellers();
		Thread t1=new Thread(tel,"Sarathy");
		Thread t2=new Thread(tel,"Manoj");
		Thread t3=new Thread(tel,"Mohamed");
		Thread t4=new Thread(tel,"Annamalai");
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Tellers implements Runnable
{
	int t2000=10,f500=20,t200=50,o100=50;
	Scanner scan=new Scanner(System.in);
	int userRequested;
	String out="";
	
	public void denom()
	{
		out="";
		int tmpFind=userRequested,rCount=0,t2000s=t2000,f500s=f500,t200s=t200,o100s=o100;
		if(tmpFind>0)
		{
			if(t2000s>0)
			{
				rCount=tmpFind/2000;
				if(rCount>t2000s)
				{
					tmpFind-=(t2000s*2000);
					out+="2000 X "+t2000s+"\n";
					t2000s=0;
				}
				else
				{
					t2000s-=rCount;
					tmpFind-=(rCount*2000);
					out+="2000 X "+rCount+"\n";
				}
			}
			if(tmpFind>0&&f500s>0)
			{
				rCount=tmpFind/500;
				if(rCount>f500s)
				{
					tmpFind-=(f500s*500);
					out+="500 X "+f500s+"\n";
					f500s=0;
				}
				else
				{
					f500s-=rCount;
					tmpFind-=(rCount*500);
					out+="500 X "+rCount+"\n";
				}
			}
			if(tmpFind>0&&t200s>0)
			{
				rCount=tmpFind/200;
				if(rCount>t200s)
				{
					tmpFind-=(t200s*200);
					out+="200 X "+t200s+"\n";
					t200s=0;
				}
				else
				{
					t200s-=rCount;
					tmpFind-=(rCount*200);
					out+="200 X "+rCount+"\n";
				}
			}
			if(tmpFind>0&&o100s>0)
			{
				rCount=tmpFind/100;
				if(rCount>o100s)
				{
					tmpFind-=(o100s*100);
					out+="100 X "+o100s+"\n";
					o100s=0;
				}
				else
				{
					o100s-=rCount;
					tmpFind-=(rCount*100);
					out+="100 X "+rCount+"\n";
				}
			}
			
			if(tmpFind==0)
			{
				t2000=t2000s;f500=f500s;t200=t200s;o100=o100s;
				System.out.println(Thread.currentThread().getName()+" withdrawn "+userRequested+" with\n"+out);
			}
			else {
				System.out.println(Thread.currentThread().getName()+" can't withdrawn ");
			}
		}
		else
		{
			System.out.println("Invalid amount by "+Thread.currentThread().getName());
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+Thread.currentThread().getName());
		synchronized (scan) {
			System.out.println(Thread.currentThread().getName()+" Enter the required amount:");
			userRequested=scan.nextInt();
			denom();
		}
	}
	
}