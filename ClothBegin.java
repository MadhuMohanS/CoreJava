class ClothBegin{
	public static void main(String args[]){
		System.out.println("starting main in clothbegin");
		
		Cloth cloth=new Pant();
		Cloth cloth1=new JeansPant();
		Cloth cloth2=new TornJeans();
		Cloth cloth3=new MediumSizePant();
		
		System.out.println("==================================");
		
		Pant pant=new JeansPant();
		Pant pant1=new TornJeans();
		Pant pant2=new MediumSizePant();
		
		System.out.println("==================================");
		
		JeansPant jeanspant=new TornJeans();
		JeansPant jeanspant1=new MediumSizePant();
		
		System.out.println("==================================");
		
		TornJeans tornjeans=new MediumSizePant();
		System.out.println("ending main in clothbegin");
	}
}