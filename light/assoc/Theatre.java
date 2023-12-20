package com.xworkz.light.assoc;
public class Theatre {
TicketBooking ticketBooking;
public Theatre(TicketBooking ticketBooking) {
	this.ticketBooking=ticketBooking;
}
public double sell(int quantity) {
	double total=ticketBooking.buy(quantity);
	if(quantity>5) {
		double res=(total*(0.1));
		double grandTotal=total-res;
		System.out.println("ticket is booked ,hurray! you have a discount");
		return grandTotal; 
	}else {
		System.out.println("ticket is booked");
		return total;
	}
}
public boolean cancel() {
	boolean value=ticketBooking.cancel();
	return value;
}
}
