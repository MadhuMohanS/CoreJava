class RestaurantBegin{
	public static void main(String args[]){
		System.out.println("starting main in RestaurantBegin");
		String items[]=new String[5];
		items[0]="Pizza";
		items[1]="Parota";
		items[2]="paneer palav";
		items[3]="tandoori";
		items[4]="veg khadai";
		Restaurant restaurant=new Restaurant("Escape",items);
		restaurant.showInfo();

		System.out.println("ending main in RestaurantBegin");
	}
}