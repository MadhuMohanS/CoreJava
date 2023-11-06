class Tent{
int slNo=10;
enum Color{
		RED,BLUE,BLACK,WHITE,ORANGE,GREY,YELLOW;
}
double width=100,height=200;

boolean open(){
	System.out.println("starting open in Tent");
	System.out.println("this is an open function");
	System.out.println("ending open in Tent");
	return false;
}

boolean close(){
	System.out.println("starting close in Tent");
	System.out.println("this is an close function");
	System.out.println("ending close in Tent");
	return false;
}

void showInfo(){
	System.out.println("starting showinfo in Tent");
	System.out.println("sl no:"+slNo);
	Color color=Color.RED;
	System.out.println("color:"+color);
	System.out.println("width:"+width);
	System.out.println("Height:"+height);
	open();
	close();
	System.out.println("ending showinfo in Tent");
}
}