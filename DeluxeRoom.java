
public class DeluxeRoom extends HotelRoom {
	protected int ratePerSqFeet;

	public DeluxeRoom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet=10;
	}
	public int getRatePerSqFeet() {
		if (hasWifi==true) {
			return this.ratePerSqFeet+2;
		}
		else {
			return this.ratePerSqFeet; 		//WHY MY VARIABLE ratePerSqFeet IS NOT STOING GIVEN VALUE THAT IS 10 IN LINE NO. 74??? PLEASE HELP;
		}
	}
	
	int rate = super.calculateTariff();
	
	
}
