package com.xworkz.personapplication.service;

import java.util.List;

import com.xworkz.personapplication.dto.PersonDto;
import com.xworkz.personapplication.repository.PersonRepository;
import com.xworkz.personapplication.repository.PersonRepositoryImpl;

public class PersonServiceImpl implements PersonService{

	PersonRepository personRepository=new PersonRepositoryImpl();
	@Override
	public void save(PersonDto person) {
		// TODO Auto-generated method stub
		if(person.getName().isEmpty()) {
			System.out.println("please provide valid name");
		}else {
			personRepository.save(person);
		}
		
	}
	@Override
	public void saveAll(List<PersonDto> person) {
		// TODO Auto-generated method stub
		boolean valid=true;
		for(PersonDto person1:person) {
			if(person1.getName().isEmpty()) {
				System.out.println("please provide valid name");
				valid=false;
			}
		}
		if(!valid) {
			return;
		}
		personRepository.saveAll(person);
	}
	@Override
	public void update(String name, int weight, int seatNo) {
		// TODO Auto-generated method stub
		if(name==null || name.isEmpty()) {
			System.out.println("please enter valid name");
		}else {
			personRepository.update(name, weight, seatNo);
		}
	}
	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		if(name==null  || name.isEmpty() ) {
			System.out.println("please enter valid name");
		}else {
			personRepository.deleteByName(name);
		}
		
	}
	@Override
	public PersonDto finByName(String name) {
		// TODO Auto-generated method stub
		if(name.isEmpty()) {
			System.out.println("please enter valid name");
		}else {
		PersonDto personDto=	personRepository.findByName(name);
		return personDto;
		}
		return null;
	}
	@Override
	public List<PersonDto> findAll() {
		// TODO Auto-generated method stub
	List<PersonDto> list=personRepository.findAll();
		return list;
	}

}
