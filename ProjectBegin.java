class ProjectBegin{
	public static void main(String args[]){
		System.out.println("starting main in ProjectBegin");
		Project project=new Project();
		Person1 person=new Person1();
		project.validate(person);
		
		Developer developer=new Developer();
		project.validate(developer);
		
		Tester tester=new Tester();
		project.validate(tester);
		
		DataBaseDeveloper databasedeveloper=new DataBaseDeveloper();
		project.validate(databasedeveloper);
		
		ProductOwner productowner=new ProductOwner();
		project.validate(productowner);
		
		BusinessAnalyst businessAnalyst=new BusinessAnalyst();
		project.validate(businessAnalyst);
		
		Devops devops=new Devops();
		project.validate(devops);
		
		
		System.out.println("ending main in ProjectBegin");
	}
}