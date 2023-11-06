class MainBegin{
public static void main(String args[]){
	System.out.println("starting main in MainBegan");
	Tent tent=new Tent();
	Agent agent=new Agent();
	System.out.println("====================================");
	agent.openTent(tent);
	System.out.println("====================================");
	agent.closeTent(tent);
	System.out.println("====================================");
	agent.showInfo();
	System.out.println("====================================");
	Game game=new Game(100,"FootBall","Argentina");
	game.showInfo();
	Player player=new Player();
	player.setName("Leonelli messi");
	player.showInfo();
	System.out.println("====================================");
	System.out.println("ending main in MainBegan");
}
}