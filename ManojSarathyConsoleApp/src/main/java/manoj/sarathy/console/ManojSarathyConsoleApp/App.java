package manoj.sarathy.console.ManojSarathyConsoleApp;


/**
 * Hello world!
 *
 */
public class App 
{	
	public static void main(String[] args) 
	{
		ForumAccess access=new ForumAccess();
		Thread t1=new Thread(access,"Sarathy");
		Thread t2=new Thread(access,"Manoj");
		Thread t3=new Thread(access,"Annamalai");
		Thread t4=new Thread(access,"Kumar");
		t1.start();t2.start();t3.start();t4.start();
	}
}

