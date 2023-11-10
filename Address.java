class Address{
	String street;
	long pincode;
	City city;
	
	Address(String street,long pincode,City city){
		this.street=street;
		this.pincode=pincode;
		this.city=city;
	}
	
	
	void show(){
		System.out.println("starting show in Address");
		System.out.println("Street:"+this.street);
		System.out.println("pincode:"+this.pincode);
		if(this.city!=null){
		city.show();
		}
		System.out.println("ending show in Address");
	}
}