package com.xworkz.mobile.interfaces;

public class HostelRuleImp implements HostelRule {
	@Override
	public boolean parking() {
		System.out.println("running parking in HostelRuleImp");
		return false;
	}

	@Override
	public boolean vacancy() {
		System.out.println("running vacancy in HostelRuleImp");
		return false;
	}

	@Override
	public void weekendMovie() {
		System.out.println("running weekendmovie in hostelruleimp");
	}

	@Override
	public void studyHour() {
		System.out.println("running studyHour in hostelruleimp");
	}
}
