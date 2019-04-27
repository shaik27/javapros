package org.cts.service;

import org.cts.beans.User;

public interface UserService {
	User validateUser(String uname,String pwd);
	boolean register(User user);
}
