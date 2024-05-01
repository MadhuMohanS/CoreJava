package com.xworkz.jpapractise.runner;


import java.util.ArrayList;
import java.util.List;

import com.xworkz.jpapractise.dto.TeamDto;
import com.xworkz.jpapractise.repository.TeamRepository;
import com.xworkz.jpapractise.repository.TeamRepositoryImpl;

public class TeamBegin {
public static void main(String[] args) {
	TeamRepository teamRepository=new TeamRepositoryImpl();
	TeamDto teamDto=new TeamDto();
	teamDto.setCaptain("Madhu Mohan S");
	teamDto.setCategoryType("KHO Kho");
	teamDto.setCountry("India");
	teamDto.setName("DSC");
	teamDto.setNoOfMatches(13);
	teamDto.setNoOfPlayers(12);
	
	TeamDto teamDto1=new TeamDto();
	teamDto1.setCaptain("Anil K S");
	teamDto1.setCategoryType("KHO Kho");
	teamDto1.setCountry("India");
	teamDto1.setName("DSC");
	teamDto1.setNoOfMatches(13);
	teamDto1.setNoOfPlayers(12);
//	teamRepository.save(teamDto);
//	teamRepository.find(21);
//	teamRepository.update(21, 12, 13);
//	teamRepository.delete(21);
	List<TeamDto> list=new ArrayList<TeamDto>();
	list.add(teamDto1);
	list.add(teamDto);
//	teamRepository.saveAll(list);
//	teamRepository.findAll();
//	teamRepository.getCaptiain();
//	teamRepository.getCaptainAndgetName();
//	teamRepository.getTeamByName("CSK");
//	teamRepository.getTeamBycategoryType("Cricket");
//	teamRepository.getCaptainUsingCriteria("CSK");
//	teamRepository.getAllteamsUsingCriteria();
//	teamRepository.getCaptainAndNameUsingCriteria();
//	teamRepository.getTeamByNameMatches("CS");
	teamRepository.getNoOfPlayersLessThan10();
	
}
}
