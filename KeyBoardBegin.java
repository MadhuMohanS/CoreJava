class KeyBoardBegin{
	public static void main(String args[]){
		String brand,type;
	int noOfStick;
	double length,price,weight;
	char size;
		KeyBoard keyboard=new KeyBoard();
		KeyBoard keyboard1=new KeyBoard("Dell");
		System.out.println("keyboard1 name:"+keyboard1.brand);
		
		KeyBoard keyboard2=new KeyBoard("hp","white");
		System.out.println("keyboard2 name:"+keyboard2.brand);
		System.out.println("keyboard2 Color:"+keyboard2.color);
		
		KeyBoard keyboard3=new KeyBoard("Dell","red",150);
		System.out.println("keyboard3 name:"+keyboard3.brand);
		System.out.println("keyboard3 Color:"+keyboard3.color);
		System.out.println("keyboard3 no of keys:"+keyboard3.noOfKeys);
		
		KeyBoard keyboard4=new KeyBoard("lenovo","grey",250,"Wire Less");
		System.out.println("keyboard4 name:"+keyboard4.brand);
		System.out.println("keyboard4 Color:"+keyboard4.color);
		System.out.println("keyboard4 no of keys:"+keyboard4.noOfKeys);
		System.out.println("keyboard4 type is:"+keyboard4.type);
		
		KeyBoard keyboard5=new KeyBoard("Dell","cement",300,"Wire Less",350.0);
		System.out.println("keyboard5 name:"+keyboard5.brand);
		System.out.println("keyboard5 Color:"+keyboard5.color);
		System.out.println("keyboard5 no of keys:"+keyboard5.noOfKeys);
		System.out.println("keyboard5 type is:"+keyboard5.type);
		System.out.println("keyboard5 cost is:"+keyboard5.cost);
		
		MatchBox matchbox=new MatchBox();
		MatchBox matchbox1=new MatchBox("chavi");
		System.out.println("matchbox1 brand:"+matchbox1.brand);
		
		MatchBox matchbox2=new MatchBox("chavi","wooden");
		System.out.println("matchbox2 brand:"+matchbox2.brand);
		System.out.println("matchbox2 type:"+matchbox2.type);
		
		MatchBox matchbox3=new MatchBox("chavi","wooden",100);
		System.out.println("matchbox3 brand:"+matchbox3.brand);
		System.out.println("matchbox3 type:"+matchbox3.type);
		System.out.println("matchbox3 noOfStick:"+matchbox3.noOfStick);
		
		MatchBox matchbox4=new MatchBox("chavi","wooden",100,10);
		System.out.println("matchbox4 brand:"+matchbox4.brand);
		System.out.println("matchbox4 type:"+matchbox4.type);
		System.out.println("matchbox4 noOfStick:"+matchbox4.noOfStick);
		System.out.println("matchbox4 length:"+matchbox4.length);
		
		MatchBox matchbox5=new MatchBox("chavi","wooden",100,10,2,20);
		System.out.println("matchbox5 brand:"+matchbox5.brand);
		System.out.println("matchbox5 type:"+matchbox5.type);
		System.out.println("matchbox5 noOfStick:"+matchbox5.noOfStick);
		System.out.println("matchbox5 length:"+matchbox5.length);
		System.out.println("matchbox5 price:"+matchbox5.price);
		System.out.println("matchbox5 weight:"+matchbox5.weight);
		
		MatchBox matchbox6=new MatchBox("chavi","wooden",100,10,2,20);
		System.out.println("matchbox6 brand:"+matchbox6.brand);
		System.out.println("matchbox6 type:"+matchbox6.type);
		System.out.println("matchbox6 noOfStick:"+matchbox6.noOfStick);
		System.out.println("matchbox6 length:"+matchbox6.length);
		System.out.println("matchbox6 price:"+matchbox6.price);
		System.out.println("matchbox6 weight:"+matchbox6.weight);
		System.out.println("matchbox6 size:"+matchbox6.size);
		
		ShowRoom showroom=new ShowRoom();
		ShowRoom showroom1=new ShowRoom("Swift");
		System.out.println("showroom1 name:"+showroom1.name);
		
		ShowRoom showroom2=new ShowRoom("Swift","car");
		System.out.println("showroom2 name:"+showroom2.name);
		System.out.println("showroom2 type:"+showroom2.type);
		
		ShowRoom showroom3=new ShowRoom("Swift","car",40);
		System.out.println("showroom3 name:"+showroom2.name);
		System.out.println("showroom3 type:"+showroom2.type);
		System.out.println("showroom3 no of vehicles:"+showroom2.noOfVehicles);
		
		ShowRoom showroom4=new ShowRoom("Swift","car",40,"40*70");
		System.out.println("showroom4 name:"+showroom4.name);
		System.out.println("showroom4 type:"+showroom4.type);
		System.out.println("showroom4 no of vehicles:"+showroom4.noOfVehicles);
		System.out.println("showroom4 dimension:"+showroom4.dimension);
		
		ShowRoom showroom5=new ShowRoom("Swift","car",40,"40*70","Madhu");
		System.out.println("showroom5 name:"+showroom5.name);
		System.out.println("showroom5 type:"+showroom5.type);
		System.out.println("showroom5 no of vehicles:"+showroom5.noOfVehicles);
		System.out.println("showroom5 dimension:"+showroom5.dimension);
		System.out.println("showroom5 ceo:"+showroom5.ceo);
		
		ShowRoom showroom6=new ShowRoom("Swift","car",40,"40*70","Madhu",20,20000000);
		System.out.println("showroom6 name:"+showroom6.name);
		System.out.println("showroom6 type:"+showroom6.type);
		System.out.println("showroom6 no of vehicles:"+showroom6.noOfVehicles);
		System.out.println("showroom6 dimension:"+showroom6.dimension);
		System.out.println("showroom6 ceo:"+showroom6.ceo);
		System.out.println("showroom6 branches:"+showroom6.noOfBranches);
		System.out.println("showroom6 profit:"+showroom6.profit);
		
		ShowRoom showroom7=new ShowRoom("Swift","car",40,"40*70","Madhu",20,20000000,"Prabhas");
		System.out.println("showroom7 name:"+showroom7.name);
		System.out.println("showroom7 type:"+showroom7.type);
		System.out.println("showroom7 no of vehicles:"+showroom7.noOfVehicles);
		System.out.println("showroom7 dimension:"+showroom7.dimension);
		System.out.println("showroom7 ceo:"+showroom7.ceo);
		System.out.println("showroom7 branches:"+showroom7.noOfBranches);
		System.out.println("showroom7 profit:"+showroom7.profit);
		System.out.println("showroom7 brandAmbassador:"+showroom7.brandAmbassador);
		
	}
}