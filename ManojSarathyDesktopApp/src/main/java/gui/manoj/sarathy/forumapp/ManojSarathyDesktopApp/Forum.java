package gui.manoj.sarathy.forumapp.ManojSarathyDesktopApp;

import java.io.Serializable;

public class Forum implements Comparable<Forum>, Serializable
{
	private String groupName;
	private String groupTechnology;
	private String groupIncharge;
	private int membersCount;
	private int productionHours;
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupTechnology() {
		return groupTechnology;
	}
	public void setGroupTechnology(String groupTechnology) {
		this.groupTechnology = groupTechnology;
	}
	public String getGroupIncharge() {
		return groupIncharge;
	}
	public void setGroupIncharge(String groupIncharge) {
		this.groupIncharge = groupIncharge;
	}
	public int getMembersCount() {
		return membersCount;
	}
	public void setMembersCount(int membersCount) {
		this.membersCount = membersCount;
	}
	public int getProductionHours() {
		return productionHours;
	}
	public void setProductionHours(int productionHours) {
		this.productionHours = productionHours;
	}
	@Override
	public String toString() {
		return "Forum [groupName=" + groupName + ", groupTechnology=" + groupTechnology + ", groupIncharge="
				+ groupIncharge + ", membersCount=" + membersCount + ", productionHours=" + productionHours + "]\n";
	}
	public Forum(String groupName, String groupTechnology, String groupIncharge, int membersCount,
			int productionHours) {
		super();
		this.groupName = groupName;
		this.groupTechnology = groupTechnology;
		this.groupIncharge = groupIncharge;
		this.membersCount = membersCount;
		this.productionHours = productionHours;
	}
	public Forum() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Forum o) 
	{
		// TODO Auto-generated method stub
		return this.groupName.compareTo(o.groupName);
	}
}
