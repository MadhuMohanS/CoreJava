class Course{
	String name;
	int duration;
	String center;
	double cost;
	String address;
	String TrainerName;
	int noOfBranches;
	
	Course(String name,int duration,String center,double cost,String address,String TrainerName,int noOfBranches){
		this.name=name;
		this.duration=duration;
		this.center=center;
		this.cost=cost;
		this.address=address;
		this.TrainerName=TrainerName;
		this.noOfBranches=noOfBranches;
	}
	
	void displayInfo(){
		System.out.println("starting displayInfo in course");
		System.out.println("Course name:"+name+" duration:"+duration+" center:"+center+" cost:"+cost+" address:"+address+" TrainerName:"+TrainerName+" no of branches:"+noOfBranches);
		System.out.println("ending displayInfo in course");
	}
}