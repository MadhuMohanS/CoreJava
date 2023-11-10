class City{
	String name;
	String stateName;
	
	City(String name,String stateName){
		this.name=name;
		this.stateName=stateName;
	}
	
	void show(){
		System.out.println("starting show in City");
		System.out.println("name:"+this.name);
		System.out.println("stateName:"+this.stateName);
		System.out.println("ending show in City");
	}
}