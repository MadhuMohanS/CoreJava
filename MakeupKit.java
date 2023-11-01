class MakeupKit{
	int noOfItems;
	String brand;
	long contact;
	String owner;
	
	MakeupKit(){
		super();
	}
	MakeupKit(int noOfItems){
		super();
		this.noOfItems=noOfItems;
		System.out.println("Make up kit no of items:"+noOfItems);
	}
	MakeupKit(int noOfItems,String brand){
		super();
		this.noOfItems=noOfItems;
		this.brand=brand;
	    System.out.println("Make up kit no of items:"+noOfItems+" brand:"+brand);

	}
	MakeupKit(int noOfItems,String brand,long contact){
		super();
		this.noOfItems=noOfItems;
		this.brand=brand;
		this.contact=contact;
	    System.out.println("Make up kit no of items:"+noOfItems+" brand:"+brand+" contact:"+contact);

	}
	MakeupKit(int noOfItems,String brand,long contact,String owner){
		super();
		this.noOfItems=noOfItems;
		this.brand=brand;
		this.contact=contact;
		this.owner=owner;
	    System.out.println("Make up kit no of items:"+noOfItems+" brand:"+brand+" contact:"+contact+" owner:"+owner);

	}
}