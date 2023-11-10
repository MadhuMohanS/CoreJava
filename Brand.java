class Brand{
	String name;
	String origin;
	String ceoName;
	City[] cities;

	Brand(String name,String origin,String ceoName,City[] cities){
		this.name=name;
		this.origin=origin;
		this.ceoName=ceoName;
		this.cities=cities;
	}
	
	
	void show(){
		System.out.println("starting show in Brand");
		System.out.println("name:"+this.name);
		System.out.println("origin:"+this.origin);
		System.out.println("ceoName:"+this.ceoName);
		
		if(this.cities!=null){
			for(int seq=0;seq<this.cities.length;seq++){
				City ref=this.cities[seq];
				ref.show();
			}
		}
		System.out.println("ending show in Brand");
	}
}