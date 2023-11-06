class Agent{
	
int id=101;
String name="Virendar";
String company="Infosys";
Tent tent;
void openTent(Tent tent){
	this.tent=tent;
	System.out.println("sl no:"+tent.slNo);
	System.out.println("sl no:"+tent.width);
	System.out.println("sl no:"+tent.height);
	tent.open();
	tent.showInfo();
}

void closeTent(Tent tent){
	this.tent=tent;
	System.out.println("sl no:"+tent.slNo);
	System.out.println("sl no:"+tent.width);
	System.out.println("sl no:"+tent.height);
	tent.close();
	tent.showInfo();
}

void showInfo(){
	System.out.println("starting showinfo in Agent");
	openTent(tent);
	closeTent(tent);
	System.out.println("id:"+id);
	System.out.println("name:"+name);
	System.out.println("company:"+company);
	System.out.println("ending showinfo in Agent");

}
}