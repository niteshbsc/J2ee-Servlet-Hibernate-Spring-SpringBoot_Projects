package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.jsp.dto.Product;
import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
@Autowired
EntityManager manager;

public User SaveUser(User user) {
	EntityTransaction transaction=manager.getTransaction();
	manager.persist(user);
	transaction.begin();
	transaction.commit();
	return user;
}
public User UpdateUser(User user) {
	EntityTransaction transaction=manager.getTransaction();
	manager.merge(user);
	transaction.begin();
	transaction.commit();
	return user;
}

public User findUserById(int id) {
	return manager.find(User.class, id);
}
public User verifyUser(long phone, String password) {
	Query q =manager.createQuery("select u from User u where u.phone=?1 and u.password=?2");
	q.setParameter(1, phone);
	q.setParameter(2, password);
	try {
		return(User)q.getSingleResult();
	}catch(NoResultException e) {
		return null;
	}
}
	public User verifyUser(String email, String password) {
		Query q1=manager.createQuery("select u from User u where u.email=?1 and u.password=?2");
		q1.setParameter(1, email);
		q1.setParameter(2, password);
		try {
			return(User)q1.getSingleResult();
		}catch(NoResultException e) {
			return null;
		}
	}
public boolean deleteUser(int id) {
	User u=findUserById(id);
	if(u!=null) {
		manager.remove(u);
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		transaction.commit();
		return true;
	}
	return false;
}

public List<Product> viewUser(int id){
	User u=manager.find(User.class, id);
	return u.getP();
}
}
