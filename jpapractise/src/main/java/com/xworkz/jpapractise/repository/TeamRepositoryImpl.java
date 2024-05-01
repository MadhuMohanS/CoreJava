package com.xworkz.jpapractise.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;

import com.xworkz.jpapractise.dto.TeamDto;

public class TeamRepositoryImpl implements TeamRepository{

	public void save(TeamDto teamDto) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction=	entityManager.getTransaction();
		try {
		transaction.begin();
		entityManager.persist(teamDto);
		System.out.println("data inserted successfully");
		transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while inserting data"+e);
			transaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public TeamDto find(Integer id) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		TeamDto teamDto=	entityManager.find(TeamDto.class, id);
		System.out.println(teamDto.getName());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception while getting data:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public void update(Integer id, int noofPlayers, int noOfMatches) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		
		try {
			entityTransaction.begin();
//			TeamDto teamDto= entityManager.find(TeamDto.class, id);
//			teamDto.setNoOfPlayers(noofPlayers);
//			teamDto.setNoOfMatches(noOfMatches);
			Query query= entityManager.createQuery("update TeamDto set noOfPlayers=:noofPlayers,noOfMatches=:noOfMatches where id=:id");
			query.setParameter("noofPlayers",noofPlayers );
			query.setParameter("noOfMatches", noOfMatches);
			query.setParameter("id", id);
			query.executeUpdate();
			System.out.println("data updated by id:"+id);
			entityTransaction.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while updating data:"+e);
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
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			transaction.begin();
			TeamDto teamDto= entityManager.find(TeamDto.class, id);
			entityManager.remove(teamDto);
			transaction.commit();
			System.out.println("data got deleted by:"+id);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while deleting data:"+e);
			transaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public void saveAll(List<TeamDto> teamDtos) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try {
			transaction.begin();
			
			for(TeamDto t:teamDtos) {
				entityManager.persist(t);
			}
			transaction.commit();
			System.out.println("data inserted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while inserting data"+e);
			transaction.rollback();
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		
	}

	public List<TeamDto> findAll() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			Query query= entityManager.createQuery("select t from TeamDto t");
			List<TeamDto> list= query.getResultList();
			for(TeamDto t:list) {
				System.out.println(t.getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}
		
		return null;
	}

	public List<TeamDto> getCaptiain() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select captain from TeamDto");
		List<String> team= query.getResultList();
		for(String t:team) {
			System.out.println(t);
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting captain:"+e);
		}
		return null;
	}

	public List<TeamDto> getCaptainAndgetName() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select name,captain from TeamDto");
		List<Object[]> result= query.getResultList();
		for(Object[] s:result) {
			System.out.println(s[0]);
			System.out.println(s[1]);
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting captain and name :"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public List<TeamDto> getTeamByName(String name) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			Query query= entityManager.createQuery("select t from TeamDto t where name=:name");
			query.setParameter("name", name);
			TeamDto teamDto=(TeamDto) query.getSingleResult();
			System.out.println(teamDto.getName());
			System.out.println(teamDto.getCaptain());
			System.out.println(teamDto.getCategoryType());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting team by name:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public List<TeamDto> getTeamBycategoryType(String category) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		Query query=	entityManager.createQuery("select t from TeamDto t where categoryType=:category");
		query.setParameter("category", category);
		List<TeamDto> teamDtos= query.getResultList();
		for(TeamDto t:teamDtos) {
			System.out.println(t.getName());
			System.out.println(t.getCaptain());
			System.out.println(t.getCategoryType());
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data by categorytype "+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public List<TeamDto> getCaptainUsingCriteria(String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
		CriteriaBuilder criteriaBuilder=	entityManager.getCriteriaBuilder();
		CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
		Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
		CriteriaQuery query= criteriaQuery.where(criteriaBuilder.equal(root.get("name"), teamName));
		Query query2= entityManager.createQuery(query);
		TeamDto object= (TeamDto) query2.getSingleResult();
		System.out.println(object.getName());
		System.out.println(object.getCaptain());
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public List<TeamDto> getAllteamsUsingCriteria() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
			CriteriaQuery query= criteriaQuery.select(root);
			Query query2= entityManager.createQuery(query);
			List<TeamDto> teams= query2.getResultList();
			for(TeamDto t:teams) {
				System.out.println(t.getCaptain());
				System.out.println(t.getName());
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data :"+e);
		}finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return null;
	}

	public List<Object[]> getCaptainAndNameUsingCriteria() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery= criteriaBuilder.createQuery();
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
			CriteriaQuery query= criteriaQuery.multiselect(root.get("name"),root.get("captain"));
			Query query2= entityManager.createQuery(query);
			List<Object[]> list= query2.getResultList();
			for(Object[] o:list) {
				System.out.println(o[0]);
				System.out.println(o[1]);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}
		return null;
	}

	public List<TeamDto> getTeamByNameMatches(String teamName) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
//			CriteriaQuery query= criteriaQuery.where(criteriaBuilder.like(root.get("name"), teamName+"%"));
			CriteriaQuery query=	criteriaQuery.where(criteriaBuilder.like(root.get("name"),teamName+"%"));
			Query query2= entityManager.createQuery(query);
			List<TeamDto> list= query2.getResultList();
			list.stream().filter(x->x.getCategoryType().equals("Cricket")).map(x->x.getName()).forEach(x->System.out.println(x));
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
	public void getNoOfPlayersLessThan10() {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		try {
			CriteriaBuilder criteriaBuilder= entityManager.getCriteriaBuilder();
			CriteriaQuery criteriaQuery= criteriaBuilder.createQuery(TeamDto.class);
			Root<TeamDto> root= criteriaQuery.from(TeamDto.class);
			CriteriaQuery query= criteriaQuery.where(criteriaBuilder.lessThan(root.get("noOfPlayers"), 10));
			Query query2= entityManager.createQuery(query);
			List<TeamDto> list= query2.getResultList();
			for(TeamDto t:list) {
				System.out.println(t.getName());
				System.out.println(t.getNoOfPlayers());
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception while getting data:"+e);
		}
		
	}

}
