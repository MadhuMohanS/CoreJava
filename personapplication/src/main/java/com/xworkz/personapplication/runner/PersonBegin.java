package com.xworkz.personapplication.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.personapplication.dto.PersonDto;
import com.xworkz.personapplication.repository.PersonRepository;
import com.xworkz.personapplication.repository.PersonRepositoryImpl;
import com.xworkz.personapplication.service.PersonService;
import com.xworkz.personapplication.service.PersonServiceImpl;

public class PersonBegin {
public static void main(String[] args) {
	PersonDto personDto=new PersonDto("Madhu",60,20);
	PersonRepository personRepository=new PersonRepositoryImpl();
	PersonService personService=new PersonServiceImpl();
//	personService.save(personDto);
	
//	List<PersonDto> list=new ArrayList<>();
//	PersonDto personDto1=new PersonDto("mohan",70,21);
//	PersonDto personDto2=new PersonDto("Shambu",50,22);
//	list.add(personDto1);
//	list.add(personDto2);
//	personService.saveAll(list);
	
//	personRepository.update("Madhu", 100, 10);
	
//	personService.deleteByName(null);
	
//PersonDto personDto1=personRepository.findByName("Shambu");
//System.out.println("name is:"+personDto1.getName());
//System.out.println("name is:"+personDto1.getSeatNo());
//System.out.println("name is:"+personDto1.getTotalWeight());
	
	List<PersonDto> personDtos=personRepository.findAll();
	personDtos.forEach(person1->{
		System.out.println("name is:"+person1.getName());
		System.out.println("weight is:"+person1.getTotalWeight());
		System.out.println("seat no is:"+person1.getSeatNo());
	});
}
}
