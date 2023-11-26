class KeyChain{
	double cost;
	String color;
	String shape;
	String symbol;
	String type;
	
	KeyChain(){
		this(20,"red","heart","dil","BikeKeychain");
	}
	KeyChain(double cost){
		this.cost=cost;
		System.out.println("KeyChain cost:"+cost);
	}
	KeyChain(double cost,String color){
		this(cost);
		this.color=color;
		System.out.println("KeyChain cost:"+cost+" color:"+color);
	}
	KeyChain(double cost,String color,String shape){
		this(cost,color);
		this.shape=shape;
		System.out.println("KeyChain cost:"+cost+" color:"+color+" shape:"+shape);
	}
	KeyChain(double cost,String color,String shape,String symbol){
		this(cost,color,shape);
		this.symbol=symbol;
		System.out.println("KeyChain cost:"+cost+" color:"+color+" shape:"+shape+" symbol:"+symbol);
	}
	
	KeyChain(double cost,String color,String shape,String symbol,String type){
		this(cost,color,shape,symbol);
		this.type=type;
		System.out.println("KeyChain cost:"+cost+" color:"+color+" shape:"+shape+" symbol:"+symbol+" type:"+type);
	}
	
}