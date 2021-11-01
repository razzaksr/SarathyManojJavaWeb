package sarathy.manoj.ManojSarathyJava.oops;

public class Association implements ForumActions
{
	Forum[] ksr=new Forum[10];// storage
	public static void main(String[] args) 
	{
		Forum f1=new Forum(); f1.setGroupIncharge("Razak Mohamed");
		f1.setGroupName("Intelligent"); f1.setGroupTechnology("Python");
		f1.setMembersCount(40); f1.setProductionHours(60);
		Forum f2=new Forum("Web", "Javascript", "Mohamed", 20, 40);
		
		Association ass=new Association();
		System.out.println(ass.addNewGroup(f1));;
		System.out.println(ass.addNewGroup(f2));;
		
		ass.listAllGroups();
		
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
		
	}

	@Override
	public void updateGroup(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchGroup(String technology) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchGroup(int count) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchGroup(String incharge, int hours) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortGroup() {
		// TODO Auto-generated method stub
		
	}
}
