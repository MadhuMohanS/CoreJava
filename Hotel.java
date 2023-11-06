class Hotel{
	String name;
	String ownerName;
	MenuCard menucard;
	void setNameAndownerName(String name,String ownerName,MenuCard menucard){
		this.name=name;
		this.ownerName=ownerName;
		this.menucard=menucard;
	}
	
	
	
	
	void showInfo(){
		System.out.println("starting showInfo in Hotel");
		System.out.println("name:"+name);
		System.out.println("ownerName:"+ownerName);
		System.out.println("total items:"+menucard.totalItems);
		System.out.println("cost:"+menucard.cost);
		System.out.println("ending showInfo in Hotel");
	}
}