class Helmet{
	String brand;
	String color;
	String type;
	String typeOfVechile;
	double cost;
	
	Helmet(){
		this("Royal & field","blue","fiber","bike",1500.0);
	}
	Helmet(String brand){
		System.out.println("Helmet brand:"+brand);
	}
	Helmet(String brand,String color){
		this(brand);
		System.out.println("Helmet brand:"+brand+" color:"+color);
	}
	Helmet(String brand,String color,String type){
		this(brand,color);
		System.out.println("Helmet brand:"+brand+" color:"+color+" type:"+type);
	}
	Helmet(String brand,String color,String type,String typeOfVechile){
		this(brand,color,type);
		System.out.println("Helmet brand:"+brand+" color:"+color+" type:"+type+" type of vehicle:"+typeOfVechile);
	}
	Helmet(String brand,String color,String type,String typeOfVechile,double cost){
		this(brand,color,type,typeOfVechile);
		System.out.println("Helmet brand:"+brand+" color:"+color+" type:"+type+" type of vehicle:"+typeOfVechile+" cost:"+cost);
	}
}