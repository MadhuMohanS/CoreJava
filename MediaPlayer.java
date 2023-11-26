class MediaPlayer extends StandAloneApplication{
	String[] favourites;
	
	MediaPlayer(){
		System.out.println("running no-arg constructor of MediaPlayer");
	}
	MediaPlayer(String[] favourites){
		this.favourites=favourites;
	}
	
	void play(){
		System.out.println("running play in MediaPlayer");
		delete();
		download();
	}
	void delete(){
		System.out.println("running delete in MediaPlayer");
	}
	void download(){
		System.out.println("running download in MediaPlayer");
	}
	void show(){
	System.out.println("starting show in MediaPlayer ");
	if(favourites!=null){
			for(int seq=0;seq<favourites.length;seq++){
			String ref=favourites[seq];
			System.out.println(ref+" at location :"+seq);
			}
		}
System.out.println("ending show in MediaPlayer ");	
	}
}