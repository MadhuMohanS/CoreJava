class Glass{
	double length;
	int thickness;
	GlassType type;
	String usage;
	String brand;
	
	Glass(double length,int thickness,GlassType type,String usage,String brand){
		this.length=length;
		this.thickness=thickness;
		this.type=type;
		this.usage=usage;
		this.brand=brand;
	}
	
	void show(){
		System.out.println("starting show in glass");
		System.out.println("length:"+this.length);
		System.out.println("thickness:"+this.thickness);
		System.out.println("type:"+this.type);
		System.out.println("usage:"+this.usage);
		System.out.println("brand:"+this.brand);
		System.out.println("ending show in glass");
	}
	
}