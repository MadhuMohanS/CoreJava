package com.xworkz.tour.repository;

import java.util.List;

import com.xworkz.tour.dto.PlayerDto;
import com.xworkz.tour.dto.TeamDto;

public interface TeamRepository {
public void save(TeamDto team);
public TeamDto find(Integer id);
public void update(Integer id,String teamName);
public void delete(Integer id);
public void saveAll(List<TeamDto> teams);
public TeamDto findByName(String name);
public List<TeamDto> findByCategoryType(String categoryType);
public void findnoofRecords();
public long findNoOfPlayers();
public String findCaptainByTeamName(String teamName);
public void findCaptainAndCategoryTypeByTeamName(String teamName);
public List<Object[]> fetchAllCaptainandCategoryType();
public void fetchTeamByNames(List<String> names);
public int updateCaptainbyTeamName(String teamName,String captain);
public int deleteTeamByName(String teamName);
public Object getTotalnoofMatches();
public List<TeamDto> getNoOfMatchesbw10and20();
public Object getMinimumMatchPlayedTeam();
public Object getCountBasedOnCategoryType(String catagoryType);
public void getCaptainUsingCriteria();
public void getAllteams();
public void getTeamByNameUsingCriteria(String teamName);
public List<Object[]> getCaptainAndNameUsingCriteria();
public List<TeamDto> getTeamByNameMatches(String teamName);
public void getNoOfPlayersLessThan10();
public void getNoOfPlayersGreaterThan7();
public void getNoOfPlayersBetween7and15();
public List<TeamDto> getMultipleNames();
public void savePlayer(PlayerDto player);
public void getTeamNameAndPlayerName();
public List<TeamDto> getNamesUsingLeftJoins();
public List<PlayerDto> getPlayerNameUsingRightJoins();
public List<TeamDto> getDetailsUsingInnerJoin();
}
