package org.cts.services;

import javax.transaction.Transactional;

import org.cts.beans.Emp;
import org.cts.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDao dao;
	
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	@Transactional
	@Override
	public void register(Emp e) {
		int no=dao.insert(e);
		System.out.println(no+"success");
	}

}
