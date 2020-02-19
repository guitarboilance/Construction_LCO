
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	//empty-argument Mall constructor
	public Mall() {
		// TODO Auto-generated constructor stub
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end empty-argument Mail constructor
	
	//preferred Mall constructor
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		super();
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//end preferred Mall constructor
	
	/**
	 * the draw method prints a message
	 */
	//Methods
		public void draw() {
			System.out.println("Ring, Ring, you called me");
		}
		/**
		 * display data appends the data to the toString to be printed to the screen
		 */
		public String displayData() {
			StringBuilder sb = new StringBuilder();
			sb.append("Number of Rented Units: " + numRentedUnits + "\n");
			sb.append("Median Unit Size: " + medianUnitSize + "\n");
			sb.append("Number of Parking Spaces: " + numParkingSpaces + "\n");
			return toString();
		}
		
	
	//Getters and Setters
	/**
	 * getters return the value of their respective variable
	 * setters set this.variable equal to the value of the variable
	 * @return
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}
	
	

}//end Mall class
