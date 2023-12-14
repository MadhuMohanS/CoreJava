package com.xworkz.mobile.interfaces;

public class CourtRuleImp implements CourtRule {
	@Override
	public void caseStudy() {
		System.out.println("running casestudy in CourtRuleImp");
	}

	@Override
	public void judgement() {
		System.out.println("running judgement in CourtRuleImp");
	}

	@Override
	public void cases() {
		System.out.println("running cases in CourtRuleImp");
	}

	@Override
	public void justice() {
		System.out.println("running justice in CourtRuleImp");
	}
}
