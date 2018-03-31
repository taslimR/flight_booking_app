
public class Customer {
	
	String firstName;
	String surName;
	String address;
	String phoneNo;
	String email;
	String dob;
	String passportNumber;
	String parentName;
	String parentAddress;
	String parentPhnoneNumber;
	String parentEmail;
	String[] bookedSeat = new String[3];
	public Customer(String f, String s, String add, String pn, String em, String dob, String passp){
		this.firstName = f;
		this.surName = s;
		this.address = add;
		this.phoneNo = pn;
		this.email = em;
		this.dob = dob;
		this.passportNumber = passp;
	}
	
	public Customer(String pan, String paadd, String papn, String paem){
		this.parentName = pan;
		this.parentAddress = paadd;
		this.parentPhnoneNumber = papn;
		this.parentEmail = paem;
	}
	
	public Customer(String from, String to, String seatNumb){
		bookedSeat[0] = from;
		bookedSeat[1] = to;
		bookedSeat[3] = seatNumb;
	}
	

}
