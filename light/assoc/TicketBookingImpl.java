package com.xworkz.light.assoc;

public class TicketBookingImpl implements TicketBooking{
	@Override
	public double buy(int quantity) {
		return quantity*200;
	}
	@Override
	public boolean cancel() {
		return true;
	}

}
