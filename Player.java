class Player{
	String name;
	Game game=new Game(100,"FootBall","Argentina");
	
	void setName(String name){
		this.name=name;
	}
	void showInfo(){
		System.out.println("starting showinfo in Player");
		System.out.println("name:"+name);
		System.out.println("game name:"+game.name);
		game.play();
		game.pause();
		game.end();
		System.out.println("starting showinfo in Player");
	}
	
}