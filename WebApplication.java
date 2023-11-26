class WebApplication extends Application{
	String[] supportedBrowsers;
	boolean free;
	
	WebApplication(){
		System.out.println("running no-arg constructor of WebApplication");
	}
	WebApplication(String[] supportedBrowsers,boolean free){
		this.supportedBrowsers=supportedBrowsers;
		this.free=free;
	}
	
	void connectInternet(){
		System.out.println("running connectInternet n WebApplication");
		sendUsage();
	}
	void sendUsage(){
		System.out.println("running sendusage n WebApplication");
	}
	void show(){
		System.out.println("starting show in WebApplication");
		if(supportedBrowsers!=null){
			for(int seq=0;seq<supportedBrowsers.length;seq++){
			String ref=supportedBrowsers[seq];
			System.out.println(ref+" at location "+seq);
			}
		}
		System.out.println("ending show in WebApplication");
	}
}