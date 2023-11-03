class Placement{
	String company;
	String role;
	double salary;
	int noOfOpenings;
	String requiredSkills;
	int noOfApplications;
	String advertised;
	int experience;
	int noOfRounds;
	int noOfShortlisted;
	int noOfReference;
	String type;
	
	Placement(String company,String role,double salary,int noOfOpenings,String requiredSkills,int noOfApplications,String advertised,int experience,int noOfRounds,int noOfShortlisted,int noOfReference,String type){
		this.company=company;
		this.role=role;
		this.salary=salary;
		this.noOfOpenings=noOfOpenings;
		this.requiredSkills=requiredSkills;
		this.noOfApplications=noOfApplications;
		this.advertised=advertised;
		this.experience=experience;
		this.noOfRounds=noOfRounds;
		this.noOfShortlisted=noOfShortlisted;
		this.noOfReference=noOfReference;
		this.type=type;
	}
	
	void displayInfo(){
		System.out.println("starting displayInfo in placement");
		System.out.println("company name:"+company+" role:"+role+" salary:"+salary+" no of openings:"+noOfOpenings+" requrired skills:"+requiredSkills+" noOfApplications:"+noOfApplications);
		System.out.println("advertised:"+advertised+" experience:"+experience+" no of rounds:"+noOfRounds+" no of shortlisted:"+noOfShortlisted+" no of reference:"+noOfReference+" type:"+type);
		System.out.println("ending displayInfo in placement");
	}
}
