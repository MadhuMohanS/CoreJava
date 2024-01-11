package com.xworkz.sorting.comparatorprograms.charcoal;

import java.util.Comparator;

public class CharCoalComparator implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getCarbon(), o2.getCarbon());
	}

}

class CarbonDesc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getCarbon(), o1.getCarbon());
	}

}

class DensityAsc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getDensity(), o2.getDensity());
	}

}

class DensityDesc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getDensity(), o1.getDensity());
	}

}
class MoistureAsc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getMoisture(), o2.getMoisture());
	}

}

class MoistureDesc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getMoisture(), o1.getMoisture());
	}

}
class AshAsc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.getAsh(), o2.getAsh());
	}

}

class AshDesc implements Comparator<CharCoalDto>{

	@Override
	public int compare(CharCoalDto o1, CharCoalDto o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getAsh(), o1.getAsh());
	}

}