class CameraBegin{
	public static void main(String... args){
		
		DigitalCamera digitalcamera=new DigitalCamera("nikon",Color.BLACK,164,4);
		digitalcamera.show();
		
		HandCamera handcamera=new HandCamera(2,"canon",Color.WHITE,164,5);
		handcamera.show();
	}
}