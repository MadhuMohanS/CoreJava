class Game{
int id;
String name;
enum TotalPlayers{
		THIRTEEN,FOURTEEN,FIFTEEN;
}
String origin;

Game(int id,String name,String origin){
	this.id=id;
	this.name=name;
	this.origin=origin;
}

void play(){
	System.out.println("starting play in Game");
	System.out.println("this is play method");
	System.out.println("ending play in Game");
}

void pause(){
	System.out.println("starting pause in Game");
	System.out.println("this is pause method");
	System.out.println("ending pause in Game");
}

void end(){
	System.out.println("starting end in Game");
	System.out.println("this is end method");
	System.out.println("ending end in Game");
}

void showInfo(){
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	TotalPlayers tp=TotalPlayers.THIRTEEN;
	System.out.println("total players:"+tp);
	play();
	pause();
	end();
}

}