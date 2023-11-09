class CanteenBegin{
	public static void main(String args[]){
		String[] values={"Skewer","Tongs","Toothpick","Cocktailstick","Drinkingstraw","Spoon","Fork","Knife","Butter knife","Cake fork","Soup spoon","Crab cracker","Crab fork","Fish knife","Fondue fork","Grapefruit knife","Grapefruit spoon","Lobster pick","Snail tongs", "forks","Nutcracker","Chef’s knife","Paring knife","Bread knife","Knife sharpening honing rod","Chopping","Kitchen shears","Vegetable peeler","Garlic press","Grater","Mixing bowl","Colande","Sieve","Rolling pin ","Can opener","Saucepans","Ice cream scoop","Knife","Butter knife","Cake fork","Soup spoon"};
	System.out.println("starting main in canteenbegin ");
	Canteen canteen=new Canteen();
	canteen.setUtensils(values);
	canteen.showInfo();
	System.out.println("ending main in canteenbegin ");
	}
}