class Application{
	int id;
	String name;
    Type type;
	double version;
	String developer;
	String date;
	
	Application(){
		System.out.println("running no-arg constructor of Application");
	}
	Application(int id,String name,Type type,double version,String developer,String date){
		this.id=id;
		this.name=name;
		this.type=type;
		this.version=version;
		this.developer=developer;
		this.date=date;
	}
	void run(){
		System.out.println("running run method in Application");
		stop();
		execute();
		collectInfo();
		displayInfo();
	}
	void stop(){
		System.out.println("running stop method in Application");
	}
	void execute(){
		System.out.println("running execute method in Application");
	}
	void collectInfo(){
		System.out.println("running collectInfo method in Application");
	}
	void displayInfo(){
		System.out.println("running displayInfo method in Application");
	}
	
	void show(){
		System.out.println("starting show in Application");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("type:"+type);
		System.out.println("version:"+version);
		System.out.println("developer:"+developer);
		System.out.println("date:"+date);
		System.out.println("ending show in Application");
	}
}