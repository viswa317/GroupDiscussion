package com.viswa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viswa.dao.UserDao;
import com.viswa.daoimpl.UserDaoImpl;
import com.viswa.domain.Role;
import com.viswa.domain.User;
import com.viswa.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}

	@Override
	public User findUserById(long id) {
		return userDao.findUserById(id);
	}

	@Override
	public User findUserByUserName(String userName) {
		return userDao.findUserByUserName(userName);
	}

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userDao.deleteUser(user);
	}

	@Override
	public boolean assignRole(User user, Role role) {
		return userDao.assignRole(user, role);
	}

	@Override
	public boolean unAssignRole(User user, Role role) {
		return userDao.unAssignRole(user, role);
	}

	@Override
	public User checkLogin(String userName, String password) {
		return userDao.checkLogin(userName, password);
	}

}
