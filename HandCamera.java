class HandCamera extends Camera{
	double weight;
	
	HandCamera(double weight,String brand,Color color,int pixel,double batteryDuration){
		super(brand,color,pixel,batteryDuration);
		this.weight=weight;
		System.out.println("weight:"+this.weight);
	}
}