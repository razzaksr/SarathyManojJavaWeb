package sarathy.manoj.ManojSarathyJava.exceptions;

public class Purpose 
{
	static String hai="manoj";
	public static void main(String[] args) //throws NullPointerException
	{
		try
		{
			System.out.println(hai.length());
			System.out.println("Length Obtained");
		}
		catch(NullPointerException np)
		{
			//System.out.println(np);
			np.printStackTrace();
			hai="Sarathy";
			System.out.println(hai.length());
			System.out.println("Length Obtained");
		}
		finally
		{
			System.out.println("Program ended");
		}
		
	}
}
