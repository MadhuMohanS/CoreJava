package com.xworkz.mobile.interfaces;

public class ForestRuleImp implements ForestRule {
	@Override
	public void security() {
		System.out.println("running security in forestruleimp");
	}

	@Override
	public void checking() {
		System.out.println("running checking in forestruleimp");

	}

	@Override
	public void environmentCleaning() {
		System.out.println("running environmentCleaning in forestruleimp");

	}

	@Override
	public void noHunting() {
		System.out.println("running noHunting in forestruleimp");

	}
}
