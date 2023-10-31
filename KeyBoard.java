class KeyBoard{
	String brand;
	String color;
	int noOfKeys;
	String type;
	double cost;
	
	KeyBoard(){
		System.out.println("keyboard is created");
	}
	KeyBoard(String brand){
		System.out.println("keyboard1 is created");
		this.brand=brand;
		
	}
	
	KeyBoard(String brand,String color){
		System.out.println("keyboard2 is created");
		this.brand=brand;
		this.color=color;
	}
	
	KeyBoard(String brand,String color,int noOfKeys){
		System.out.println("keyboard3 is created");
		this.brand=brand;
		this.color=color;
		this.noOfKeys=noOfKeys;
	}
	
	KeyBoard(String brand,String color,int noOfKeys,String type){
		System.out.println("keyboard4 is created");
		this.brand=brand;
		this.color=color;
		this.noOfKeys=noOfKeys;
		this.type=type;
	}
	
	KeyBoard(String brand,String color,int noOfKeys,String type,double cost){
		System.out.println("keyboard5 is created");
		this.brand=brand;
		this.color=color;
		this.noOfKeys=noOfKeys;
		this.type=type;
		this.cost=cost;
	}
	
}