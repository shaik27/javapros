package org.cts.service;

import org.cts.beans.User;
import org.cts.dao.UserDao;
import org.cts.dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
	UserDao dao=new UserDaoImpl();
	@Override
	public User validateUser(String uname, String pwd) {
		User user=dao.validate(uname, pwd);
		return user;
	}
	@Override
	public boolean register(User user) {
		boolean b=dao.insert(user);
		return b;
	}

}
