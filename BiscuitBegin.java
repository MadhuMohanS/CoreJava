class BiscuitBegin{
	public static void main(String args[]){
		System.out.println("starting main in BiscuitBegin");
		
		Food food1=new Biscuit();
		Food food2=new Tiger();
		Food food3=new SpecialTiger();
		Food food4=new GlucoTiger();
		Food food5=new Parle();

		System.out.println("==================================");
		
        Biscuit biscuit1=new Tiger();
		Biscuit biscuit2=new SpecialTiger();
		Biscuit biscuit3=new GlucoParle();
		Biscuit biscuit4=new Parle();
		
		System.out.println("==================================");
		
		Tiger tiger1=new SpecialTiger();
		Tiger tiger2=new GlucoTiger();
		
		System.out.println("==================================");
		
		Parle parle=new GlucoParle();
		System.out.println("ending main in BiscuitBegin");
	}
}