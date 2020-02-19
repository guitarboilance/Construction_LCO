
public class SingleFamilyHome extends Residential {
	private boolean garage;
	
	public SingleFamilyHome() {
		// TODO Auto-generated constructor stub
		super();
		garage = false;
	}
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		garage = false;
	}
	
	//methods
	/**
	 * the draw method prints a message
	 */
	public void draw() {
		System.out.println("Hellooo!");
	}
	/**
	 * display data appends the data to the toString to be printed to the screen
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Garage: " + garage + "\n");
		return toString();
	}

	
	//Getters and Setters
	/**
	 * getters return the value of their respective variable
	 * setters set this.variable equal to the value of the variable
	 * @return
	 */
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
}//end class
