class Camera{
	String brand;
	Color color;
	int pixel;
	double batteryDuration;
	
	Camera(String brand,Color color,int pixel,double batteryDuration){
		this.brand=brand;
		this.color=color;
		this.pixel=pixel;
		this.batteryDuration=batteryDuration;
	}
	
	void show(){
		System.out.println("starting show in Camera");
		System.out.println("brand:"+this.brand);
		System.out.println("color:"+this.color);
		System.out.println("pixel:"+this.pixel);
		System.out.println("batteryDuration:"+this.batteryDuration);
		System.out.println("ending show in Camera");
	}
	
}