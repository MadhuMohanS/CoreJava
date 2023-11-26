class Carrom{
	String game;
	double cost;
	String company;
	String type;
	String typeOfCoins;
	
	Carrom(){
		this("Pauper",1000,"Boxer","Wooden","plastic");
	}
	
	Carrom(String game){
		this.game=game;
		System.out.println("carrom game is:"+game);
	}
	Carrom(String game,double cost){
		this(game);
		this.cost=cost;
		System.out.println("carrom game is:"+game+" cost:"+cost);
	}
	Carrom(String game,double cost,String company){
		this(game,cost);
		this.company=company;
		System.out.println("carrom game is:"+game+" cost:"+cost+" company:"+company);
	}
	
	Carrom(String game,double cost,String company,String type){
		this(game,cost,company);
		this.type=type;
		System.out.println("carrom game is:"+game+" cost:"+cost+" company:"+company+" type:"+type);
	}
	
	Carrom(String game,double cost,String company,String type,String typeOfCoins){
		this(game,cost,company,type);
		this.typeOfCoins=typeOfCoins;
		System.out.println("carrom game is:"+game+" cost:"+cost+" company:"+company+" type:"+type+" type of coins:"+typeOfCoins);
	}
	
}