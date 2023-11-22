class Son extends Father{
	String CollegeName;
	String branch;
	
	void educated(){
		System.out.println("running educated in son");
	}
	void respectParents(){
		System.out.println("running respectParents in son");
	}
	void familyResponsibility(){
		System.out.println("running familyResponsibility in son");
	}
	void goodSibling(){
		System.out.println("running goodSibling in son");
	}
	
	@Override
	void handlingPressure(){
		System.out.println("overriding inherited method handlingPressure()");
	}
	@Override
	void solvingProblems(){
		System.out.println("overriding inherited method solvingProblems()");
	}
	@Override
	void caringFamily(){
		System.out.println("overriding inherited method caringFamily()");
	}
	@Override
	void earning(){
		System.out.println("overriding inherited method earning()");
	}
	void show(){
		System.out.println("starting show in Son");
		System.out.println("Collegename:"+this.CollegeName);
		System.out.println("branch:"+this.branch);
		System.out.println("ending show in Son");
	}
	
}