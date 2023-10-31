class MatchBox{
	String brand,type;
	int noOfStick;
	double length,price,weight;
	char size;
	
	MatchBox(){
		System.out.println("MatchBox constructor is created");
	}
	MatchBox(String brand){
		System.out.println("MatchBox1 constructor is created");
		this.brand=brand;
	}
	MatchBox(String brand,String type){
		System.out.println("MatchBox2 constructor is created");
		this.brand=brand;
		this.type=type;
	}
	MatchBox(String brand,String type,int noOfStick){
		System.out.println("MatchBox3 constructor is created");
		this.brand=brand;
		this.type=type;
		this.noOfStick=noOfStick;
	}
	MatchBox(String brand,String type,int noOfStick,double length){
		System.out.println("MatchBox4 constructor is created");
		this.brand=brand;
		this.type=type;
		this.noOfStick=noOfStick;
		this.length=length;
	}
	MatchBox(String brand,String type,int noOfStick,double length,double price,double weight){
		System.out.println("MatchBox5 constructor is created");
		this.brand=brand;
		this.type=type;
		this.noOfStick=noOfStick;
		this.length=length;
		this.price=price;
		this.weight=weight;
	}
	MatchBox(String brand,String type,int noOfStick,double length,double price,double weight,char size){
		System.out.println("MatchBox6 constructor is created");
		this.brand=brand;
		this.type=type;
		this.noOfStick=noOfStick;
		this.length=length;
		this.price=price;
		this.weight=weight;
		this.size=size;
	}
	
}