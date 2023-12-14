package com.xworkz.mobile.interfaces;

public class HospitalRuleImp implements HospitalRule {
	@Override
	public void billPayment() {
		System.out.println("running billpayment in HospitalRuleImp");
	}

	@Override
	public void maintainSilence() {
		System.out.println("running maintainSilence in HospitalRuleImp");
	}

	@Override
	public void dontuseMobile() {
		System.out.println("running dontuseMobile in HospitalRuleImp");
	}

	@Override
	public void checkup() {
		System.out.println("running checkup in HospitalRuleImp");
	}
}
