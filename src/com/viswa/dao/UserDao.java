package com.viswa.dao;

import java.util.List;
import com.viswa.domain.Role;
import com.viswa.domain.User;

public interface UserDao {
	List<User> findAllUsers();
	User findUserById(long id);
	User findUserByUserName(String userName);
	void saveUser(User user);
	void deleteUser(User user);
	boolean assignRole(User user,Role role);
	boolean unAssignRole(User user, Role role);
	User checkLogin(String userName,String password);
}
