package exercise5.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exercise4.exceptions.IsEmptyException;
import exercise5.dao.Queue;
import exercise5.entities.AirPlane;
import exercise5.entities.Flight;
import exercise5.entities.Pilot;

public class AirPlaneControlTest {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Queue<Flight> flightQueue = new Queue<Flight>();
		List<Flight> flightList = new ArrayList<Flight>();

		// reading the flights from file
		String file1 = "C:\\Arthur\\Unit - Especialização\\Programação 3\\Lista de exercicios\\InitialQueueOfFlights.csv";
		String file2 = "C:\\Arthur\\Unit - Especialização\\Programação 3\\Lista de exercicios\\Flights.txt";
		BufferedReader bf1;
		BufferedReader bf2;

		try {
			bf1 = new BufferedReader(new FileReader(file1));
			bf2 = new BufferedReader(new FileReader(file2));
			String line1 = bf1.readLine();
			String line2 = bf2.readLine();

			while (line1 != null) {
				String[] fields1 = line1.split(",");
				Integer numberOfPassengers = Integer.parseInt(fields1[6]);
				Flight f = new Flight(fields1[0], new AirPlane(fields1[2], fields1[1]), new Pilot(fields1[3]),
						fields1[4], fields1[5], numberOfPassengers);
				flightQueue.add(f);
				line1 = bf1.readLine();
			}

			while (line2 != null) {
				String[] fields2 = line2.split(",");
				Flight f = new Flight(fields2[0], new AirPlane(fields2[2], fields2[1]), new Pilot(fields2[3]),
						fields2[4], fields2[5], Integer.parseInt(fields2[6]));
				flightList.add(f);
				line2 = bf2.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		char resp = 'n';
		char ch = 'y';
		while (ch != 'n') {
			System.out.println("-------- Home Page ---------");
			System.out.println("1. Authorize Takeoff " + "\n2. Add an airplane in the flight queue "
					+ "\n3. Print all flights in the flight queue"
					+ "\n4. Print the number of flights on the flight queue"
					+ "\n5. List the characteristics of the first airplane in the queue");
			int option = sc.nextInt();

			switch (option) {
			case 1:

				do {
					try {
						flightQueue.remove();
						System.out.println("Do you author the takeoff of other airplane? (y/n)");
						resp = sc.next().charAt(0);
					} catch (IsEmptyException e) {
						System.out.println("Error: " + e.getMessage());
					}
				} while (resp == 'y');
				break;
			case 2:
				do {
					System.out.print("Type the number of the flight to add in the flight queue: ");
					String flightNumber = sc.next().toUpperCase();
					Flight flight = flightList.stream().filter(f -> flightNumber.equals(f.getFlightNumber())).findAny()
							.orElse(null);
					if (!flightQueue.exist(flight)) {
						flightQueue.add(flight);
					} else {
						System.out.println("There is already a flight with this flight number!");
					}
					System.out.println("Would you like to add another flight in the queue? (y/n)");
					resp = sc.next().charAt(0);
				} while (resp == 'y');
				break;
			case 3:
				System.out.println(flightQueue.print());
				break;
			case 4:
				System.out.println("There are " + flightQueue.size() + " in the flight queue.");
				break;
			case 5:
				System.out.println(flightQueue.firstElement().toString());
				break;
			default:
				System.out.println("Opção inválida!");
			}
			System.out.println("Would you like to return to Home Page? (y/n)");
			ch = sc.next().charAt(0);
		}

		sc.close();
	}

}
