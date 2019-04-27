package org.cts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("empService")
public class EmpService {
	@Autowired
	EmpDao dao;
	public EmpService() {
		// TODO Auto-generated constructor stub
	}
	public EmpService(EmpDao dao) {
		super();
		this.dao = dao;
	}
	public EmpDao getDao() {
		return dao;
	}
	public void setDao(EmpDao dao) {
		this.dao = dao;
	}
	public String getMessage()
	{
		return dao.getMessage();
	}
	
	
	
}
