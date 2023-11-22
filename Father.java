class Father{
	int age;
	double height;
	double weight;
    Color color;
	String properties;
	int childrens;
	int wives;
	int vehicles;
	int houses;
	String friend;
	String shopName;
	String name;
	
	void setInstance(int age,double height,double weight,Color color,String properties,int childrens,int wives,int vehicles,int houses,String friend,String shopName,String name){
		this.age=age;
		this.height=height;
		this.weight=weight;
		this.color=color;
		this.properties=properties;
		this.childrens=childrens;
		this.wives=wives;
		this.vehicles=vehicles;
		this.houses=houses;
		this.friend=friend;
		this.shopName=shopName;
		this.name=name;
	}
	
    void healthy(){
		System.out.println("running healthy in Father");
	}

    void active(){
		System.out.println("running active in Father");
	}	
	void workoholic(){
		System.out.println("running workoholic in Father");
	}
	void kind(){
		System.out.println("running kind in Father");
	}
	void handlingPressure(){
		System.out.println("running handlingPressure in Father");
	}
	void solvingProblems(){
		System.out.println("running solvingProblems in Father");
	}
	void caringFamily(){
		System.out.println("running caringFamily in Father");
	}
	void earning(){
		System.out.println("running earning in Father");
	}
	void job(){
		System.out.println("running job in Father");
	}
	void leader(){
		System.out.println("running leader in Father");
	}
	void goodperson(){
		System.out.println("running goodperson in Father");
	}
	void show(){
		System.out.println("starting show in Father");
		System.out.println("age:"+age);
		System.out.println("height:"+height);
		System.out.println("weight:"+weight);
		System.out.println("color:"+color);
		System.out.println("properties:"+properties);
		System.out.println("childrens:"+childrens);
		System.out.println("wives:"+wives);
		System.out.println("vehicles:"+vehicles);
		System.out.println("houses:"+houses);
		System.out.println("friend:"+friend);
		System.out.println("shopName:"+shopName);
		System.out.println("name:"+name);
		System.out.println("ending show in Father");
	}
}