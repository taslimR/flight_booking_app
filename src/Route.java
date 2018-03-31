
public class Route {
	String from;
	String to;
	int seats;
	int bookedSeats;
	double price;
	public Route(String from, String to, int seats, int bookedSeats, double price){
		this.from = from;
		this.to = to;
		this.seats = seats;
		this.bookedSeats = bookedSeats;
		this.price = price;
	}
	
	
	public int getNumberOfSeats() {
		
		return seats;
	}
	
	public void setNumberOfSeats(int s) {
		this.seats = s;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public double getPrice(){
		return price;
	}

}
