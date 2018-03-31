import java.util.*;

public class Main {
	
	public static RouteOne rone = new RouteOne("London", "Cluj", 5, 0, 150);
	public static RouteTwo rtwo = new RouteTwo("Paris", "London", 5, 0, 150);
	public static RouteThree rthree = new RouteThree("Rome", "Madrid", 5, 0, 150);
	
	
	public static ArrayList<Customer> ca;
	
	public static void main(String[] args) {
		
		
		menu();
	}

	private static void menu() {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("********WELCOME TO Avian Airlines********");
		System.out.println();
		System.out.println("1. Book a flight.");
		System.out.println("2. Cancle a flight.");
		System.out.println("3. View available seats.");

		System.out.println("4. View price.");
		System.out.println("5. List all flights.");

		System.out.println("6. ***Management Reporting***");

		System.out.println("7. Exit");

		System.out.print("   Please select an option: ");

		n = sc.nextInt();

		if (n == 1) {
			System.out.println();

		} else if (n == 2) {

		} else if (n == 3) {

		} else if (n == 4) {
			
			System.out.println(rone.from+" to "+rone.to+" available seats: "+rone.getAvailableSeats());
			System.out.println(rtwo.from+" to "+rtwo.to+" available seats: "+rtwo.getAvailableSeats());
			System.out.println(rthree.from+" to "+rthree.to+" available seats: "+rthree.getAvailableSeats());

		} else if (n == 5) {

		} else if (n == 6) {

		} else if (n == 7) {

		} else {
			System.out.println();
			System.out.println();
			System.out.println("****WRONG INPUT****");
			System.out.println("Enter a valid option.");
			System.out.println();
			menu();
			
		}
		
	}

	
}
