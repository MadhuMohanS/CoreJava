class Month{
	String name;
	int noOfDays;
	int noOfWeekEnds;
	int noOfHolidays;
	
	Month(String name,int noOfDays,int noOfWeekEnds,int noOfHolidays){
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekEnds=noOfWeekEnds;
		this.noOfHolidays=noOfHolidays;
		
	}
	
	void displayInfo(){
		System.out.println("starting displayInfo in Month");
		System.out.println("Month name:"+name+" no of days:"+noOfDays+" no of weekends:"+noOfWeekEnds+" no of holidays:"+noOfHolidays);
		System.out.println("ending displayInfo in Month");

	}
	
}