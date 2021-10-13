package sarathy.manoj.ManojSarathyJava;

import java.util.Scanner;

public class NestedLoops 
{
	public static void main(String[] args) 
	{
		/*
		 * for(int tab=1;tab<=15;tab++) {
		 * System.out.println("Table "+tab+" will get strated"); if(tab==6) break;
		 * for(int num=1;num<=20;num++) { if(num==3) continue;
		 * System.out.println(num+"X"+tab+"="+(tab*num)); } }
		 */
		
		Scanner scan=new Scanner(System.in);
		/*String chart="";
		for(int row=1;row<=10;row++)
		{
			for(int seat=1;seat<=4;seat++)
			{
				System.out.println("Enter the amount: ");
				int amt=scan.nextInt();
				if(amt>=240)
				{
					System.out.println("Seat booked @ "+row+" "+seat);
					chart+="$";
				}
				else {
					System.out.println("Insufficient amount to book seat");
					chart+="@";
				}
				if(seat==2)
					chart+=" ";
			}
			chart+="\n";
		}
		
		System.out.println("Prepared chart is: "+chart);*/
	
		int floor=3,collection=0;
		while(floor>=0)
		{
			int house=1;
			while(house<=5)
			{
				System.out.println("Tenants bring the rent: ");
				int rent=scan.nextInt();
				if(floor>=2)
				{
					if(rent>=4000) {
						collection+=rent;
						System.out.println(floor+" "+house+" tenant paid rent");
					}
					else
						System.out.println("You have to pay exact rent soon");
				}
				else
				{
					if(rent>=8000) {
						collection+=rent;
						System.out.println(floor+" "+house+" tenant paid rent");
					}
					else
						System.out.println("You have to pay exact rent soon");
				}
				house++;
			}
			floor--;
		}
		
		System.out.println("Total collection: "+collection);
	}
}
