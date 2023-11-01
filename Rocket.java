class Rocket{
String name;
String inventionDate;
String inventor;
int speed;

Rocket(){
	super();
}
Rocket(String name){
	super();
	this.name=name;
	System.out.println("Rocket name:"+name);
	
}
Rocket(String name,String inventionDate){
	super();
	this.name=name;
	this.inventionDate=inventionDate;
	System.out.println("Rocket name:"+name+" invention Date:"+inventionDate);
	
}
Rocket(String name,String inventionDate,String inventor){
	super();
	this.name=name;
	this.inventionDate=inventionDate;
	this.inventor=inventor;
	System.out.println("Rocket name:"+name+" invention Date:"+inventionDate+" inventor:"+inventor);
	
}
Rocket(String name,String inventionDate,String inventor,int speed){
	super();
	this.name=name;
	this.inventionDate=inventionDate;
	this.inventor=inventor;
	this.speed=speed;
	System.out.println("Rocket name:"+name+" invention Date:"+inventionDate+" inventor:"+inventor+" speed:"+speed);
	
}
}