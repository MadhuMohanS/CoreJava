package com.xworkz.jpapractise.repository;

import java.util.List;

import com.xworkz.jpapractise.dto.TeamDto;

public interface TeamRepository {
public void save(TeamDto teamDto);
public TeamDto find(Integer id);
public void update(Integer id,int noofPlayers,int noOfMatches);
public void delete(Integer id);
public void saveAll(List<TeamDto> teamDtos);
public List<TeamDto> findAll();
public List<TeamDto> getCaptiain();
public List<TeamDto> getCaptainAndgetName();
public List<TeamDto> getTeamByName(String name);
public List<TeamDto> getTeamBycategoryType(String category);
public List<TeamDto> getCaptainUsingCriteria(String teamName);
public List<TeamDto> getAllteamsUsingCriteria();
public List<Object[]> getCaptainAndNameUsingCriteria();
public List<TeamDto> getTeamByNameMatches(String teamName);
public void getNoOfPlayersLessThan10();
}
