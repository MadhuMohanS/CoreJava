class Laptop{
	Hardware[] hardwares;
	Owner owner;
	Brand brand;
	
	Laptop(Hardware[] hardwares,Owner owner,Brand brand){
		this.hardwares=hardwares;
		this.brand=brand;
		this.owner=owner;
	}
	
	void show(){
	if(this.hardwares!=null){
		for(int seq=0;seq<this.hardwares.length;seq++){
			Hardware ref=this.hardwares[seq];
			ref.show();
		}
		owner.show();
	}
	
	}
}