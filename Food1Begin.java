class Food1Begin{
	public static void main(String args[]){
		System.out.println("starting main in Food1Begin");
		Plant plant=new Food1();
		
		Food1 food=(Food1)plant;
		food.grow();
		food.taste();
		System.out.println("ending main in Food1Begin");
	}
}