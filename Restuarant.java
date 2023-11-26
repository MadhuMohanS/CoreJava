class Restuarant{
	String ownerName;
	String[] specialItems;
	
	Restuarant(String ownerName,String[] specialItems){
		this.ownerName=ownerName;
		this.specialItems=specialItems;
	}
	
	void show(){
		System.out.println("starting show in Restuarant");
		for(int seq=0;seq<specialItems.length();seq++){
			String ref=specialItems[seq];
			System.out.println(ref);
		}
		System.out.println("ending show in Restuarant");
	}
}