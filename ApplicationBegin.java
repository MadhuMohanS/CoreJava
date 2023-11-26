class ApplicationBegin{
	public static void main(String args[]){
		System.out.println("starting main in ApplicationBegin");
		Application application=new Application(101,"BusTracker",Type.ANDROID,3.0,"Madhu","31-01-2023");
	        application.run();
			application.show();
			
		StandAloneApplication standAloneApplication=new StandAloneApplication(15.37,"Android",Os.WINDOWS);
		standAloneApplication.consumerMemory();
		standAloneApplication.show();
		
		String[] supported={"chrome","edge","ucbrowser","firefox"};
		WebApplication webApplication=new WebApplication(supported,true);
		webApplication.connectInternet();
		webApplication.show();
		
		String[] downloads={"resume.pdf","image.jpg","radhe.mp3"}; 
		String[] history={"facebook.com","instagram.com","todaypk.com","java tutorial.com"};
		Browser browser=new Browser(downloads,history);
		browser.settings();
		browser.show();
		
		String[] favourite={"aluma","vathiraid","vikramtitle","kan kanna salige"}; 
		MediaPlayer mediaPlayer=new MediaPlayer(favourite);
	    mediaPlayer.play();
		mediaPlayer.show();
		
		ChromeBrowser chromeBrowser=new ChromeBrowser();
		chromeBrowser.run();
		
		EdgeBrowser edgeBrowser=new EdgeBrowser();
		edgeBrowser.run();
		
		FireFoxBrowser firefoxbrowser=new FireFoxBrowser();
		firefoxbrowser.run();
		System.out.println("ending main in ApplicationBegin");
	}
	
}