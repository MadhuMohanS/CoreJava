class Restaurant{
 String ownerName;
String specialItems[];

Restaurant(String name,String specialItems[]){
	this.ownerName=ownerName;
	this.specialItems=specialItems;
}

void showInfo(){
	System.out.println("starting showInfo in Restaurant");
	System.out.println("name:"+ownerName);
	if(this.specialItems!=null){
		System.out.println("special items list are:");
	for(int seq=0;seq<this.specialItems.length;seq++){
		
		String ref=this.specialItems[seq];
		System.out.println("special item "+ref+" at index "+seq);
	}
	}else{
		System.out.println("there is no list");
	}
	System.out.println("ending showInfo in Restaurant");
} 
}