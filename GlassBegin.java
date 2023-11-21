class GlassBegin{
	public static void main(String args[]){
		System.out.println("starting main in glassbegin");
		TintedGlass tintedglass=new TintedGlass(2,"virendar",50,30,GlassType.TINTED,"for house","saint-gobain");
		tintedglass.show();
		
		GorillaGlass gorillaglass=new GorillaGlass(100,2,30,10,GlassType.LAMINATED,"for mobiles","corning");
		gorillaglass.show();
		System.out.println("ending main in glassbegin");
	}
}