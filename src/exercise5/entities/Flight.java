package exercise5.entities;

public class Flight {
	private String flightNumber;
	private AirPlane airplane;
	private Pilot pilot;
	private String arrivalLocation;
	private String departureLocation;
	private int numberOfPassengers;

	public Flight() {
	}

	public Flight(String flightNumber, AirPlane airplane, Pilot pilot, String arrivalLocation, String departureLocation,
			int numberOfPassengers) {
		this.flightNumber = flightNumber;
		this.airplane = airplane;
		this.pilot = pilot;
		this.arrivalLocation = arrivalLocation;
		this.departureLocation = departureLocation;
		this.numberOfPassengers = numberOfPassengers;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public AirPlane getAirplane() {
		return airplane;
	}

	public void setAirplane(AirPlane airplane) {
		this.airplane = airplane;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public void setPilot(Pilot pilot) {
		this.pilot = pilot;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	@Override
	public String toString() {
		return "   FlightNumber: " + flightNumber + "\n   Airplane: " + airplane + "\n   Pilot: " + pilot
				+ "\n   Arrival location: " + arrivalLocation + "\n   Departure location: " + departureLocation
				+ "\n   Number of passengers: " + numberOfPassengers;
	}

	
}
