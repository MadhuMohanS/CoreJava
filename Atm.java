class Atm{
	String bankName;
	String[] branch;
	String[] acs;
	String[] cctvBrands;
	
	Atm(String bankName,String[] branch,String[] acs,String[] cctvBrands){
		this.bankName=bankName;
		this.branch=branch;
		this.acs=acs;
		this.cctvBrands=cctvBrands;
	}
	
	void showInfo(){
		System.out.println("starting showInfo in Atm");
		System.out.println("bank Name:"+this.bankName);
		
		if(this.branch!=null){
		System.out.println("branches are:");
		for(int seq=0;seq<this.branch.length;seq++){
			System.out.println("branch "+this.branch[seq]+" at index "+seq);
		}
		}else{
			System.err.println("there are no values in list");
		}
		
		if(this.acs!=null){
		System.out.println("accounts are:");
		for(int seq=0;seq<this.acs.length;seq++){
			System.out.println("branch "+this.acs[seq]+" at index "+seq);
		}
		}else{
			System.err.println("there are no values in list");
		}
		
		if(this.cctvBrands!=null){
		System.out.println("accounts are:");
		for(int seq=0;seq<this.cctvBrands.length;seq++){
			System.out.println("branch "+this.cctvBrands[seq]+" at index "+seq);
		}
		}else{
			System.err.println("there are no values in list");
		}
		System.out.println("ending showInfo in Atm");
		
	}
}