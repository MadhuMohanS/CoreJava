package com.xworkz.sorting.comparatorprograms;

import java.util.Comparator;

public class RefillComparator implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getLength(), o2.getLength());
	}

}
class RefillComparatorLengthDesc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getLength(),o1.getLength());
	}
	
}

class RefillColorAsc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return o1.getColor().compareTo(o2.getColor());
	}
	
}

class RefillColorDesc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return o2.getColor().compareTo(o1.getColor());
	}
	
}

class RefillCompanyAsc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return o1.getCompany().compareTo(o2.getCompany());
	}
	
}
class RefillCompanyDesc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return o2.getCompany().compareTo(o1.getCompany());
	}
	
}

class RefillCostAsc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getCost(), o2.getCost());
	}
	
}
class RefillCostDesc implements Comparator<Refill>{

	@Override
	public int compare(Refill o1, Refill o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getCost(), o1.getCost());
	}
	
}
