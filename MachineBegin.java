class MachineBegin{
	public static void main(String args[]){
		System.out.println("starting main in machinebegin");
		Machine machine=new Generator();
		
		
		Generator generator=(Generator)machine;
		
		generator.charge();
		generator.switchOn();
		System.out.println("ending main in machinebegin");
	}
}