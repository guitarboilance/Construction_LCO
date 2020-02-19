
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	//empty-argument Residential constructor
	public Residential() {
		// TODO Auto-generated constructor stub
		super();
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end empty-argument Residential constructor
	
	//preferred Residential constructor
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//end preferred Residential constructor
	
	
	//Getters and Setters
	/**
	 * getters return the value of their respective variable
	 * setters set this.variable equal to the value of the variable
	 * @return
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	public int getNumBathrooms() {
		return numBathrooms;
	}

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}
	
	
}
