class Technology{
	int noOfTechnologies;
	int noOfIdes;
	String names;
	String technologiesComesUnderCourse;
	String ideNames;
	String Hardware;
	String hardwareNeeds;
	String founderOfTechnology;
	String scopeOfHiring;
	int technologyParts;
	String center;
	String trainerName;
	
	Technology(int noOfTechnologies,int noOfIdes,String names,String technologiesComesUnderCourse,String ideNames,String Hardware,String hardwareNeeds,String founderOfTechnology,String scopeOfHiring,int technologyParts,String center,String trainerName){
		this.noOfTechnologies=noOfTechnologies;
		this.noOfIdes=noOfIdes;
		this.names=names;
		this.technologiesComesUnderCourse=technologiesComesUnderCourse;
		this.ideNames=ideNames;
		this.Hardware=Hardware;
		this.hardwareNeeds=hardwareNeeds;
		this.founderOfTechnology=founderOfTechnology;
		this.scopeOfHiring=scopeOfHiring;
		this.technologyParts=technologyParts;
		this.center=center;
		this.trainerName=trainerName;
		
	}
	
	void displayInfo(){
		System.out.println("starting displayInfo in Technology");
		System.out.println("no of technology:"+noOfTechnologies+" no of ides"+noOfIdes+" names:"+names+" technologiesComesUnderCourse:"+technologiesComesUnderCourse);
		System.out.println("ide names:"+ideNames+" hardware:"+Hardware+" hardwareNeeds:"+hardwareNeeds+" founderOfTechnology:"+founderOfTechnology+" scopeOfHiring:"+scopeOfHiring);
		System.out.println("technology parts:"+technologyParts+" center:"+center+" trainer name:"+trainerName);
		System.out.println("starting displayInfo in Technology");
	}
	
	
}