package sarathy.manoj.ManojSarathyJava;

// local members: var/objects created within a block or method
/*
1. local members should be initialized; must be declared with some value
2. cannot access outside of its block
3. inside a method, method's parameter, loop block


data types: size, format
short(2),int(4),long(8)	>>	whole numbers
float(4),double(8)		>>	fractional/ point numbers
byte(1)					>> 	asci,uni
char(2)					>> 	'a' '7' '&'
boolean(4bits)			>>	true/false


String: Class
"collection of characters which includes alpha numeric and special characters"
*/

public class DataAccess 
{
	public static void main(String[] args) 
	{
		String upi="razaksrmd@okaxis";
		long mobile=8667002959L;
		float balance=8732.11F;
		char type='S';
		boolean isLive=true;
		
		System.out.println("Confirm your details:");
		/*
		 * System.out.print("Your UPI id "+upi);
		 * System.out.println(" Your Contact number "+mobile);
		 * System.out.println("Your balance "+balance);
		 * System.out.println("Your Account type "+type);
		 * System.out.println("Is your account in live "+isLive);
		 */
		
		
		System.out.printf("Your UPI id %s\nYour contact %d\nYour balance %.1f\nYour account type %c\nIs your acciunt in live %s",
				upi,mobile,balance,type,isLive);
	}
}