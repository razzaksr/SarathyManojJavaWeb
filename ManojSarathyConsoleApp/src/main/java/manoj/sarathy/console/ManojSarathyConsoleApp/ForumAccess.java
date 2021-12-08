package manoj.sarathy.console.ManojSarathyConsoleApp;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class ForumAccess implements Runnable, ForumActions
{
	TreeSet<Forum> ksr=new TreeSet<Forum>();
	Scanner scan=new Scanner(System.in);
	
	public ForumAccess()
	{
		ksr.add(new Forum("Web", "Javascript", "Mohamed", 20, 40));
		ksr.add(new Forum("NEAN", "JavaScript", "Razak", 45, 120));
		ksr.add(new Forum("MERN", "React", "Razak Mohamed", 60, 80));
		ksr.add(new Forum("Python", "DJango", "Sasi", 40, 100));
		ksr.add(new Forum("Java", "Spring", "Annamalai", 50, 70));
		ksr.add(new Forum("Dotnet", "Razor", "Maheshwaran", 35, 60));
		ksr.add(new Forum("Basic", "Python", "Annamalai", 25, 30));
		ksr.add(new Forum("Mobile", "Android", "Dinesh", 40, 45));
		ksr.add(new Forum("CS-4", "Data science", "Sobin", 100, 120));
		ksr.add(new Forum("EE-4", "VLSI", "Aasai", 30, 55));
	}
	
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		System.out.println("Welcome "+Thread.currentThread().getName()+" to Forum Access Control");
		do
		{
			System.out.println("1. New forum\n2. List All\n3.Update\n4. Delete\n5.Sort\n6. Search\n7.Exit");
			int menu=scan.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("Create new Forum with mandate details name,tech,incharge,count,hours");
				Forum forum=new Forum(scan.next(), scan.next(), scan.next(), scan.nextInt(), scan.nextInt());
				//Forum forum=new Forum();
				//forum.setGroupName(scan.next());
				
				System.out.println(addNewGroup(forum));
				break;
			case 2:
				System.out.println("Listing all Forum's");
				listAllGroups();
				break;
			case 3:
				System.out.println("Update forum by forum name: ");
				String name=scan.next();
				updateGroup(name);
				break;
			case 4:
				System.out.println("Delete by forum name: ");
				name=scan.next();
				deleteGroup(name);
				break;
			case 5:
				System.out.println("Sort Forum");
				sortGroup();
				break;
			case 6:
				System.out.println("Search based on technology or count or incharge and hours");
				String what=scan.next();
				switch(what)
				{
				case "tech":
					System.out.println("Tell us technology");
					searchGroup(scan.next());
					break;
				case "count":
					System.out.println("Tell us members count");
					searchGroup(scan.nextInt());
					break;
				case "incharge":
					System.out.println("Tell us incharge and hours");
					searchGroup(scan.next(),scan.nextInt());
					break;
				default:System.out.println("Nothing to search");
				}
				break;
			default:return;
			}
		}while(true);
	}
	
	//operations
		@Override
		public String addNewGroup(Forum forum) {
			// TODO Auto-generated method stub
			ksr.add(forum);
			return forum.getGroupName()+" has added";
		}

		@Override
		public void listAllGroups() {
			// TODO Auto-generated method stub
			Iterator<Forum> it=ksr.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

		@Override
		public void deleteGroup(String name) {
			// TODO Auto-generated method stub
			//Forum[] tmp=(Forum[])ksr.toArray();
			List<Forum> tmp=new Vector<Forum>();
			tmp.addAll(ksr);
				try
				{
					for(int index=0;index<tmp.size();index++)
					{
						if(tmp.get(index).getGroupName().equalsIgnoreCase(name))
						{
							ksr.remove(tmp.get(index));
							System.out.println(name+" forum has removed successfully");
							return;
						}
					}
					throw new ForumNotFoundException();
				}
				
			catch(ForumNotFoundException fore)
			{
				System.out.println(fore+"\nInvalid Forum name, Enter exact name to delete");
				for(Forum h:ksr)
				{
					System.out.println(h.getGroupName());
				}
				deleteGroup(scan.next());
			}
		}

		@Override
		public void updateGroup(String name) {
			/*
			 * // TODO Auto-generated method stub try { for(int
			 * index=0;index<ksr.length;index++) {
			 * if(ksr[index].getGroupName().equalsIgnoreCase(name)) {
			 * System.out.println(ksr[index]); try {
			 * System.out.println("Tell us what to update"); String what=scan.next();
			 * switch(what) { case "name": System.out.println("Tell us new group name: ");
			 * String nm=scan.next(); ksr[index].setGroupName(nm); break; case "technology":
			 * System.out.println("Tell us new group technology: "); String
			 * tech=scan.next(); ksr[index].setGroupTechnology(tech); break; case "head":
			 * System.out.println("Tell us new group incharge: "); String inc=scan.next();
			 * ksr[index].setGroupIncharge(inc); break; case "count":
			 * System.out.println("Tell us new group members count: "); int
			 * count=scan.nextInt(); ksr[index].setMembersCount(count); break; case "hours":
			 * System.out.println("Tell us new hours: "); int hrs=scan.nextInt();
			 * ksr[index].setProductionHours(hrs); break; default:throw new
			 * ForumNotFoundException(); } System.out.println(what+" has updated in "+name);
			 * return; } catch(ForumNotFoundException | InputMismatchException forr) {
			 * Scanner scans=new Scanner(System.in); System.out.println(
			 * forr+" enter exact name to update details: name,technology,head,count,hours"
			 * ); System.out.println("Tell us what to update"); String what=scans.next();
			 * switch(what) { case "name": System.out.println("Tell us new group name: ");
			 * String nm=scans.next(); ksr[index].setGroupName(nm); break; case
			 * "technology": System.out.println("Tell us new group technology: "); String
			 * tech=scans.next(); ksr[index].setGroupTechnology(tech); break; case "head":
			 * System.out.println("Tell us new group incharge: "); String inc=scans.next();
			 * ksr[index].setGroupIncharge(inc); break; case "count":
			 * System.out.println("Tell us new group members count: "); int
			 * count=scans.nextInt(); ksr[index].setMembersCount(count); break; case
			 * "hours": System.out.println("Tell us new hours: "); int hrs=scans.nextInt();
			 * ksr[index].setProductionHours(hrs); break;
			 * default:System.out.println("Maximum chances are over"); }
			 * System.out.println(what+" has updated in "+name); return; } } } throw new
			 * ForumNotFoundException(); } catch(ForumNotFoundException fore) {
			 * System.out.println(fore+"\nInvalid forum name, enter correctly"); for(Forum
			 * h:ksr) { System.out.println(h.getGroupName()); } updateGroup(scan.next()); }
			 * //System.out.println(name+" hasn't updated");
			 */		}

		@Override
		public void searchGroup(String technology) 
		{
			/*
			 * System.out.println("Trying to fetch froum's matching the technology "
			 * +technology); // TODO Auto-generated method stub for(int
			 * index=0;index<ksr.length;index++) {
			 * if(ksr[index].getGroupTechnology().equalsIgnoreCase(technology)) {
			 * System.out.println(ksr[index]); } }
			 */
		}

		@Override
		public void searchGroup(int count) {
			/*
			 * // TODO Auto-generated method stub
			 * System.out.println("Trying to fetch froum's matching the members count "
			 * +count); // TODO Auto-generated method stub for(int
			 * index=0;index<ksr.length;index++) { if(ksr[index].getMembersCount()>=count) {
			 * System.out.println(ksr[index]); } }
			 */
		}

		@Override
		public void searchGroup(String incharge, int hours) {
			/*
			 * // TODO Auto-generated method stub
			 * System.out.println("Trying to fetch froum's matching the incharge "
			 * +incharge+" or production hours "+hours); // TODO Auto-generated method stub
			 * for(int index=0;index<ksr.length;index++) {
			 * if(ksr[index].getGroupIncharge().equalsIgnoreCase(incharge) ||
			 * ksr[index].getProductionHours()>=hours) { System.out.println(ksr[index]); } }
			 */
		}

		@Override
		public void sortGroup() 
		{
			/*
			 * Forum forum=null; System.out.println("Based on ehat you wish to sort");
			 * String what=scan.next(); // TODO Auto-generated method stub for(int
			 * hold=0;hold<=ksr.length;hold++) { for(int com=hold+1;com<ksr.length;com++) {
			 * if(what.equalsIgnoreCase("name")) {
			 * if(ksr[hold].getGroupName().compareTo(ksr[com].getGroupName())>0) {
			 * forum=ksr[hold]; ksr[hold]=ksr[com]; ksr[com]=forum; } } else
			 * if(what.equalsIgnoreCase("incharge")) {
			 * if(ksr[hold].getGroupIncharge().compareTo(ksr[com].getGroupIncharge())>0) {
			 * forum=ksr[hold]; ksr[hold]=ksr[com]; ksr[com]=forum; } } else
			 * if(what.equalsIgnoreCase("tech")) {
			 * if(ksr[hold].getGroupTechnology().compareTo(ksr[com].getGroupTechnology())>0)
			 * { forum=ksr[hold]; ksr[hold]=ksr[com]; ksr[com]=forum; } } else
			 * if(what.equalsIgnoreCase("count")) {
			 * if(ksr[hold].getMembersCount()>=ksr[com].getMembersCount()) {
			 * forum=ksr[hold]; ksr[hold]=ksr[com]; ksr[com]=forum; } } else
			 * if(what.equalsIgnoreCase("hours")) {
			 * if(ksr[hold].getProductionHours()>=ksr[com].getProductionHours()) {
			 * forum=ksr[hold]; ksr[hold]=ksr[com]; ksr[com]=forum; } } } }
			 */
		}
}
