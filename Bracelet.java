class Bracelet{
    double cost;
	String color;
	String shape;
	String symbol;
	String type;
	
	Bracelet(){
		this(200,"black","Round","Box","silver");
	}
	Bracelet(double cost){
		this.cost=cost;
		System.out.println("Bracelet cost:"+cost);
	}
	Bracelet(double cost,String color){
		this(cost);
		this.color=color;
		System.out.println("Bracelet cost:"+cost+" color:"+color);
	}
	Bracelet(double cost,String color,String shape){
		this(cost,color);
		this.shape=shape;
		System.out.println("Bracelet cost:"+cost+" color:"+color+" shape:"+shape);
	}
	Bracelet(double cost,String color,String shape,String symbol){
		this(cost,color,shape);
		this.symbol=symbol;
		System.out.println("Bracelet cost:"+cost+" color:"+color+" shape:"+shape+" symbol:"+symbol);
	}
	
	Bracelet(double cost,String color,String shape,String symbol,String type){
		this(cost,color,shape,symbol);
		this.type=type;
		System.out.println("Bracelet cost:"+cost+" color:"+color+" shape:"+shape+" symbol:"+symbol+" type:"+type);
	}
}