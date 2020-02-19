
public class Building {

	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//end empty Building
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//End Preferred Building
	
	
	
	//Methods
	/**
	 * the draw method prints a message
	 */
	public void draw() {
		System.out.println("Drawing code for <<Object Type>>");
	}//end draw method
	/**
	 * display data appends the data to the toString to be printed to the screen
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Project Name: " + projectName + "\n");
		sb.append("Address: " + completeAddress + "\n");
		sb.append("Occupancy Group: " + occupancyGroup + "\n");
		sb.append("Occupancy Subgroup: " + subgroup + "\n");
		return toString();
	}//end displayData method
	
	
	//toString
/*	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
*/	
	
	//Getters and Setters
	/**
	 * getters return the value of their respective variable
	 * setters set this.variable equal to the value of the variable
	 * @return
	 */
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getCompleteAddress() {
		return completeAddress;
	}
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	public String getOccupancyGroup() {
		return occupancyGroup;
	}
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	public String getSubgroup() {
		return subgroup;
	}
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	
}//end Building.java class
