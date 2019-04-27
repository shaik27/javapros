package org.cts.dao;

import org.cts.beans.User;

public interface UserDao {
	User validate(String uname,String pwd);
	boolean insert(User user);
}
