package com.xworkz.tour.runner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.tour.dto.TeamDto;

public class TeamBegin {
public static void main(String[] args) {
	
EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
EntityManager entityManager= entityManagerFactory.createEntityManager();
TeamDto teamDto=new TeamDto();
teamDto.setName("KKR");
teamDto.setCaptain("Gill");
teamDto.setCountry("India");
teamDto.setCatagoryType("Cricket");
TeamDto team=entityManager.find(TeamDto.class,3);
System.out.println(team.getName());

EntityTransaction entityTransaction=entityManager.getTransaction();
try {
entityTransaction.begin();
entityManager.persist(teamDto);
//entityTransaction.commit();
//System.out.println(1/0);
}catch (Exception e) {
	// TODO: handle exception
	System.out.println("Exception while inserting data.....");
	entityTransaction.rollback();
}finally {
	entityManager.close();
	entityManagerFactory.close();
}

 System.out.println("loading persistence xml....");
 System.out.println("data inserted successfully");
 

}
}
