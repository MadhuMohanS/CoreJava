class Project{
	
	void validate(Person1 person){
		if(person!=null){
			person.eat();
			person.sleep();
			
			if(person instanceof Developer){
			Developer developer=(Developer)person;
			developer.eat();
			developer.sleep();
			developer.code();
		}
		if(person instanceof Tester){
			Tester tester=(Tester)person;
			tester.qualityCheck();
		}
		
		if(person instanceof DataBaseDeveloper){
			DataBaseDeveloper databasedeveloper=(DataBaseDeveloper)person;
			databasedeveloper.eat();
			databasedeveloper.sleep();
			databasedeveloper.runScripts();
		}
		if(person instanceof ProductOwner){
			ProductOwner productowner=new ProductOwner();
			productowner.eat();
		}
		if(person instanceof BusinessAnalyst){
			BusinessAnalyst businessAnalyst=(BusinessAnalyst)person;
			businessAnalyst.checkRequirements();
		}
		if(person instanceof Devops){
			Devops devops=(Devops)person;
			devops.runBuild();
		}
		}

		
	
		
	}
}