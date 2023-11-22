class FatherBegin{
	public static void main(String args[]){
		System.out.println("starting main in FatherBegin");
		Father father=new Father();
		father.setInstance(50,167,70,Color.WHITE,"2 sites",2,1,3,1,"virendar","Amar","Subramanya");
		father.healthy();
		father.active();
		father.workoholic();
		father.kind();
		father.handlingPressure();
		father.solvingProblems();
		father.caringFamily();
		father.earning();
		father.job();
		father.leader();
		father.goodperson();
		father.show();
		
		Son son=new Son();
		son.CollegeName="Reva";
		son.branch="MCA";
		son.educated();
		son.respectParents();
		son.familyResponsibility();
		son.goodSibling();
		son.handlingPressure();
		son.solvingProblems();
		son.caringFamily();
		son.earning();
		son.show();
		System.out.println("ending main in FatherBegin");
		
	}
}