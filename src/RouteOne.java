
public class RouteOne extends Route{
	
	String[] seatNum = new String[]{ from+to+"001", from+to+"002", from+to+"003", from+to+"004", from+to+"005"};
	
	boolean[] isBooked = new boolean[] {false, false, false, false, false};
	
	public RouteOne(String from, String to, int seats, int bookedSeat, double price) {
		super(from, to, seats, bookedSeat, price);
	}
	
	
	
	public int getAvailableSeats(){
		return seats - bookedSeats;
	}
	
	public double getPrice(){
		return ((price * 28)/100) + price;
	}
	
	public void setSeatBooked(int i){
		isBooked[i] = true;
	}
	
	public String getSeatnum(int i)
	{
		return seatNum[i];
	}

}
