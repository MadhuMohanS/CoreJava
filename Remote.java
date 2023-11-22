class Remote{
	UsedFor usedFor;
	int totalButtons;
	boolean original;
	
	Remote(UsedFor usedFor,int totalButtons,boolean original){
		this.usedFor=usedFor;
		this.totalButtons=totalButtons;
		this.original=original;
	}
	
	void on(){
		System.out.println("running on in remote");
	}
	void off(){
		System.out.println("running off in remote");
	}
	
	void increaseVolume(){
		System.out.println("running increaseVolume in remote");
	}
	
	void decreaseVolume(){
		System.out.println("running decreaseVolume in remote");
	}
	
	void changeChannel(){
		System.out.println("running changeChannel in remote");
	}
	
	
}