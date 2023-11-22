class LgRemote extends Remote{
	int warranty;
	int totalBatteries;
	
	LgRemote(UsedFor usedFor,int totalButtons,boolean original,int warranty,int totalBatteries){
		super(usedFor,totalButtons,original);
		this.warranty=warranty;
		this.totalBatteries=totalBatteries;
	}
	
	void voiceCommand(){
		System.out.println("running voiceCommand in LgRemote");
	}
	
	@Override
	void on(){
		System.out.println("overriding inherited method on()");
	}
	
	@Override
	void off(){
		System.out.println("overriding inherited method off()");
	}
}