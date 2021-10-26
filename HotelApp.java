import java.util.Scanner;
public class HotelApp {

	public static void main(String[] args) {
		System.out.println("Hotel Tarrif Calculator\n\t 1. Delux Room \n\t 2. Delux Ac Room \n\t 3. Suite AC Room");
		System.out.println("Select Room Type:");
		Scanner s= new Scanner(System.in);
		int choice= s.nextInt();
		
		System.out.println("Hotel Name:");
		String hotelname= s.nextLine();
		
		
		System.out.println("Room Square Feet Area:");
		int squarefeetarea= s.nextInt();
		
		
		System.out.println("Room has TV (yes/no):");
		String tv=s.next();
		boolean hastv=false;	
		
		if (tv.equalsIgnoreCase("yes")) {
			hastv= true;
		}
		
		System.out.println("Room has Wifi (yes/no:");
		String wifi=s.next();
		boolean haswifi=false;		
		if (wifi.equalsIgnoreCase("yes")) {
			haswifi= true;
		}
		
		if (choice==1) {
			DeluxeRoom room = new DeluxeRoom(hotelname, squarefeetarea, hastv, haswifi);
			System.out.println("Room Tariff per day is: " + room.rate);
		}
		else if (choice==2) {
			DeluxeACRoom room = new DeluxeACRoom(hotelname, squarefeetarea, hastv, haswifi);
			System.out.println("Room Tariff per day is: " + room.rate);
		}
		else if (choice==3) {
			SuiteACRoom room = new SuiteACRoom(hotelname, squarefeetarea, hastv, haswifi);
			System.out.println("Room Tariff per day is: " + room.rate);
		}
	}

}
