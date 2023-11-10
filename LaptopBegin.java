class LaptopBegin{
	
	public static void main(String args[]){
	
		System.out.println("starting main in LaptopBegin");
		City city=new City("banglore","Karnataka");
	City city1=new City("davangere","Karnataka");
	City city2=new City("darmavaram","AndraPradesh");
	City city3=new City("kochi","kerala");
	City city4=new City("chenai","tamilnadu");
	City city5=new City("hyderabad","Telangana");
	
	City[] cities={city,city1,city2,city3,city4,city5};
	
	Brand brand=new Brand("Amazon","USA","Jeffbezos",cities);
	
	Address address=new Address("BTM",577661,city);
	
	Owner owner=new Owner("Kiran@gmail.com",address,address);
	
	Brand brand1=new Brand("blueberry","london","venis",cities);
	Hardware hardware1=new Hardware("sensor","wireless",brand1);
	
	Brand brand2=new Brand("prada","italy","mario",cities);
	Hardware hardware2=new Hardware("sensor","wireless",brand2);
	
	Brand brand3=new Brand("gucci","newyork","gucci mark",cities);
	Hardware hardware3=new Hardware("sensor","wireless",brand3);
	
	Brand brand4=new Brand("H&m","newyork","mark",cities);
	Hardware hardware4=new Hardware("sensor","wireless",brand4);
	
	Brand brand5=new Brand("zara","india","zara Khan",cities);
	Hardware hardware5=new Hardware("sensor","wireless",brand5);
	
	Brand brand6=new Brand("H&m","newyork","mark",cities);
	Hardware hardware6=new Hardware("sensor","wireless",brand6);
	
	Brand brand7=new Brand("blueberry","london","venis",cities);
	Hardware hardware7=new Hardware("sensor","wireless",brand7);
	
	Brand brand8=new Brand("prada","italy","mario",cities);
	Hardware hardware8=new Hardware("sensor","wireless",brand8);
	
	Brand brand9=new Brand("gucci","newyork","gucci mark",cities);
	Hardware hardware9=new Hardware("sensor","wireless",brand9);
	
	
	
	Hardware[] hardwares={hardware1,hardware2,hardware3,hardware4,hardware5,hardware6,hardware7,hardware8,hardware9};
	Laptop laptop=new Laptop(hardwares,owner,brand1);
	laptop.show();
		System.out.println("ending main in LaptopBegin");
	}
}