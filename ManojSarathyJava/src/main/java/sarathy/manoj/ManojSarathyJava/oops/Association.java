package sarathy.manoj.ManojSarathyJava.oops;

import java.util.Scanner;

public class Association implements ForumActions
{
	Forum[] ksr=new Forum[10];// Storage
	Scanner scan=new Scanner(System.in);
	
	public Association()
	{
		ksr[0]=new Forum("Web", "Javascript", "Mohamed", 20, 40);
		ksr[1]=new Forum("NEAN", "JavaScript", "Razak", 45, 120);
		ksr[2]=new Forum("MERN", "React", "Razak Mohamed", 60, 80);
		ksr[3]=new Forum("Python", "DJango", "Sasi", 40, 100);
		ksr[4]=new Forum("Java", "Spring", "Annamalai", 50, 70);
		ksr[5]=new Forum("Dotnet", "Razor", "Maheshwaran", 35, 60);
		ksr[6]=new Forum("Basic", "Python", "Annamalai", 25, 30);
		ksr[7]=new Forum("Mobile", "Android", "Dinesh", 40, 45);
		ksr[8]=new Forum("CS-4", "Data science", "Sobin", 100, 120);
		ksr[9]=new Forum("EE-4", "VLSI", "Aasai", 30, 55);
	}
	
	public static void main(String[] args) 
	{
		Forum f1=new Forum(); f1.setGroupIncharge("Razak Mohamed");
		f1.setGroupName("Intelligent"); f1.setGroupTechnology("Python");
		f1.setMembersCount(40); f1.setProductionHours(60);
		Forum f2=new Forum("Web", "Javascript", "Mohamed", 20, 40);
		Association ass=new Association();
		/*
		 * Association ass=new Association(); System.out.println(ass.addNewGroup(f1));;
		 * System.out.println(ass.addNewGroup(f2));;
		 */
		
		ass.sortGroup();
		ass.listAllGroups();
		
		//ass.searchGroup("Javascript");
		
		//ass.searchGroup(40);
		//ass.searchGroup("Annamalai",50);
		
		//ass.deleteGroup("CS-4");
		
		//ass.updateGroup("Java");
		
		
		
		/*
		 * Forum f1=new Forum(); f1.setGroupIncharge("Razak Mohamed");
		 * f1.setGroupName("Intelligent"); f1.setGroupTechnology("Python");
		 * f1.setMembersCount(40); f1.setProductionHours(60);
		 * 
		 * System.out.println(f1);
		 * 
		 * 
		 * Forum f2=new Forum("Web", "Javascript", "Mohamed", 20, 40);
		 * System.out.println(f2.getGroupIncharge());
		 */
		
		/*
		 * Forum f3; System.out.println(f3);
		 */
		
		
	}

	
	//operations
	@Override
	public String addNewGroup(Forum forum) {
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index]==null)
			{
				ksr[index]=forum;
				return forum.getGroupName()+" has added";
			}
		}
		return forum.getGroupName()+" hasn't added";
	}

	@Override
	public void listAllGroups() {
		// TODO Auto-generated method stub
		for(Forum k:ksr)
		{
			System.out.println(k);
		}
		
	}

	@Override
	public void deleteGroup(String name) {
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index].getGroupName().equalsIgnoreCase(name))
			{
				ksr[index]=null;
				System.out.println(name+" forum has removed successfully");
				return;
			}
		}
		System.out.println(name+" hasn't found anywhere");
	}

	@Override
	public void updateGroup(String name) {
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index].getGroupName().equalsIgnoreCase(name))
			{
				System.out.println(ksr[index]);
				System.out.println("Tell us what to update");
				String what=scan.next();
				switch(what)
				{
				case "name":
					System.out.println("Tell us new group name: ");
					String nm=scan.next();
					ksr[index].setGroupName(nm);
					break;
				case "technology":
					System.out.println("Tell us new group technology: ");
					String tech=scan.next();
					ksr[index].setGroupTechnology(tech);
					break;
				case "head":
					System.out.println("Tell us new group incharge: ");
					String inc=scan.next();
					ksr[index].setGroupIncharge(inc);
					break;
				case "count":
					System.out.println("Tell us new group members count: ");
					int count=scan.nextInt();
					ksr[index].setMembersCount(count);
					break;
				case "hours":
					System.out.println("Tell us new hours: ");
					int hrs=scan.nextInt();
					ksr[index].setProductionHours(hrs);
					break;
				}
				System.out.println(what+" has updated in "+name);
				return;
			}
		}
		System.out.println(name+" hasn't updated");
	}

	@Override
	public void searchGroup(String technology) 
	{
		System.out.println("Trying to fetch froum's matching the technology "+technology);
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index].getGroupTechnology().equalsIgnoreCase(technology))
			{
				System.out.println(ksr[index]);
			}
		}
	}

	@Override
	public void searchGroup(int count) {
		// TODO Auto-generated method stub
		System.out.println("Trying to fetch froum's matching the members count "+count);
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index].getMembersCount()>=count)
			{
				System.out.println(ksr[index]);
			}
		}
	}

	@Override
	public void searchGroup(String incharge, int hours) {
		// TODO Auto-generated method stub
		System.out.println("Trying to fetch froum's matching the incharge "+incharge+" or production hours "+hours);
		// TODO Auto-generated method stub
		for(int index=0;index<ksr.length;index++)
		{
			if(ksr[index].getGroupIncharge().equalsIgnoreCase(incharge) || ksr[index].getProductionHours()>=hours)
			{
				System.out.println(ksr[index]);
			}
		}
	}

	@Override
	public void sortGroup() 
	{
		Forum forum=null; 
		System.out.println("Based on ehat you wish to sort");
		String what=scan.next();
		// TODO Auto-generated method stub
		for(int hold=0;hold<=ksr.length;hold++)
		{
			for(int com=hold+1;com<ksr.length;com++)
			{
				if(what.equalsIgnoreCase("name"))
				{
					if(ksr[hold].getGroupName().compareTo(ksr[com].getGroupName())>0)
					{
						forum=ksr[hold];
						ksr[hold]=ksr[com];
						ksr[com]=forum;
					}
				}
				else if(what.equalsIgnoreCase("incharge"))
				{
					if(ksr[hold].getGroupIncharge().compareTo(ksr[com].getGroupIncharge())>0)
					{
						forum=ksr[hold];
						ksr[hold]=ksr[com];
						ksr[com]=forum;
					}
				}
				else if(what.equalsIgnoreCase("tech"))
				{
					if(ksr[hold].getGroupTechnology().compareTo(ksr[com].getGroupTechnology())>0)
					{
						forum=ksr[hold];
						ksr[hold]=ksr[com];
						ksr[com]=forum;
					}
				}
				else if(what.equalsIgnoreCase("count"))
				{
					if(ksr[hold].getMembersCount()>=ksr[com].getMembersCount())
					{
						forum=ksr[hold];
						ksr[hold]=ksr[com];
						ksr[com]=forum;
					}
				}
				else if(what.equalsIgnoreCase("hours"))
				{
					if(ksr[hold].getProductionHours()>=ksr[com].getProductionHours())
					{
						forum=ksr[hold];
						ksr[hold]=ksr[com];
						ksr[com]=forum;
					}
				}
			}
		}
	}
}
