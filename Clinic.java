class Clinic{
	String specialization;
	int totalBeds;
	int totalPatients;
	
	Doctor doctor=new Doctor();
	
	
	
	void showInfo(){
		doctor.name="Dr.vignesh";
		doctor.exp=5.4;
		doctor.fake=false;
		doctor.fees=1000.0;
		System.out.println("starting showInfo in Clinic");
		System.out.println("Clinic name:"+doctor.name);
		System.out.println("experience:"+doctor.exp);
		System.out.println("fake:"+doctor.fake);
		System.out.println("fees:"+doctor.fees);
		System.out.println("specialization:"+specialization);
		System.out.println("total Beds:"+totalBeds);
		System.out.println("total patients:"+totalPatients);
		System.out.println("ending showInfo in Clinic");
	}
	
}
