class Free{
	String what;
	String why;
	String freeForAll;
	
	Free(String what,String why,String freeForAll){
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
	}
	void displayInfo(){
		System.out.println("starting displayInfo in Free");
		System.out.println("what is free in institution:"+what);
		System.out.println("why it is free in institution:"+why);
		System.out.println("is it free for all:"+freeForAll);
		System.out.println("ending displayInfo in Free");

	}
}