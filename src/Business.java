
public class Business extends Building {
	protected int numRentableUnits;
	
	//empty-argument Business constructor
	public Business() {
		// TODO Auto-generated constructor stub
		super();
		numRentableUnits = 0;
	}//end empty-argument Business constructor
	
	//preferred Business constructor
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numRentableUnits = 0;
	}//end preferred Business Constructor
		
		
	
	
	
	//Getters and Setters
	/**
	 * getters return the value of their respective variable
	 * setters set this.variable equal to the value of the variable
	 * @return
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	
}//end class Business
