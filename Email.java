class Email{
	String domain;
	String id;
	String fname;
	String lname;
	
	Email(){
		System.out.println("running no-arg constructor of email");
	}
	Email(String domain,String id,String fname,String lname){
		this.domain=domain;
		this.id=id;
		this.fname=fname;
		this.lname=lname;
	}
	
	void showInfo(){
		System.out.println("starting showInfo in email");
		System.out.println("domain:"+this.domain);
		System.out.println("id:"+id);
		System.out.println("fname:"+this.fname);
		System.out.println("lname:"+this.lname);
		System.out.println("ending showInfo in email");
	}
}