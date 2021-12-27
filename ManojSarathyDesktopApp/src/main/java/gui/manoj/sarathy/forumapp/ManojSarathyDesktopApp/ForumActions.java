package gui.manoj.sarathy.forumapp.ManojSarathyDesktopApp;

public interface ForumActions 
{
	public String addNewGroup(Forum forum) ;// abstract methods
	public void listAllGroups();
	public void deleteGroup(String name);
	public void updateGroup(String name);
	public void searchGroup(String technology);
	public void searchGroup(int count);
	public void searchGroup(String incharge,int hours);
	public void sortGroup();
}
