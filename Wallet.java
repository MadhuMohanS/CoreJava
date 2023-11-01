class Wallet{
	double cost;
	String brand;
	String shopName;
	String place;

	
	Wallet(){
		super();
	}
	Wallet(double cost){
		super();
		this.cost=cost;
		System.out.println("Wallet cost:"+cost);
	}
	Wallet(double cost,String brand){
		super();
		this.cost=cost;
		this.brand=brand;
		System.out.println("Wallet cost:"+cost+" Wallet brand"+brand);
	}
	Wallet(double cost,String brand,String shopName){
		super();
		this.cost=cost;
		this.brand=brand;
		this.shopName=shopName;
		System.out.println("Wallet cost:"+cost+" Wallet brand"+brand+" Wallet shopName:"+shopName);
	}
	Wallet(double cost,String brand,String shopName,String place){
		super();
		this.cost=cost;
		this.brand=brand;
		this.shopName=shopName;
		this.place=place;
		System.out.println("Wallet cost:"+cost+" Wallet brand"+brand+" Wallet shopName:"+shopName+" Wallet place:"+place);
	}
	
}