class Clock{
	double cost;
	String brand;
	String shopName;
	String place;
	String shape;
	
	Clock(){
		super();
	}
	Clock(double cost){
		super();
		this.cost=cost;
		System.out.println("Clock cost:"+cost);
	}
	Clock(double cost,String brand){
		super();
		this.cost=cost;
		this.brand=brand;
		System.out.println("Clock cost:"+cost+" Clock brand"+brand);
	}
	Clock(double cost,String brand,String shopName){
		super();
		this.cost=cost;
		this.brand=brand;
		this.shopName=shopName;
		System.out.println("Clock cost:"+cost+" Clock brand"+brand+" Clock shopName:"+shopName);
	}
	Clock(double cost,String brand,String shopName,String place){
		super();
		this.cost=cost;
		this.brand=brand;
		this.shopName=shopName;
		this.place=place;
		System.out.println("Clock cost:"+cost+" Clock brand"+brand+" Clock shopName:"+shopName+" Clock place:"+place);
	}
	Clock(double cost,String brand,String shopName,String place,String shape){
		super();
		this.cost=cost;
		this.brand=brand;
		this.shopName=shopName;
		this.place=place;
		this.shape=shape;
		System.out.println("Clock cost:"+cost+" Clock brand"+brand+" Clock shopName:"+shopName+" Clock place:"+place+" Clock shape:"+shape);
	}
}