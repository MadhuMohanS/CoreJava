class ClockBegin{
public static void main(String args[]){
String type;
	double weight;
	int character;
	String shopName;
	Clock clock=new Clock();
	Clock clock1=new Clock(400.0);
	Clock clock2=new Clock(400.0,"FastTrack");
	Clock clock3=new Clock(400.0,"FastTrack","Sanggetha");
	Clock clock4=new Clock(400.0,"FastTrack","Sanggetha","Banglore");
	Clock clock5=new Clock(400.0,"FastTrack","Sanggetha","Banglore","Box");
	
	Rocket rocket=new Rocket();
	Rocket rocket1=new Rocket("Chandrayana-3");
	Rocket rocket2=new Rocket("Chandrayana-3","3/17/2020");
	Rocket rocket3=new Rocket("Chandrayana-3","3/17/2020","ISRO");
	Rocket rocket4=new Rocket("Chandrayana-3","3/17/2020","ISRO",4000);

	MakeupKit makeupkit=new MakeupKit();
	MakeupKit makeupkit1=new MakeupKit(15);
	MakeupKit makeupkit2=new MakeupKit(15,"Nyka");
	MakeupKit makeupkit3=new MakeupKit(15,"Nyka",9667493765l);
	MakeupKit makeupkit4=new MakeupKit(15,"Nyka",9667493765l,"Vinodh");
	
	Wallet wallet=new Wallet();
	Wallet wallet1=new Wallet(500);
	Wallet wallet2=new Wallet(500,"gucci");
	Wallet wallet3=new Wallet(500,"Woodland","Woodland");
	Wallet wallet4=new Wallet(500,"Woodland","Woodland","Banglore");
	
	Ornament ornament=new Ornament();
	Ornament ornament1=new Ornament("Gold");
	Ornament ornament2=new Ornament("Gold",100);
	Ornament ornament3=new Ornament("Gold",100,80);
	Ornament ornament4=new Ornament("Gold",100,80,"Khajzana");
}
}