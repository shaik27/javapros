package org.ksr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("serv")
public class Service {
	@Autowired
	Dao dao;
	public void method()
	{
		dao.method();
	}

}
