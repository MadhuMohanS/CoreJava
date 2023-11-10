class Hardware{
	String name;
	String type;
	Brand brand;
	
	Hardware(String name,String type,Brand brand){
		this.name=name;
		this.type=type;
		this.brand=brand;
	}
	
	void show(){
	    brand.show();
		System.out.println("starting show in Hardware");
		System.out.println("name:"+this.name);
		System.out.println("type:"+this.type);
		System.out.println("brand:"+this.brand);
		System.out.println("ending show in Hardware");
	}
}