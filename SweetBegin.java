class SweetBegin{
	public static void main(String args[]){
		System.out.println("starting main in SweetBegin");
		Food food=new Sweet();
		Food food1=new Ladoo();
		Food food2=new MotichuruLadoo();
		
		System.out.println("==================================");
		
		Sweet sweet1=new Ladoo();
		Sweet sweet2=new MotichuruLadoo();
		
		System.out.println("==================================");
		
		Ladoo ladoo=new MotichuruLadoo();
		
		System.out.println("==================================");
		System.out.println("ending main in SweetBegin");
	}
}