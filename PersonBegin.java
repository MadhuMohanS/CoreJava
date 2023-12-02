class PersonBegin{
	public static void main(String... args){
		
		
		Email email=new Email(".com","madhu@gmail.com","madhu","madhu");
		Email email1=new Email(".com","ajayb@gmail.com","ajay","b");
		Email email2=new Email(".com","vijaykamal@gmail.com","vijay","kamal");
		
		Email[] emails={email,email1,email2};
		
		Person person=new Person("Madhu Mohan",emails);
		person.showInfo();
	}
}