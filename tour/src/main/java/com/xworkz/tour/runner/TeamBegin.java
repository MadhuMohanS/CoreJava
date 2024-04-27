package com.xworkz.tour.runner;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.tour.dto.PlayerDto;
import com.xworkz.tour.dto.TeamDto;
import com.xworkz.tour.repository.TeamRepository;
import com.xworkz.tour.repository.TeamRepositoryImpl;

public class TeamBegin {
public static void main(String[] args) {
	
TeamRepository teamRepository=new TeamRepositoryImpl();
//TeamDto teamDto=new TeamDto();
//teamDto.setName("DC");
//teamDto.setCaptain("Panth");
//teamDto.setCountry("India");
//teamDto.setCatagoryType("Cricket");
//teamRepository.save(teamDto);
//TeamDto teamDto2= teamRepository.find(1);
//System.out.println(teamDto2.getName());

//teamRepository.update(4, "RCB");

//teamRepository.delete(4);

TeamDto teamDto=new TeamDto();
teamDto.setName("India");
teamDto.setCaptain("Rohith");
teamDto.setCountry("India");
teamDto.setCatagoryType("Cricket");
TeamDto footballTeamDto = new TeamDto();
footballTeamDto.setName("Real Madrid");
footballTeamDto.setCaptain("Sergio Ramos");
footballTeamDto.setCountry("Spain");
footballTeamDto.setCatagoryType("Football");
TeamDto basketballTeamDto = new TeamDto();
basketballTeamDto.setName("Los Angeles");
basketballTeamDto.setCaptain("LeBron James");
basketballTeamDto.setCountry("United States");
basketballTeamDto.setCatagoryType("Basketball");
TeamDto rugbyTeamDto = new TeamDto();
rugbyTeamDto.setName("New Zealand");
rugbyTeamDto.setCaptain("Richie McCaw");
rugbyTeamDto.setCountry("New Zealand");
rugbyTeamDto.setCatagoryType("Rugby");
TeamDto tennisTeamDto = new TeamDto();
tennisTeamDto.setName("Spain Davis");
tennisTeamDto.setCaptain("Rafael Nadal");
tennisTeamDto.setCountry("Spain");
tennisTeamDto.setCatagoryType("Tennis");

List<TeamDto> list=new ArrayList<TeamDto>();
list.add(tennisTeamDto);
list.add(rugbyTeamDto);
list.add(basketballTeamDto);
list.add(footballTeamDto);
list.add(teamDto);
//teamRepository.saveAll(list);
//teamRepository.findByName("CSK");
//teamRepository.findByCategoryType("Cricket");
//teamRepository.findnoofRecords();
//teamRepository.findNoOfPlayers();

//teamRepository.findCaptainByTeamName("CSK");
//teamRepository.findCaptainAndCategoryTypeByTeamName("CSK");
//teamRepository.fetchAllCaptainandCategoryType();
List<String> names=new ArrayList<String>();
names.add("CSK");
names.add("KKR");
names.add("DC");
//teamRepository.fetchTeamByNames(names);
//teamRepository.updateCaptainbyTeamName("CSK", "Dhoni");
//teamRepository.deleteTeamByName("Mumbai");
//teamRepository.getTotalnoofMatches();
//teamRepository.getNoOfMatchesbw10and20();
//teamRepository.getMinimumMatchPlayedTeam();
//teamRepository.getCountBasedOnCategoryType("Football");

//teamRepository.getCaptainUsingCriteria();
//teamRepository.getAllteams();
//teamRepository.getTeamByNameUsingCriteria("CSK");
//teamRepository.getCaptainAndNameUsingCriteria();
//teamRepository.getTeamByNameMatches("Lo");
//teamRepository.getNoOfPlayersLessThan10();
//teamRepository.getNoOfPlayersGreaterThan7();
//teamRepository.getNoOfPlayersBetween7and15();
//teamRepository.getMultipleNames();
PlayerDto playerDto=new PlayerDto("Ruthraj","gayakwad", 25, 2);
//PlayerDto playerDto1=new PlayerDto("Virendra","jadeja" , 20, 2);
PlayerDto playerDto1=new PlayerDto("Russel","Andrew" , 9, 3);
//teamRepository.savePlayer(playerDto1);
//teamRepository.getTeamNameAndPlayerName();
//teamRepository.getNamesUsingLeftJoins();
//teamRepository.getPlayerNameUsingRightJoins();
teamRepository.getDetailsUsingInnerJoin();

 System.out.println("loading persistence xml....");
 System.out.println("data inserted successfully");
 

}
}
