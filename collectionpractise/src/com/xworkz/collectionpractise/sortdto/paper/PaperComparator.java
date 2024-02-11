package com.xworkz.collectionpractise.sortdto.paper;

import java.util.Comparator;

public class PaperComparator implements Comparator<PaperDto>{

	public int compare(PaperDto o1,PaperDto o2) {
		return Double.compare(o1.getCost(), o2.getCost());
	}

}

class CostDesc implements Comparator<PaperDto>{
	public int compare(PaperDto o1,PaperDto o2) {
		return Double.compare(o2.getCost(), o1.getCost());
	}
}

class NameAsc implements Comparator<PaperDto>{
	public int compare(PaperDto o1,PaperDto o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

class NameDesc implements Comparator<PaperDto>{
	public int compare(PaperDto o1,PaperDto o2) {
		 return o2.getName().compareTo(o1.getName());
	}
}

class StateAsc implements Comparator<PaperDto>{
	public int compare(PaperDto o1,PaperDto o2) {
		return o1.getState().compareTo(o2.getState());
	}
}

class StateDesc implements Comparator<PaperDto>{
	public int compare(PaperDto o1,PaperDto o2) {
		return o2.getState().compareTo(o1.getState());
	}
}

class LengthAsc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getLength(), o2.getLength());
	}
	
}

class LengthDesc implements Comparator<PaperDto>{

	@Override
	public int compare(PaperDto o1, PaperDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getLength(), o1.getLength());
	}
	
}
