
public class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;

	public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet() {
		if (hasWifi==true) {
			return this.ratePerSqFeet+2;
		}
		else {
			return this.ratePerSqFeet;
		}
	}
	int rate = this.calculateTariff();

}
