class Browser extends StandAloneApplication{
	String[] downloads;
	String[] browsingHistorySites;
	
	Browser(){
		System.out.println("running no-arg constructor of Browser");
	}
	Browser(String[] downloads,String[] browsingHistorySites){
		this.downloads=downloads;
		this.browsingHistorySites=browsingHistorySites;
	}
	
	void settings(){
		System.out.println("running settings in Browser");
		displayHistory();
	}
	void displayHistory(){
		System.out.println("running displayHistory in Browser");
	}
	void show(){
		System.out.println("starting show in Browser");
		if(downloads!=null){
			for(int seq=0;seq<downloads.length;seq++){
			String ref=downloads[seq];
			System.out.println(ref+" at location :"+seq);
			}
		}
		if(browsingHistorySites!=null){
			for(int seq=0;seq<browsingHistorySites.length;seq++){
			String ref=browsingHistorySites[seq];
			System.out.println(ref+" at location :"+seq);
			}
		}
		System.out.println("ending show in Browser");
	}
}