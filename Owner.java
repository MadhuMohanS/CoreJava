class Owner{
	String name="virendar";
	String email;
	Address permanentAddress;
	Address temporaryAddress;
	City city;
	
	Owner(String email,Address permanentAddress,Address temporaryAddress){
		this.email=email;
		this.permanentAddress=permanentAddress;
		this.temporaryAddress=temporaryAddress;
	}
		
	
	void show(){
		
		System.out.println("starting show in owner");
		System.out.println("name:"+name);
		System.out.println("email:"+this.email);
		this.permanentAddress.show();
		this.temporaryAddress.show();
		System.out.println("ending show in owner");
	}
	
}