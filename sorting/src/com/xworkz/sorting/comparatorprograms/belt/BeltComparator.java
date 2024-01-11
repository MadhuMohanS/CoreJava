package com.xworkz.sorting.comparatorprograms.belt;

import java.util.Comparator;
//private String company;
//private int length;
//private int buckels;
//private String type;
public class BeltComparator implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return o1.getCompany().compareTo(o2.getCompany());
	}

}
class CompanyDesc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return o2.getCompany().compareTo(o1.getCompany());
	}

}
class LengthAsc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getLength(), o2.getLength());
	}

}
class LengthDesc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getLength(), o1.getLength());
	}

}
class BuckelsAsc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getBuckels(), o2.getBuckels());
	}

}
class BuckelsDesc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getBuckels(), o1.getBuckels());
	}

}
class TypeAsc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
class TypeDesc implements Comparator<BeltDto>{

	@Override
	public int compare(BeltDto o1, BeltDto o2) {
		// TODO Auto-generated method stub
		return o2.getType().compareTo(o1.getType());
	}

}
