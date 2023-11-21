class LaminatedGlass extends Glass{
	double cost;
	int warranty;
	
	LaminatedGlass(double cost,int warranty,double length,int thickness,GlassType type,String usage,String brand){
		super(length,thickness,type,usage,brand);
		this.cost=cost;
		this.warranty=warranty;
		
		System.out.println("cost:"+this.cost);
		System.out.println("warranty:"+this.warranty);
	}
}