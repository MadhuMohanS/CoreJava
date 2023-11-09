class Canteen{
	String type="Non-Veg";
	String[] utensils;
	
	void setUtensils(String[] utensils){
		this.utensils=utensils;
	}
	
	void showInfo(){
		System.out.println("starting showInfo in Canteen");
		System.out.println("name:"+type);
		System.out.println("utensils list are:");
		if(this.utensils!=null){
		for(int seq=0;seq<utensils.length;seq++){
			System.out.println("utensil "+utensils[seq]+" at index "+seq);
		}
		}else{
			System.err.println("please enter the values");
		}
		System.out.println("ending showInfo in Canteen");
	}
}