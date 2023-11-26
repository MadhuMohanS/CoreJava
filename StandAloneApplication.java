class StandAloneApplication extends Application{
	double size;
	String compatibleWith;
	Os os;
	
	StandAloneApplication(){
		System.out.println("running no-arg constructor of StandAloneApplication");
	}
	
	StandAloneApplication(double size,String compatibleWith,Os os){
		this.size=size;
		this.compatibleWith=compatibleWith;
		this.os=os;
	}
	
	void consumerMemory(){
		System.out.println("running consumerMemory in StandAloneApplication");
		consumeInternet();
	}
	void consumeInternet(){
		System.out.println("running consumeInternet in StandAloneApplication");
	}
 
  void show(){
	  System.out.println("starting show in StandAloneApplication");
	  System.out.println("size:"+size);
	  System.out.println("compatibleWith"+compatibleWith);
	  System.out.println("Os:"+os);
	  System.out.println("ending show in StandAloneApplication");
  }
	
}