package com.xworkz.mobile;

import com.xworkz.mobile.interfaces.CourtRuleImp;
import com.xworkz.mobile.interfaces.ForestRule;
import com.xworkz.mobile.interfaces.ForestRuleImp;
import com.xworkz.mobile.interfaces.HospitalRule;
import com.xworkz.mobile.interfaces.HospitalRuleImp;
import com.xworkz.mobile.interfaces.HostelRule;
import com.xworkz.mobile.interfaces.HostelRuleImp;
import com.xworkz.mobile.interfaces.TempleRule;
import com.xworkz.mobile.interfaces.TempleRuleImp;

public class HostelBegin {
	public static void main(String args[]) {
		System.out.println("starting main in HostelBegin");
		HostelRule hr = new HostelRuleImp();
		System.out.println(hr.foodTime);
		System.out.println(hr.closingTime);
		HostelRuleImp hp = new HostelRuleImp();
		hp.parking();
		hp.vacancy();
		hp.weekendMovie();
		hp.studyHour();
		
		HospitalRule hR=new HospitalRuleImp();
		System.out.println(hR.appoitment);
		System.out.println(hR.meetingTime);
		
		HospitalRuleImp hri=new HospitalRuleImp();
		hri.billPayment();
		hri.checkup();
		hri.dontuseMobile();
		hri.maintainSilence();
		
		
		CourtRuleImp cr=new CourtRuleImp();
		cr.cases();
		cr.caseStudy();
		cr.judgement();
		cr.justice();
		System.out.println(cr.loc);
		System.out.println(cr.noOfJudges);
		
		ForestRule fr=new ForestRuleImp();
		fr.checking();
		fr.environmentCleaning();
		fr.noHunting();
		fr.security();
		System.out.println(ForestRule.loc);
		System.out.println(ForestRule.king);
		
		TempleRuleImp tri=new TempleRuleImp();
		tri.managalharathi();
		tri.pooja();
		tri.prasada();
		tri.queue();
		System.out.println(TempleRule.closingTime);
		System.out.println(TempleRule.openingTime);
		System.out.println("ending main in HostelBegin");
	}
}
