package com.xworkz.tour.repository;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.xworkz.tour.dto.PlayerDto;
import com.xworkz.tour.dto.TeamDto;

public class TeamRepositoryImpl implements TeamRepository{

	public void save(TeamDto team) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("loading persistence xml file");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
			entityManager.persist(team);
			entityTransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occur while inserting data!!!!!");
			entityTransaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public TeamDto find(Integer id) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("loading persistence xml file");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=	entityManager.getTransaction();
	TeamDto teamDto=	entityManager.find(TeamDto.class, id);
	
	
		return teamDto;
	}

	public void update(Integer id, String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		try {
		entityTransaction.begin();
		TeamDto teamDto= entityManager.find(TeamDto.class, id);
		teamDto.setName(teamName);
		entityTransaction.commit();
		System.out.println("updated teamName by id:"+id);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occured while updating data!!");
			entityTransaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		try {
			entityTransaction.begin();
			TeamDto teamDto= entityManager.find(TeamDto.class,id);
			entityManager.remove(teamDto);
			System.out.println("deleted by id:"+id);
			entityTransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured while deleting data");
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public void saveAll(List<TeamDto> teams) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		System.out.println("loading persistence xml file");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		try {
			entityTransaction.begin();
		   for(TeamDto teamDto:teams) {
			entityManager.persist(teamDto);
		   }
			entityTransaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception occur while inserting data!!!!!");
			entityTransaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public TeamDto findByName(String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager=	entityManagerFactory.createEntityManager();
	try {
	Query query=	entityManager.createQuery("select t from TeamDto t where name = :teamname");
	query.setParameter("teamname", name);
	TeamDto teamDto= (TeamDto) query.getSingleResult();
	System.out.println("team name:"+teamDto.getName());
	return teamDto;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception while getting record"+e);
	}finally {
		entityManager.close();
		entityManagerFactory.close();
	}
		return null;
	}

	public List<TeamDto> findByCategoryType(String categoryType) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager=	entityManagerFactory.createEntityManager();
	try {
	Query query=	entityManager.createQuery("select t from TeamDto t where catagoryType=:type");
	query.setParameter("type", categoryType);
List<TeamDto> teamDtos=(List<TeamDto>)	query.getResultList();
for(TeamDto t:teamDtos) {
	System.out.println("team details");
	System.out.println(t.getName());
	System.out.println(t.getCaptain());
}
return teamDtos;
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception while getting records:"+e);
	}finally {
		entityManager.close();
		entityManagerFactory.close();
	}
		return null;
	}

	public void findnoofRecords() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=	entityManagerFactory.createEntityManager();
		try {
			Query query=	entityManager.createQuery("select count(t) from TeamDto t ");
			Long count= (Long) query.getSingleResult();
			System.out.println("the no of rows in the table:"+count);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while counting no of rows:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public long findNoOfPlayers() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager=	entityManagerFactory.createEntityManager();
	try {
	Query query=	entityManager.createQuery("select sum(totalNoOfPlayers) from TeamDto");
	Long total= (Long) query.getSingleResult();
	System.out.println("total no of players:"+total);
	
	return total;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception while counting total no of players:"+e);
	}finally {
		entityManagerFactory.close();
		entityManager.close();
	}
		return 0;
	}

	public String findCaptainByTeamName(String teamName) {
		// TODO Auto-generated method stub
	EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	try {
	Query query=	entityManager.createQuery("select captain from TeamDto where name=:teamName");
	query.setParameter("teamName", teamName);
	Object captain= query.getSingleResult();
	System.out.println("captain name:"+captain);
	return (String) captain;
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception while fetching captina name"+e);
	}finally {
		entityManager.close();
		entityManagerFactory.close();
	}
		return null;
	}

	public void findCaptainAndCategoryTypeByTeamName(String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select captain,catagoryType from TeamDto where name=:teamName");
		query.setParameter("teamName", teamName);
		Object[] columns=(Object[]) query.getSingleResult();
		for(Object column:columns) {
			System.out.println(column);
		}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

	public List<Object[]> fetchAllCaptainandCategoryType() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select captain,catagoryType from TeamDto");
        List<Object[]> resultList = query.getResultList();
        
        // Print the retrieved data
        for (Object[] result : resultList) {
            System.out.println("Captain: " + result[0]);
            System.out.println("Category Type: " + result[1]);
        }
        
        return resultList;
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while fetching captain and catagory type "+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public void fetchTeamByNames(List<String> names) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select t from TeamDto t where name in :names");
		query.setParameter("names", names);
        List<TeamDto> t = (List<TeamDto>)query.getResultList();
        
        // Print the retrieved data
        for (TeamDto result : t) {
        	System.out.println("team details");
            System.out.println("Team name: " + result.getName());
            System.out.println("captain:"+result.getCaptain());
            System.out.println("catagory:"+result.getCatagoryType());
            System.out.println("Country:"+result.getCountry());
            System.out.println("total no of players:"+result.getTotalNoOfPlayers());
        }
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while fetching team details "+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public int updateCaptainbyTeamName(String teamName, String captain) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=	entityManager.getTransaction();
		try {
			entityTransaction.begin();
		Query query=	entityManager.createNamedQuery("updateCaptain");
		query.setParameter("captain", captain);
		query.setParameter("teamName", teamName);
		int value=query.executeUpdate();
		System.out.println(value);
		entityTransaction.commit();
		return value;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while updating!!"+e);
			entityTransaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return 0;
	}

	public int deleteTeamByName(String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			transaction.begin();
			Query query=entityManager.createNamedQuery("deleteQuery");
			query.setParameter("teamName", teamName);
		int rows=	query.executeUpdate();
		System.out.println(rows);
		transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while deleting "+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return 0;
	}

	public Object getTotalnoofMatches() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createNamedQuery("totalnoofMatches");
	Object value=	query.getSingleResult();
	System.out.println("sum of total no of matches:"+value);
	return value;
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while getting total no of matches:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return 0;
	}

	public List<TeamDto> getNoOfMatchesbw10and20() {
		// TODO Auto-generated method stub
	EntityManagerFactory entityManagerFactory=	Persistence.createEntityManagerFactory("com.xworkz");
EntityManager entityManager= entityManagerFactory.createEntityManager();
try {
Query query=	entityManager.createNamedQuery("getnoofMatchesbw10and20");
List<TeamDto> list=(List<TeamDto>) query.getResultList();
for(TeamDto result:list) {
	System.out.println("team details");
    System.out.print("Team name: " + result.getName()+" ");
    System.out.print("captain:"+result.getCaptain()+" ");
    System.out.print("catagory:"+result.getCatagoryType()+" ");
    System.out.print("Country:"+result.getCountry()+" ");
    System.out.print("total no of matches:"+result.getTotalNoOfMatches()+" ");
    System.out.println("total no of players:"+result.getTotalNoOfPlayers());
}
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Exception while getting data:"+e);
}finally {
	entityManager.close();
	entityManagerFactory.close();
}
		return null;
	}

	public Object getMinimumMatchPlayedTeam() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
	EntityManager entityManager=	entityManagerFactory.createEntityManager();
	try {
	Query query=	entityManager.createNamedQuery("minimumMatchPlayedQuery");
	Object minimum= query.getSingleResult();
//	TeamDto team=(TeamDto) query.getSingleResult();
//	System.out.println("minimum no of matches played by team is:"+team.getName());
	System.out.println("no of matches played is:"+minimum);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("exception while getting data:"+e);
	}finally {
		entityManager.close();
		entityManagerFactory.close();
	}
		return null;
	}

	public Object getCountBasedOnCategoryType(String catagoryType) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=	entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createNamedQuery("categoryTypeCountQuery");
		query.setParameter("catagoryType", catagoryType);
		Object count=query.getSingleResult();
		System.out.println("no of rows of "+catagoryType+" in team is:"+count);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public void getCaptainUsingCriteria() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager=  entityManagerFactory.createEntityManager();
		try {
		CriteriaBuilder criteriaBuilder=	entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
		CriteriaQuery query=criteriaQuery.select(root.get("captain"));
		Query query1=entityManager.createQuery(query);
		List<String> teamList=query1.getResultList();
		System.out.println("printing captain using criteria");
		
	
		teamList.forEach(x->System.out.println(x));
		
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception while getting captain..."+e);
	}
	}

	@Override
	public void getAllteams() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
			CriteriaQuery query= criteriaQuery.select(root);
			Query query2= entityManager.createQuery(query);
			List<TeamDto> teamDtos= query2.getResultList();
			teamDtos.forEach(x->{
				System.out.println("team details");
				System.out.println(x.getCaptain());
				System.out.println(x.getName());
			});
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while getting team details");
		}
		
	}

	@Override
	public void getTeamByNameUsingCriteria(String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
			CriteriaQuery query=criteriaQuery.where(criteriaBuilder.equal(root.get("name"), teamName));
			Query query2= entityManager.createQuery(query);
			TeamDto team= (TeamDto) query2.getSingleResult();
			System.out.println(team.getName());
			System.out.println(team.getCaptain());
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}
		
	}

	@Override
	public List<Object[]> getCaptainAndNameUsingCriteria() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder=entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery=  criteriaBuilder.createQuery(Object[].class);
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
			CriteriaQuery query= criteriaQuery.multiselect(root.get("name"),root.get("captain"));
			Query query2= entityManager.createQuery(query);
			List<Object[]> list= query2.getResultList();
			System.out.println("printing all captain and team name");
			for(Object[] x:list) {
				for(Object o:x) {
					System.out.println(o);
				}
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting captina and name:"+e);
			
		}
		return null;
	}

	@Override
	public List<TeamDto> getTeamByNameMatches(String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		CriteriaBuilder criteriaBuilder=	entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
	CriteriaQuery query=	criteriaQuery.where(criteriaBuilder.like(root.get("name"),teamName+"%"));
	Query query2= entityManager.createQuery(query);
	List<TeamDto> list= query2.getResultList();
	list.stream().filter(x->x.getCatagoryType().equals("Cricket")).map(x->x.getName()).forEach(x->System.out.println(x));
	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}
		return null;
	}

	@Override
	public void getNoOfPlayersLessThan10() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery=	criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
	CriteriaQuery query=	criteriaQuery.where(criteriaBuilder.lessThan(root.get("totalNoOfPlayers"), 10));
	Query query2= entityManager.createQuery(query);
	List<TeamDto> list= query2.getResultList();
	list.forEach(s->{
		System.out.println("team name:"+s.getName());
		System.out.println("total no of players:"+s.getTotalNoOfPlayers());
		});
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while getting data where no of players less than 10");
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	@Override
	public void getNoOfPlayersGreaterThan7() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery=	criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
	CriteriaQuery query=	criteriaQuery.where(criteriaBuilder.greaterThan(root.get("totalNoOfPlayers"), 7));
	Query query2= entityManager.createQuery(query);
	List<TeamDto> list= query2.getResultList();
	list.forEach(s->{
		System.out.println("team name:"+s.getName());
		System.out.println("total no of players:"+s.getTotalNoOfPlayers());
		});
	
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while getting data where no of players greater than 7");
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
	}

	@Override
	public void getNoOfPlayersBetween7and15() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		CriteriaBuilder criteriaBuilder=entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
		CriteriaQuery query= criteriaQuery.where(criteriaBuilder.between(root.get("totalNoOfPlayers"), 7, 15));
		 Query query2= entityManager.createQuery(query);
		 List<TeamDto> list= query2.getResultList();
		 list.forEach(s->{
			 System.out.println("team name:"+s.getName());
			 System.out.println("total no of players:"+s.getTotalNoOfPlayers());
		 });
		
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	@Override
	public List<TeamDto> getMultipleNames() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		CriteriaBuilder criteriaBuilder=entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
		CriteriaQuery query= criteriaQuery.where(root.get("name").in("KKR","New Zealand"));
		 Query query2= entityManager.createQuery(query);
		 List<TeamDto> list= query2.getResultList();
		 list.forEach(s->{
			 System.out.println("team name:"+s.getName());
			 System.out.println("total no of players:"+s.getTotalNoOfPlayers());
		 });
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	@Override
	public void savePlayer(PlayerDto player) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(player);
			transaction.commit();
			System.out.println("players detais saved successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while inserting player data");
			transaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	@Override
	public void getTeamNameAndPlayerName() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			Query query= entityManager.createQuery("select t.name,p.firstName from PlayerDto p  left join  TeamDto t on t.id=p.teamId");
			List<Object[]> result= query.getResultList();
			for(Object[] r:result) {
				System.out.println("Team name:"+r[0]);
				System.out.println("player name:"+r[1]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while fetching data:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		
	}

	@Override
	public List<TeamDto> getNamesUsingLeftJoins() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select t from TeamDto t left join PlayerDto p on t.id=p.teamId");
		List<TeamDto> teams= query.getResultList();
		for(TeamDto o:teams) {
			System.out.println(o.getName());
		}
		return teams;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting names:"+e);
			
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
		return null;
	}

	@Override
	public List<PlayerDto> getPlayerNameUsingRightJoins() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select p from PlayerDto p right join TeamDto t on t.id=p.teamId");
		List<PlayerDto> teams= query.getResultList();
		for(PlayerDto o:teams) {
			if (o != null && o.getFirstName() != null) {
                System.out.println(o.getFirstName());
            }
		}
		return teams;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting names:"+e);
			
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	@Override
	public List<TeamDto> getDetailsUsingInnerJoin() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select t from TeamDto t inner join PlayerDto p on t.id=p.teamId");
		List<TeamDto> teams= query.getResultList();
		for(TeamDto o:teams) {
			System.out.println(o.getName());
		}
		return teams;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting names:"+e);
			
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}
	
	
}


