class Person{
	String name;
	Email[] email;
	Person(String name,Email[] email){
		this.name=name;
		this.email=email;
	}
	
	void showInfo(){
		System.out.println("starting showInfo in Person");
		System.out.println("name:"+this.name);
		if(email!=null){
			for(int seq=0;seq<email.length;seq++){
				Email ref=email[seq];
				ref.showInfo();
			}
		}
		System.out.println("ending showInfo in Person");
	}
}
