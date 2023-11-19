class WoodBegin{
	public static void main(String args[]){
		System.out.println("starting main in Woodbegin");
		Wood wood=new Bat();
		
		Bat bat=(Bat)wood;
		wood.cut();
		bat.hit();
		System.out.println("ending main in Woodbegin");
	}
}