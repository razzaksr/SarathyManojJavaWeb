package sarathy.manoj.ManojSarathyJava.oops;

public class DemoString 
{
	public static void main(String[] args) 
	{
		String myTech="  Spring Boot  ";// lietral
		String myTechie=new String("spring boot");// non lietral
		
		System.out.println(myTech+" "+myTechie);
		System.out.println(myTech.length()+" "+myTechie.length());
		myTech.trim();// immutable
		System.out.println(myTech.length()+" "+myTechie.length());
		myTech=myTech.trim();// immutable
		System.out.println(myTech.length()+" "+myTechie.length());
		
		System.out.println(myTech.equals(myTechie));
		System.out.println(myTech.equalsIgnoreCase(myTechie));
		
		myTech=myTech.toLowerCase();
		System.out.println(myTech.compareTo(myTechie));
		
		System.out.println(myTechie.contains("ring"));
		myTechie=myTechie.replace("ring", "rang");
		System.out.println(myTech+" "+myTechie);
		
		System.out.println(myTechie.getBytes());
		
		System.out.println(myTechie.charAt(4));
		
		System.out.println(myTech.substring(3, 8));
		
	}
}
