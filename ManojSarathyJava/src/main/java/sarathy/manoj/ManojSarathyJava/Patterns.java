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
		
		
		//left lower floyd
		num='A';
		for(int row=5;row>0;row--)
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
		
		// right lower floyd
		num='A';
		for(int row=5;row>0;row--)
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
		
		//pascal upper
		num='A';
		for(int row=1;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		//pascal lower
		num='A';
		for(int row=5;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++,num++)
			{
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
		
		//pyramid upper
		num='A';int limit=1;
		for(int row=1;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
			limit+=2;
		}
		
		//pyramid lower
		num='A';limit=(5*2)-1;
		for(int row=5;row>0;row--)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=limit;col++,num++)
			{
				System.out.print(num);
			}
			System.out.println();
			limit-=2;
		}
	}
}
