package sarathy.manoj.ManojSarathyJava.exceptions;

import java.util.Scanner;
public class Rethrow
{
	static Scanner scan=new Scanner(System.in);
	static int num1,num2;
	public static void helloThere()
	{
		try
		{
			System.out.println("Tell us two numbers: ");
			num1=scan.nextInt();
			num2=scan.nextInt();
			System.out.println(num2/num1);
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"\n Main could handle this I can't");
			throw am;
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			Rethrow.helloThere();
		}
		catch(ArithmeticException am)
		{
			System.out.println(am+"\nNum1 shouldn't ZERO in Main method");
			System.out.println("Tell us num1: ");
			num1=scan.nextInt();
			System.out.println(num2/num1);
		}
	}
}
