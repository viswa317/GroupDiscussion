package com.viswa.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.viswa.dao.UserDao;
import com.viswa.domain.Role;
import com.viswa.domain.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		return (List<User>)hibernateTemplate.find("from user");
	}

	@Override
	public User findUserById(long id) {
		return hibernateTemplate.get(User.class, id);
	}

	@Override
	public User findUserByUserName(String userName) {
		@SuppressWarnings("unchecked")
		List<User> users = hibernateTemplate.find("from User as u where u.userName=?",userName);
		if(!users.isEmpty()){
			return users.get(0);
		}
		return null;
	}

	@Override
	public void saveUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

	@Override
	public void deleteUser(User user) {
		hibernateTemplate.delete(user);
	}

	@Override
	public boolean assignRole(User user, Role role) {
		if(user.addToRoles(role)){
			this.saveUser(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean unAssignRole(User user, Role role) {
		if(user.removeFromRoles(role)){
			this.saveUser(user);
			return true;
		}
		return false;
	}

	@Override
	public User checkLogin(String userName, String password) {
		List<User> users = hibernateTemplate.find("from user as u where u.userName=? and u.password=?",userName,password);
		if(!users.isEmpty()){
			return users.get(0);
		}
		return null;
	}

}
