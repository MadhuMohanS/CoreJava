class Ornament{
	String type;
	double weight;
	int character;
	String shopName;
	
	Ornament(){
		super();
	}
	Ornament(String type){
		super();
		this.type=type;
		System.out.println("Ornament type:"+type);
	}
	Ornament(String type,double weight){
		super();
		this.type=type;
		this.weight=weight;
		System.out.println("Ornament type:"+type+" weight:"+weight);
	}
	Ornament(String type,double weight,int character){
		super();
		this.type=type;
		this.weight=weight;
		this.character=character;
		System.out.println("Ornament type:"+type+" weight:"+weight+" character:"+character);
	}
	Ornament(String type,double weight,int character,String shopName){
		super();
		this.type=type;
		this.weight=weight;
		this.character=character;
		this.shopName=shopName;
		System.out.println("Ornament type:"+type+" weight:"+weight+" character:"+character+" shop name:"+shopName);
	}
}