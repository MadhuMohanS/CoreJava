package com.xworkz.flightbookingapplication.runner;

import com.xworkz.flightbookingapplication.dto.PersonInfoDto;
import com.xworkz.flightbookingapplication.repository.PersonInfoRepository;
import com.xworkz.flightbookingapplication.repository.PersonInfoRepositoryImpl;

public class PersonBegin {
public static void main(String[] args) {
	PersonInfoRepository personInfoRepository=new PersonInfoRepositoryImpl();
	PersonInfoDto personInfoDto=new PersonInfoDto("vignesh",280,23);
	personInfoRepository.savePersonDetails(personInfoDto);
}
}
