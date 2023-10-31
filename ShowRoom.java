class ShowRoom{
	String name;
	String type;
	int noOfVehicles;
	String dimension;
	String ceo;
	int noOfBranches;
	double profit;
	String brandAmbassador;
	
	ShowRoom(){
		System.out.println("ShowRoom is created");
	}
	ShowRoom(String name){
		this.name=name;
	}
	ShowRoom(String name,String type){
		this.name=name;
		this.type=type;
	}
	ShowRoom(String name,String type,int noOfVehicles){
		this.name=name;
		this.type=type;
		this.noOfVehicles=noOfVehicles;
	}
	ShowRoom(String name,String type,int noOfVehicles,String dimension){
		this.name=name;
		this.type=type;
		this.noOfVehicles=noOfVehicles;
		this.dimension=dimension;
	}
	ShowRoom(String name,String type,int noOfVehicles,String dimension,String ceo){
		this.name=name;
		this.type=type;
		this.noOfVehicles=noOfVehicles;
		this.dimension=dimension;
		this.ceo=ceo;
	}
	ShowRoom(String name,String type,int noOfVehicles,String dimension,String ceo,int noOfBranches,double profit){
		this.name=name;
		this.type=type;
		this.noOfVehicles=noOfVehicles;
		this.dimension=dimension;
		this.ceo=ceo;
		this.noOfBranches=noOfBranches;
		this.profit=profit;
	}
	ShowRoom(String name,String type,int noOfVehicles,String dimension,String ceo,int noOfBranches,double profit,String brandAmbassador){
		this.name=name;
		this.type=type;
		this.noOfVehicles=noOfVehicles;
		this.dimension=dimension;
		this.ceo=ceo;
		this.noOfBranches=noOfBranches;
		this.profit=profit;
		this.brandAmbassador=brandAmbassador;
	}
}