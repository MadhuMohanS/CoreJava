class PrinterBegin{
public static void main(String args[]){
	

	System.out.println("Starting main in printerBegin");
	Printer printer=new Printer();
	Printer printer1=new Printer("Laser");
	Printer printer2=new Printer("Laser","clm");
	Printer printer3=new Printer("Laser","clm",100);
	Printer printer4=new Printer("Laser","clm",100,"Lenovo");
	Printer printer5=new Printer("Laser","clm",100,"Lenovo","Wired");
	
	System.out.println("-----------------------------");
	
	Helmet helmet=new Helmet();
	Helmet helmet1=new Helmet("Royal & field");
	Helmet helmet2=new Helmet("Royal & field","blue");
	Helmet helmet3=new Helmet("Royal & field","blue","fiber");
	Helmet helmet4=new Helmet("Royal & field","blue","fiber","bike");
	Helmet helmet5=new Helmet("Royal & field","blue","fiber","bike",1500.0);
	
	System.out.println("-----------------------------");
	
	KeyChain keychain=new KeyChain();
    KeyChain keychain1=new KeyChain(20);
	KeyChain keychain2=new KeyChain(20,"red");
	KeyChain keychain3=new KeyChain(20,"red","heart");
	KeyChain keychain4=new KeyChain(20,"red","heart","dil");
	KeyChain keychain5=new KeyChain(20,"red","heart","dil","BikeKeychain");
	
	System.out.println("-----------------------------");
	
	Bracelet bracelet=new Bracelet();
	Bracelet bracelet1=new Bracelet(200);
	Bracelet bracelet2=new Bracelet(200,"black");
	Bracelet bracelet3=new Bracelet(200,"black","Round");
	Bracelet bracelet4=new Bracelet(200,"black","Round","Box");
	Bracelet bracelet5=new Bracelet(200,"black","Round","Box","silver");
	
	Carrom carrom=new Carrom();
	Carrom carrom1=new Carrom("Pauper");
	Carrom carrom2=new Carrom("Pauper",1000);
	Carrom carrom3=new Carrom("Pauper",1000,"Boxer");
	Carrom carrom4=new Carrom("Pauper",1000,"Boxer","Wooden");
	Carrom carrom5=new Carrom("Pauper",1000,"Boxer","Wooden","plastic");
	System.out.println("Starting main in printerBegin");
	
}
}