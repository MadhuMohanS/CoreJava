class Printer{
	String type;
	String name;
	int noOfPages;
	String brand;
	String connection;
	
	Printer(){
		super();
		System.out.println("invoking no argument constructor with in same class");
	}
	Printer(String type){
		this.type=type;
		System.out.println("Printer type:"+type);
	}
	Printer(String type,String name){
		this(type);
		System.out.println("invoking String reference constructor with in same class");
		this.name=name;
		System.out.println("Printer name:"+name+" type:"+type);
	}
	Printer(String type,String name,int noOfPages){
		this(type,name);
		this.noOfPages=noOfPages;
		System.out.println("invoking String string constructor with in same class");
		System.out.println("Printer name:"+name+" type:"+type+" no of pages"+noOfPages);
	}
	Printer(String type,String name,int noOfPages,String brand){
		this(type,name,noOfPages);
		this.brand=brand;
		System.out.println("invoking String string int constructor with in same class");

		System.out.println("Printer name:"+name+" type:"+type+" no of pages"+noOfPages+" brand:"+brand);
	}
	Printer(String type,String name,int noOfPages,String brand,String connection){
		this(type,name,noOfPages,brand);
		this.connection=connection;
		System.out.println("invoking String string int String constructor with in same class");

		System.out.println("Printer name:"+name+" type:"+type+" no of pages"+noOfPages+" brand:"+brand+" Connection:"+connection);
	}
}