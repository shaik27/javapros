package org.cts.service;

import org.cts.model.Emp;

public interface EmpService {
	void insertEmp(Emp e);
	Emp getEmp(int id);
}
