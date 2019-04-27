package org.cts.service;

import org.cts.beans.Emp;
import org.cts.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("service")
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDao dao1;
	public EmpServiceImpl() {
	}
	
	public EmpDao getDao1() {
		return dao1;
	}

	public void setDao1(EmpDao dao) {
		this.dao1 = dao;
	}

	@Override
	public boolean insert(Emp e) {
		boolean b=dao1.insert(e);
		return b;
	}

}
