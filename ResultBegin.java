class ResultBegin{
	
public static void main(String args[]){
	Speaker speaker=new Speaker(200);
	Tv tv=new Tv(speaker,"picture");
	tv.showInfo();
	
	System.out.println("==============================");
	
	MenuCard menucard=new MenuCard();
	menucard.settotalItemsAndCost(30,5000.0);
	Hotel hotel=new Hotel();
	hotel.setNameAndownerName("isharami","Vidya Sagar",menucard);
	hotel.showInfo();
	
	System.out.println("==============================");
	
	Company company=new Company();
	company.showInfo();
	
	System.out.println("==============================");
	
	Clinic clinic=new Clinic();
	clinic.specialization="surgeon";
	clinic.totalBeds=40;
	clinic.totalPatients=30;
	clinic.showInfo();
}
}