class AtmBegin{
	public static void main(String args[]){
		String bankName="Bank of Baroda";
		String branches[]={"BTM","Jayanagar","JP nagar","hsr","bomnahalli"};
		String acs[]={"133301000123","133301000456","133301000345"};
		String cctvBrands[]={"CP plus","Godreg","bosch","sony","samsung"};
		
		Atm atm=new Atm(bankName,branches,acs,cctvBrands);
		atm.showInfo();
	}
}