package com.xworkz.classroom.runner;

import com.xworkz.classroom.interfaces2.AbstractSewageRule;
import com.xworkz.classroom.interfaces2.Contractor;
import com.xworkz.classroom.interfaces2.MetroContractor;

public class ContractorBegin {

	public static void main(String[] args) {
		Contractor contractor=new Contractor();
		contractor.clean();
		contractor.development();
		contractor.homeTax();
		contractor.hotelTax();
		contractor.regularCheckup();
		contractor.siteRegistration();
		contractor.trafficTax();
		contractor.waterTax();
		
		MetroContractor metroContractor=new MetroContractor();
		metroContractor.weight();
		metroContractor.loc();

		

	}

}
