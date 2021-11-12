package sarathy.manoj.ManojSarathyJava.exceptions;

import java.io.IOException;

public class CheckedSample 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro=run.exec("notepad");
		Thread.sleep(10000);
		pro=run.exec("calc");
		Thread.sleep(10000);
		pro=run.exec("mspaint");
	}
}
