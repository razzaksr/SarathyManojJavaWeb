package sarathy.manoj.ManojSarathyJava;

public class Patterns 
{
	public static void main(String[] args) 
	{
		/*char num='A';
		for(int row=5;row>0;row--)
		{
			for(int col=1;col<=5;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}*/
		
		//left upper floyd
		char num='A';
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
		
		//right upper floyd
		num='A';
		for(int row=1;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
		}
		
	}
}
