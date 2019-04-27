package org.cts.service;

import javax.transaction.Transactional;

import org.cts.dao.EmpDao;
import org.cts.model.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpDao dao;
	
	public EmpDao getDao() {
		return dao;
	}

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	@Override
	public void insertEmp(Emp e) {
		dao.insert(e);
	}

	@Override
	public Emp getEmp(int id) {
		Emp e=dao.get(id);
		return e;
	}

}
