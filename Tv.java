class Tv{
String display;
Speaker speaker;
Tv(Speaker speaker,String display){
	this.speaker=speaker;
	this.display=display;
}

void showInfo(){
	System.out.println("starting showInfo in Tv");
	System.out.println("display:"+display);
	System.out.println("max volume:"+speaker.maxVolume);
	System.out.println("ending showInfo in Tv");
}

}