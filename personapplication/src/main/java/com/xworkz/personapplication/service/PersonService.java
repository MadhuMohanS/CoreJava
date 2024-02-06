package com.xworkz.personapplication.service;

import java.util.List;

import com.xworkz.personapplication.dto.PersonDto;

public interface PersonService {
public void save(PersonDto person);
public void saveAll(List<PersonDto> person);
public void update(String name,int weight,int seatNo);
public void deleteByName(String name);
public PersonDto finByName(String name);
public List<PersonDto> findAll();
}
