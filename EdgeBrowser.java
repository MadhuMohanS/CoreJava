class EdgeBrowser extends Browser{
	
	@Override
	void run(){
		System.out.println("running run method in Application--->Override Method in EdgeBrowser");
	    stop();
		execute();
		collectInfo();
		displayHistory();
		displayInfo();
		consumerMemory();
		consumeInternet();
		settings();
	}
	@Override
	void stop(){
		System.out.println("running stop method in Application--->Override Method in EdgeBrowser");
	}
	@Override
	void execute(){
		System.out.println("running execute method in Application--->Override Method in EdgeBrowser");
	}
	@Override
	void collectInfo(){
		System.out.println("running collectInfo method in Application--->Override Method in EdgeBrowser");
	}
	@Override
	void displayInfo(){
		System.out.println("running displayInfo method in Application--->Override Method in EdgeBrowser");
	}
	@Override
	void consumerMemory(){
		System.out.println("running consumerMemory in StandAloneApplication--->Override Method in EdgeBrowser");
	}
	@Override
	void consumeInternet(){
		System.out.println("running consumeInternet in StandAloneApplication--->Override Method in EdgeBrowser");
	}
	@Override
	void settings(){
		System.out.println("running settings in Browser--->Override Method in EdgeBrowser");
	}
	@Override
	void displayHistory(){
		System.out.println("running displayHistory in Browser--->Override Method in EdgeBrowser");
	}
}