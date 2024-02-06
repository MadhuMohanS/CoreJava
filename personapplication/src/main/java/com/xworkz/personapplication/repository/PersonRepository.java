package com.xworkz.personapplication.repository;

import java.util.List;

import com.xworkz.personapplication.dto.PersonDto;

public interface PersonRepository {
public void save(PersonDto person);
public void saveAll(List<PersonDto> person);
public void update(String name,int weight,int seatNo);
public void deleteByName(String name);
public PersonDto findByName(String name);
public List<PersonDto> findAll();
}
