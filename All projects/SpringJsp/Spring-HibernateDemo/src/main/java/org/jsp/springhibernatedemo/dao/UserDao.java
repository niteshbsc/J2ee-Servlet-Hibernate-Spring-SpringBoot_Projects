package org.jsp.springhibernatedemo.dao;

import java.util.List;

import org.jsp.springhibernatedemo.dto.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDao extends HibernateDaoSupport {
@Transactional
public User saveUser(User user) {
	getHibernateTemplate().save(user);
	return user;
}
@Transactional
public User updateUser(User user) {
	getHibernateTemplate().update(user);
	return user;
}
@Transactional
public User deleteAllUser(User user) {
	getHibernateTemplate().delete(user);
	return user;
}
@Transactional
public User fetchUser(int id) {
User u=getHibernateTemplate().get(User.class, id);
	return u;
}
@Transactional
public boolean deleteUser(int id) {
	User u=getHibernateTemplate().get(User.class, id);
	if(u!=null) {
		getHibernateTemplate().delete(u);
	}
	return false;
}
@Transactional
public List<User> FetchAllUser(){
	List<User> u=getHibernateTemplate().loadAll(User.class);
	return u;
}

//@Transactional
//public User fetchUserByName(String name) {
//User u=getHibernateTemplate().get(User.class, name);
//	return u;
//}

}