
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	public Apartment() {
		// TODO Auto-generated constructor stub
		super();
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	}
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;	
	}
	
	//Methods
	/**
	 * the draw method prints a message
	 */
	public void draw() {
		System.out.println("Peekaboo, I see you");
	}
	/**
	 * display data appends the data to the toString to be printed to the screen
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Number of Rentable Units: " + numRentableUnits + "\n");
		sb.append("Average Unit Size: " + avgUnitSize + "\n");
		sb.append("Parking Available: " + parkingAvailable + "\n");
		return toString();
	}

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

	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}
	

}
