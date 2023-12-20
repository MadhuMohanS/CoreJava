package com.xworkz.light;

import com.xworkz.light.assoc.Theatre;
import com.xworkz.light.assoc.TicketBooking;
import com.xworkz.light.assoc.TicketBookingImpl;

public class TicketBookingBegin {
	public static void main(String[] args) {
		System.out.println("starting main in TicketBooking");
TicketBooking ticketBooking=new TicketBookingImpl();
Theatre theatre=new Theatre(ticketBooking);
double cost=theatre.sell(3);
System.out.println("total cost is:"+cost);
System.out.println("ending main in TicketBooking");


	}
}
