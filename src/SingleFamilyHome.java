
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
	public void draw() {
		System.out.println("Hellooo!");
	}
	public String displayData() {
		StringBuilder sb = new StringBuilder();
		sb.append("Garage: " + garage + "\n");
		return toString();
	}

	
	//Getters and Setters
	public boolean isGarage() {
		return garage;
	}

	public void setGarage(boolean garage) {
		this.garage = garage;
	}
	
}//end class
