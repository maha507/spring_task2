package spring_task2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring_task2.dto.User;


@Repository
public class Userdao {
	
	@Autowired
	private EntityManager entityManager;
	
	public User saveuser(User user) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
		
	}
	public  List<User> getallUsers(){
		Query query	=entityManager.createQuery("select u from User u");
		return query.getResultList();
	}
	
}
