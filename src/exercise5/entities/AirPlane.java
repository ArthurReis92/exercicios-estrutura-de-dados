package exercise5.entities;

public class AirPlane {
	private String airlineName;
	private String model;
	private String location;
	private int capacity;

	public AirPlane() {
	}

	public AirPlane(String airlineName, String model) {
		this.airlineName = airlineName;
		this.model = model;
	}

	public AirPlane(String airlineName, String model, String location, int capacity) {
		this.airlineName = airlineName;
		this.model = model;
		this.location = location;
		this.capacity = capacity;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "  \n     Airline name: " + airlineName + "\n     Model:" + model;
	}

	
}
