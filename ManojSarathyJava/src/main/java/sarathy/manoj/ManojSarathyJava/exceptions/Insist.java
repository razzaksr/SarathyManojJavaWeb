package sarathy.manoj.ManojSarathyJava.exceptions;

// throw keyword

public class Insist 
{
	public static void main(String[] args) 
	{
		try
		{
			String hai="alpha";
			System.out.println(hai.charAt(0));
			throw new StringIndexOutOfBoundsException();
		}
		catch(StringIndexOutOfBoundsException sin)
		{
			System.out.println(sin+"\nIn catch block");
		}
	}
}
