package com.xworkz.sorting.comparatorprograms.cover;

import java.util.Comparator;

//private String type;
//private int length;
//private int width;
//private String color;
public class CoverComparator implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}

}
class TypeDesc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return o2.getType().compareTo(o1.getType());
	}

}
class LengthAsc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getLength(), o2.getLength());
	}

}
class LengthDesc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getLength(), o1.getLength());
	}

}
class WidthAsc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getWidth(), o2.getWidth());
	}

}
class WidthDesc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.getWidth(), o1.getWidth());
	}

}
class ColorAsc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return o1.getColor().compareTo(o2.getColor());
	}

}
class ColorDesc implements Comparator<CoverDto>{

	@Override
	public int compare(CoverDto o1, CoverDto o2) {
		// TODO Auto-generated method stub
		return o2.getColor().compareTo(o1.getColor());
	}

}
